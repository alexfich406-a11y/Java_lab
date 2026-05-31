class Parent {
    void print(String name) {
        System.out.println("Hello, " + name);
    }
}

class Child extends Parent {
    // Ошибка компиляции: 
    /*
    @Override
    void print(int name) {
        System.out.println("Hi, " + name);
    }
    */

    // возникнет ошибка компиляции, так как переопределённый метод не совпадает с переопределяемым, если бы не было бы аннотации, то компилятор посчитал бы это перегрузкой
    void print(int name) {
        System.out.println("Hi, " + name);
    }
}

public class Practic3 {
    public static void main(String[] args) {
        Parent child = new Child();
        child.print("World");
    }
}
