import java.util.ArrayList;
import java.util.List;

class Fruit {
    public String toString() { return "Fruit"; }
}

class Apple extends Fruit {
    public String toString() { return "Apple"; }
}

class Mango extends Fruit {
    public String toString() { return "Mango"; }
}

class Car {
    public String toString() { return "Car"; }
}

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
        System.out.println("Added: " + fruit);
    }

    public void displayFruits() {
        System.out.println("--- Fruits in Box ---");
        for (T fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

public class FruitStorage {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple());
        
        // This line would cause a compile error:
        // appleBox.addFruit(new Mango()); 

        FruitBox<Fruit> genericFruitBox = new FruitBox<>();
        genericFruitBox.addFruit(new Apple());
        genericFruitBox.addFruit(new Mango());
        genericFruitBox.displayFruits();

        // This line would cause a compile error, as Car does not extend Fruit
        // FruitBox<Car> carBox = new FruitBox<>();
        // carBox.addFruit(new Car());
    }
}
