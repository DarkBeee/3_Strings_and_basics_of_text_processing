package by.epam.careers.part1;

/**В строке найти количество чисел.*/
public class Task4 {
    public static void main(String[] args) {
        String s = "852Стр04ка с 54 ц44слам456";
        findNumber(s);
    }
    public static void findNumber(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (Character.isDigit(s.charAt(i + 1))) {
                }
                else { count++; }
            }
        }
        if (Character.isDigit(s.charAt(s.length() - 1))) {
            count++;
        }
        System.out.println("В строке " + count + " цифр.");
    }
}