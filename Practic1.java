class Start {
    public int pubVar = 1;
    protected int prtVar = 2;
    int dftVar = 3;
    private int privVar = 4;

    public void pubMethod() {
        System.out.println("Public method");
    }

    protected void prtMethod() {
        System.out.println("Protected method");
    }

    void dftMethod() {
        System.out.println("Default method");
    }

    private void privMethod() {
        System.out.println("Private method");
    }
}

public class Practic1 {
    public static void main(String[] args) {
        Start start = new Start();

        System.out.println("pubVar = " + start.pubVar);
        start.pubMethod();

        System.out.println("prtVar = " + start.prtVar);
        start.prtMethod();

        System.out.println("dftVar = " + start.dftVar);
        start.dftMethod();

        System.out.println("privVar недоступен из другого класса");
    }
}
