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

    }
}