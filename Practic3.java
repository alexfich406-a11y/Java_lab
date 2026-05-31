class Container {
    private String outerField = "Outer field";

    public class PublicInternal {
        public String publicInternalField = "Public Internal field";
        private String privateInternalField = "Private Internal field";
        
        public void publicInternalMethod() {
            System.out.println("Public Internal method");
        }
        
        private void privateInternalMethod() {
            System.out.println("Private Internal method");
        }
    }
    
    private class PrivateInternal {
        public String InternalField = "Private Internal field";
        
        public void show() {
            System.out.println("From private Internal: " + outerField);
        }
    }
    
    public void accessInternalClasses() {
        System.out.println("Outer accessing Internal classes:");
        
        PublicInternal publicInternal = new PublicInternal();
        PrivateInternal privateInternal = new PrivateInternal();
        
        // public
        System.out.println(publicInternal.publicInternalField);
        publicInternal.publicInternalMethod();
        
        // private методы и поля
        // System.out.println(publicInternal.privateInternalField); // Ошибка компиляции
        // publicInternal.privateInternalMethod(); // Ошибка компиляции
        
        // private класс
        System.out.println(privateInternal.InternalField);
        privateInternal.show();
    }
    
    public PublicInternal getPublicInternal() {
        return new PublicInternal();
    }
    
    public PrivateInternal getPrivateInternal() {
        return new PrivateInternal();
    }
}

public class Practic3 {
    public static void main(String[] args) {
        Container outer = new Container();
        outer.accessInternalClasses();
    }
}
