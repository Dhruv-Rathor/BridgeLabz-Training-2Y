import java.util.List;
import java.util.Arrays;

class Animal {
    private String name;
    public Animal(String name) { this.name = name; }
    public String toString() { return "Animal: " + name; }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
    public String toString() { return "Dog: " + super.toString().substring(8); }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }
    public String toString() { return "Cat: " + super.toString().substring(8); }
}

public class AnimalHierarchy {

    public static void printAnimals(List<? extends Animal> animals) {
        System.out.println("--- Animal List ---");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog("Buddy"), new Dog("Lucy"));
        List<Cat> cats = Arrays.asList(new Cat("Milo"), new Cat("Luna"));

        printAnimals(dogs);
        printAnimals(cats);
    }
}
