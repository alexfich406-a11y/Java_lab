public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void callFromStatic() {
        printVars();
    }
    
    public void callFromInstance() {
        printVars();
    }
}

public class Practic1 {
	  public static void main(String[] args){
        A.printVars();
      
        A obj = new A();
        obj.printVars(); 
        A.callFromStatic();
        obj.callFromInstance();
    }
}
