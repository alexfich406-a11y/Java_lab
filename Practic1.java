
public class Practic1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        sb.append(" World");//append() - добавить в конец
        System.out.println("1. append(): " + sb);
        
        sb.insert(5, " Java");
        System.out.println("2. insert(): " + sb);//insert() - вставить в середину
        
        sb.delete(5, 10);
        System.out.println("3. delete(): " + sb);//delete() - удалить часть
        
        sb.reverse();
        System.out.println("4. reverse(): " + sb);//reverse() - перевернуть строку
        
        sb.reverse();
        System.out.println("5. reverse() обратно: " + sb);
        
        sb.replace(6, 11, "Java");
        System.out.println("6. replace(): " + sb);//replace() - заменить часть
        
        System.out.println("7. charAt(0): " + sb.charAt(0));//charAt() - получить символ по индексу
        
        System.out.println("8. length(): " + sb.length());//length() - получить длину
        
        sb.setCharAt(0, 'h');
        System.out.println("9. setCharAt(): " + sb);//setCharAt() - изменить один символ
        
        System.out.println("10. substring(0,5): " + sb.substring(0, 5));//substring() - получить часть строки
        
        System.out.println("11. capacity(): " + sb.capacity());//capacity() - получить емкость
        
        System.out.println("12. toString(): " + sb.toString());//toString - получения строкового представления объекта
    }
}
