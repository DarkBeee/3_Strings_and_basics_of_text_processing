package by.epam.careers.part2;

/**С помощью функции копирования и операции конкатенации
 * составить из частей слова "информатика" слово "торт".*/
public class Task4 {
    public static void main(String[] args) {
        String s = "информатика";
        System.out.println(result(s));
    }
    public static String result(String s) {
        String result = "";
        result += s.charAt(s.indexOf("т"));
        result += s.charAt(s.indexOf("о"));
        result += s.charAt(s.indexOf("р"));
        result += s.charAt(s.indexOf("т"));
        return result;
    }
}
