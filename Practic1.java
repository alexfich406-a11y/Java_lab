enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда");

    private final String name;

    Day(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

enum Numbers {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4);

    private final int value;

    Numbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Practic1 {
    public static void main(String[] args) {
        System.out.println("Дни недели");
        for (Day day : Day.values()) {
            System.out.println(day + " -> " + day.getName());
        }

        System.out.println("\nЧисла");
        for (Numbers num : Numbers.values()) {
            System.out.println(num + " -> " + num.getValue());
        }
        
        System.out.println("\nКонкретный день: " + Day.MONDAY.getName());
        System.out.println("Конкретное число: " + Numbers.THREE.getValue());
    }
}
