class Animal {
    public final void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating dog food");
    }

    // Ошибка компиляции: Cannot override the final method from Animal
    /*
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    */
}

public class Practic1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.makeSound();
        dog.eat();    
    }
}
