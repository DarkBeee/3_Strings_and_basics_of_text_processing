package by.epam.careers.part1;

/**Удалить в строке все лишние пробелы, то ести серии подряд идущих пробелов
 * заменить на одиночные пробелы. Крайние в строке пробелы удалить.*/
public class Task5 {
    public static void main(String[] args) {
        String s = " Строка   с   пробелами.   ";
        s.trim();
        deleteSpace(s);
    }
    public static void deleteSpace(String s) {
        String s2 = "";
        for (int i = 0; i < s.length() - 1; i++) {
            char symbolone = s.charAt(i);
            char symboltwo = s.charAt(i + 1);
            if (symbolone != ' ') {
                s2 += symbolone;
            }
            if (symbolone == ' ') {
                if (symboltwo == ' ') {
                }
                else {
                    s2 += symbolone;
                }
            }
        }
        System.out.println(s2);
    }
}
