#!/usr/bin/env bash
set -euo pipefail

LIST_FILE="Leetcode/problem_list.txt"
DEST_DIR="Leetcode"

# Ensure list file exists
if [ ! -f "$LIST_FILE" ]; then
  echo "List file not found: $LIST_FILE"
  exit 1
fi

# Read problem titles, one per line
# - Trim leading/trailing spaces
# - Skip blank lines
# - Sanitize folder names (keep letters/numbers/spaces; then remove spaces)
while IFS= read -r raw || [ -n "$raw" ]; do
  name=$(printf "%s" "$raw" | sed -e 's/^[[:space:]]*//' -e 's/[[:space:]]*$//')
  [ -z "$name" ] && continue

  safe=$(printf "%s" "$name" | tr -cd '[:alnum:] ' | sed -E 's/[[:space:]]+//g')
  dir="$DEST_DIR/$safe"
  file="$dir/Solution.java"
  readme="$dir/README.md"

  mkdir -p "$dir"

  # Create Solution.java if missing
  if [ ! -f "$file" ]; then
    cat > "$file" <<'EOF'
class Solution {
    // TODO: implement
    public static void main(String[] args) {
        System.out.println("Run local tests here.");
    }
}
EOF
  fi

  # Create README stub if missing
  if [ ! -f "$readme" ]; then
    printf "# %s\n\nLink: https://leetcode.com/problems/\n" "$name" > "$readme"
  fi
done < "$LIST_FILE"

echo "Done. Created/updated problem folders under Leetcode/"
