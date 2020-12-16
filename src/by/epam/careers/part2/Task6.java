package by.epam.careers.part2;

/**Из заданной строки получить новую, повторив каждый символ дважды.*/
public class Task6 {
    public static void main(String[] args) {
        String s = "Тестовая строка";
        System.out.println(letter(s));
    }
    public static String letter(String s) {
        int count = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i);
            result += s.charAt(i);
        }
        return result;
    }
}
