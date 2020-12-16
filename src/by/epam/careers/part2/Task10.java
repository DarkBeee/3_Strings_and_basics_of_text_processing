package by.epam.careers.part2;

/**Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X.*/
public class Task10 {
    public static void main(String[] args) {
        String s = "Строка X состоит из нескольких предложений! каждое из которых кончается точкой, " +
                "восклицательным или вопросительным знаком! Определить количество. предложений в строке X?";
        result(s);
    }
    public static void result(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == '?') {
                count++;
                }
        }
        System.out.println("Количество предложений в строке: " + count);
    }
}
