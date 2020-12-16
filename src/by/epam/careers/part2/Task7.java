package by.epam.careers.part2;

/**Вводится строка. Требуется удалить из неё повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".*/
public class Task7 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abc cde def gew tyu gop");
        System.out.println(s);
        System.out.println(result(s));
    }
    public static StringBuilder result(StringBuilder s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                s.deleteCharAt(i);
                i--;
                continue;
            }
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    s.deleteCharAt(j);
                }
            }
        }
        return s;
    }
}


