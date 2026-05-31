class Sportsman{
    double time;
    double speed;

    double distance()
    {
        return 0;
    }
    double distance(double time, double speed)
    {
        return time * speed;
    }
}

class Runner extends Sportsman{
    static int road = 5;
    
    @Override
    double distance(double time, double speed)
    {
        return road * time * speed;
    }
}

public class Practic1 {
    public static void main(String[] args) {
        Sportsman sportsman = new Sportsman();
        Runner runner = new Runner();

        System.out.println("Sportsman distance (no args): " + sportsman.distance());
        System.out.println("Sportsman distance (10s, 5m/s): " + sportsman.distance(10, 5));
        System.out.println("Runner distance (10s, 5m/s): " + runner.distance(10, 5));
        
        Sportsman pol = new Runner();
        System.out.println("Pol distance (10s, 5m/s): " + pol.distance(10, 5));
    }
}
