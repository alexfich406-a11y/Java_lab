import java.util.ArrayList;
import java.util.List;

class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";
}

class Puppy extends Dog {
    String name = "Puppy";
}

public class Practic2 {

    static class ExtendsExample<T extends Animal> {
        // <? extends T> позволяет читать объекты как тип T (или его предков)
        public static <T extends Animal> void printNames(List<? extends T> list) {
            for (T animal : list) {
                System.out.println(animal.name);
            }
        }
    }

    static class SuperExample<T> {
        // <? super T> позволяет добавлять объекты типа T (и его наследников) в список
        public static <T> void addAnimals(List<? super T> dest, List<? extends T> src) {
            for (T item : src) {
                dest.add(item);
            }
        }
    }
    //В общем, они нужны для того, чтобы созданный generic класс мог работать со всей иерархией наследования,
    //а не с конкретным T, там где это надо
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ===");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Puppy());

        List<Animal> animals = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        System.out.println("\n=== <? extends T> (Чтение) ===");
        ExtendsExample.printNames(dogs);

        System.out.println("\n=== <? super T> (Запись) ===");
        SuperExample.addAnimals(animals, dogs);
        SuperExample.addAnimals(objects, dogs);

        System.out.println("Animals count: " + animals.size());
        System.out.println("Objects count: " + objects.size());
    }
}
