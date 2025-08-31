#!/usr/bin/env bash
set -euo pipefail

LIST_FILE="Leetcode/problem_list.txt"
DEST_DIR="Leetcode"

read -r -d '' JAVA_TEMPLATE <<'JEOF'
class Solution {
    // TODO: implement
    public static void main(String[] args) {
        System.out.println("Run local tests here.");
    }
}
JEOF

[[ -f "$LIST_FILE" ]] || { echo "List file not found: $LIST_FILE"; exit 1; }

while IFS= read -r raw || [[ -n "$raw" ]]; do
  name="${raw#"${raw%%[![:space:]]*}"}"
  name="${name%"${name##*[![:space:]]}"}"
  [[ -z "$name" ]] && continue

  # make a safe folder name (remove spaces/punctuation)
  safe="$(echo "$name" | tr -cd '[:alnum:] ' | sed -E 's/[[:space:]]+//g')"
  dir="$DEST_DIR/$safe"
  file="$dir/Solution.java"

  mkdir -p "$dir"
  [[ -f "$file" ]] || printf "%s\n" "$JAVA_TEMPLATE" > "$file"
  [[ -f "$dir/README.md" ]] || printf "# %s\n\nLink: https://leetcode.com/problems/\n" "$name" > "$dir/README.md"
done < "$LIST_FILE"

echo "Done. Created/updated problem folders under $DEST_DIR/"

