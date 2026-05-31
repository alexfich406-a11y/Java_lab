class Container {
    private String privateField = "private field";
    protected String protectedField = "protected field";
    String packageField = "package field";
    public String publicField = "public field";
    
    private void privateMethod() {
        System.out.println("Private method");
    }
    
    public void publicMethod() {
        System.out.println("Public method");
    }
    
    class InternalClass {
        public void accessContainer() {
            System.out.println("Accessing from InternalClass:");
            System.out.println(privateField);    // private
            System.out.println(protectedField);  // protected  
            System.out.println(packageField);    // default
            System.out.println(publicField);     // public
            
            privateMethod();  // private
            publicMethod();   // public

            System.out.println("Container reference: " + Container.this);
        }
    }
    
    public void createInternalClass() {
        InternalClass InternalClass = new InternalClass();
        InternalClass.accessContainer();
    }
}
//Внутренний класс имеет доступ ко всем полями и методам независимо от спецификатора
public class Practic2 {
    public static void main(String[] args) {
        Container Container = new Container();
        Container.createInternalClass();

        Container.InternalClass InternalClass = Container.new InternalClass();
        InternalClass.accessContainer();
    }
}
