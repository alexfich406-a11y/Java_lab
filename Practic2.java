class Animal {
    String speak() {
        return "Животное издаёт звук";
    }
}

class Dog extends Animal {
    @Override
    String speak() {
        return "Гав!";
    }
}

public class Practic2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        System.out.println(animal.speak());
        System.out.println(dog.speak());
    }
}
