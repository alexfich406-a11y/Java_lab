class Parent {
    public void display() {
        System.out.println("Parent method");
    }
    
    @Deprecated //Помечает метод как устаревший, при вызове напрямую выдаст предупреждение
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

class Child extends Parent {
    @Override // Помечает, что старый метод переопределен 
    public void display() {
        System.out.println("Child method");
    }

    @SuppressWarnings("deprecation") //Убирает предупреждение об устаревшести метода (конкретное предупреждение)
    public void useDeprecatedMethod() {
        oldMethod();
    }
}
public class Practic1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        
        child.useDeprecatedMethod(); 
        
        @SuppressWarnings("unchecked")
        java.util.List<String> list = new java.util.ArrayList();
    }
}
