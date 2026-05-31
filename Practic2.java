final class FinalClass {
    private String data;

    public FinalClass(String data) {
        this.data = data;
    }

    public void showInfo() {
        System.out.println("Data: " + data);
    }
}

// Ошибка компиляции:
/*
class ExtendedClass extends FinalClass {
    public ExtendedClass(String data) {
        super(data);
    }

    public void additionalMethod() {
        System.out.println("Additional functionality");
    }
}
*/

public class Practic2 {
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass("Hello World");
        finalObj.showInfo();
    }
}
