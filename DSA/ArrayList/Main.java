import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();

        System.out.println("Empty? " + cars.isEmpty());

        cars.add("Tesla");
        cars.add("Lucid");
        cars.add("BYD");
        cars.add("Honda");

        System.out.println("Afer add: " + cars);
        System.out.println("Size " + cars.size());

        String first = cars.get(0);
        System.out.println("First car: " + first);

        cars.set(3, "Rivian");
        System.out.println("After set: " + cars);

        cars.add("Nio");

        System.out.println("After add: " + cars);

        System.out.println("Contains BMW? " + cars.contains("BMW"));

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");

        System.out.println("After add more: " + cars);

        cars.remove("BMW");
        System.out.println("After remove: " + cars);

        cars.remove(6);
        System.out.println("after remove index 6: " + cars);

        boolean hasAudi = cars.contains("Audi");
        System.out.println("Has Audi? " + hasAudi);

        boolean hasMercedes = cars.contains("Mercedes");
        System.out.println("Has Mercedes? " + hasMercedes);

        cars.clear();
        System.out.println("after clear: " + cars + "," + " Empty? " + cars.isEmpty() + "," + " Size: " + cars.size());

        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Chevrolet");

        System.out.println("After add more cars: " + cars);

        cars.add(3, "Lamborghini");
        cars.add(4, "Ferrari");
        cars.add(0, "Rolls Royce");
        cars.add(1, "Masaerati");
        cars.add(2, "Porsche");

        System.out.println("After add more cars at index: " + cars);

        cars.clear();
        System.out.println("after clear: " + cars);

        cars.add("Tesla");
        cars.add("Lucid");
        cars.add("BYD");
        cars.add("Honda");
        System.out.println("Cars list: " + cars);

        // classic for loop
        System.out.println("\n1) Classic for loop:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("index " + i + ": " + cars.get(i));
        }

        // for each loop
        System.out.println("\n2) Enhanced for loop:");
        for (String car : cars) {
            System.out.println(car);
        }

        // iterator
        System.out.println("\n3) Iterator:");
        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            String car = it.next();
            System.out.println(car);
            if (car.equals("Honda")) {
                it.remove();
            }
        }
        System.out.println("After iterator removed Honda: " + cars);

        // forEach method with Lambda
        System.out.println("\n4) forEach method with Lambda:");
        cars.forEach(c -> System.out.println(c));

        // Search in ArrayList

        // contains() method
        System.out.println("\n1) contains() → true/false");
        System.out.println("Contains Tesla? " + cars.contains("Tesla"));
        System.out.println("Contains Honda? " + cars.contains("Honda"));

        // indexOf() method
        System.out.println("\n2) indexOf() → first position");
        System.out.println("First Lucid at index: " + cars.indexOf("Lucid"));

        System.out.println("\n3) lastIndexOf() → last position");
        cars.add("Lucid");
        System.out.println("Last Lucid at index: " + cars.lastIndexOf("Lucid"));

        // isEmpty() method
        System.out.println("\n4) isEmpty() → true/false");
        System.out.println("Is empty? " + cars.isEmpty());

        // size() method
        System.out.println("How many cars? " + cars.size());
        System.out.println("Cars list: " + cars);

        // checking if items exist
        System.out.println("\n5) checking if car exists");
        System.out.println("\n5) Do we have a Bugatti in the list? " + cars.indexOf("Bugatti"));

    }
}