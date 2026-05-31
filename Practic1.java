import java.util.Objects;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
// должны выполняться транзитивность, рефлексивность, симметричность, согласованность, сравнение с null
public class Practic1 {
    public static void main(String[] args) {
        Person p1 = new Person("Иван", 25);
        Person p2 = new Person("Иван", 25);
        Person p3 = new Person("Иван", 25);
        Person p4 = new Person("Петя", 30);

        System.out.println(" Рефлексивность: x.equals(x) == true ");
        System.out.println(p1.equals(p1)); // true

        System.out.println("\n Симметричность: x.equals(y) == y.equals(x) ");
        System.out.println(p1.equals(p2)); // true
        System.out.println(p2.equals(p1)); // true

        System.out.println("\n Транзитивность: x.equals(y) && y.equals(z) => x.equals(z) ");
        System.out.println(p1.equals(p2)); // true
        System.out.println(p2.equals(p3)); // true
        System.out.println(p1.equals(p3)); // true

        System.out.println("\n Согласованность: повторные вызовы дают одинаковый результат ");
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p2)); // true

        System.out.println("\n Сравнение с null: x.equals(null) == false ");
        System.out.println(p1.equals(null)); // false

        System.out.println("\n Несовпадение ");
        System.out.println(p1.equals(p4)); // false
    }
}
