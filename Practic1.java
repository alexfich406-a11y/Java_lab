class Parent {
    String name = "Родитель";

    Parent(String name) {
        this.name = name;
    }

    void say() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    String name = "Ребёнок";

    Child(String parentName, String childName) {
        super(parentName); // 1.обращение к конструктору суперкласса
        this.name = childName;
    }

    void show() {
        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + super.name); // 2. Доступ к полю суперкласса
        super.say(); // 3. Доступ к методу суперкласса
    }
}

public class Practic1 {
    public static void main(String[] args) {
        Child child = new Child("Иван", "Петя");
        child.show();
    }
}
