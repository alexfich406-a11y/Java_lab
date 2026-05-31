interface MBase {

    default void sayHello() {
        System.out.println("default method!");
    }

    static void sayGoodbye() {
        System.out.println("static method!");
    }
}

class Base implements MBase {
}


public class Practic1 {
    public static void main(String[] args) {
        Base greeter = new Base();
        
        greeter.sayHello(); 
        
        MBase.sayGoodbye(); 

        // Base.sayGoodbye();
    }
}
