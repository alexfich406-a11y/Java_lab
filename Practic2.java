class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat meows: Meow!");
    }
}

public class Practic2 {

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        System.out.println(animal1 instanceof Animal); // true
        System.out.println(animal1 instanceof Dog);    // true

        if (animal1 instanceof Dog) {
            System.out.println("It's a Dog!");
        }

        if (animal2 instanceof Cat) {
            System.out.println("It's a Cat!");
        }

        // Проверка на null
        Animal nullAnimal = null;
        System.out.println(nullAnimal instanceof Dog); // false
        
    }
}
