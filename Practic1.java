public class Practic1 {
    public static void main(String[] args) {
        String text = "Hello WoRld!";
        
        System.out.println("Длина: " + text.length());//length() - длина строки
        
        System.out.println("Большие: " + text.toUpperCase());//toUpperCase() - в большие буквы

        System.out.println("Маленькие: " + text.toLowerCase());//toLowerCase() - в маленькие буквы

        System.out.println("Первый символ: " + text.charAt(0));//charAt() - символ по номеру

        System.out.println("С 8 символа: " + text.substring(8));//substring() - часть строки
        System.out.println("С 0 по 6: " + text.substring(0, 6));

        System.out.println("Есть 'WoRld!'? " + text.contains("WoRld!"));//contains() - проверяет есть ли слово
        System.out.println("Есть 'Python'? " + text.contains("Python"));

        System.out.println("Заменить e на E: " + text.replace('e', 'E')); //replace() - заменить

        String text2 = "Hello world!";
        System.out.println("Равны? " + text.equals(text2));//equals() - сравнить

        System.out.println("Равны без учета регистра? " + text.equalsIgnoreCase(text2));//equalsIgnoreCase() - сравнить без учета больших/маленьких

        String text3 = "   много пробелов   ";
        System.out.println("Без пробелов: '" + text3.trim() + "'");//trim() - убрать пробелы по краям
    }
}
