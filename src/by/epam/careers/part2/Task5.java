package by.epam.careers.part2;

/**Подсчитать, сколько раз среди символов заданной строки встречается буква "а".*/
public class Task5 {
    public static void main(String[] args) {
        String s = "арабика";
        System.out.println(letter(s));
    }
    public static String letter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'а') {
                count++;
            }
        }
        return "В строке \"" + s + "\" буква \"а\" встречается " + count + " раз(a).";
    }
}
