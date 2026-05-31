interface Runner {
    default void train() {
        System.out.println("Running on the track");
    }
}

interface Swimmer {
    default void train() {
        System.out.println("Swimming in the pool");
    }
}

// Класс, который полностью переопределяет метод, игнорируя реализации интерфейсов
class Sportsman1 implements Runner, Swimmer {
    @Override
    public void train() {
        System.out.println("Training as a professional sportsman!"); // Полностью новая реализация
    }
}

// Класс, который выбирает реализацию только одного из интерфейсов
class Sportsman2 implements Runner, Swimmer {
    @Override
    public void train() {
        Runner.super.train(); // Явно вызываем метод из интерфейса Runner
    }
}

// Класс, который комбинирует поведение обоих интерфейсов
class Sportsman3 implements Runner, Swimmer {
    @Override
    public void train() {
        System.out.println("Starting complex training session...");
        Runner.super.train();  
        Swimmer.super.train(); 
    }
}

public class Practic2 {

    public static void main(String[] args) {
        System.out.println("____ Sportsman 1 ____");
        Sportsman1 s1 = new Sportsman1();
        s1.train();
        
        System.out.println("\n____ Sportsman 2 ____");
        Sportsman2 s2 = new Sportsman2();
        s2.train();
        
        System.out.println("\n____ Sportsman 3 ____");
        Sportsman3 s3 = new Sportsman3();
        s3.train();
    }
}
