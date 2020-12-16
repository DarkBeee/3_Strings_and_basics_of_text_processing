package by.epam.careers.part1;

/**В строке найти количество цифр.*/
public class Task3 {
    public static void main(String[] args) {
        String s = "82Стр7ока с 5 ц4фра6ми";
        findDigit(s);
    }
    public static void findDigit(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (symbol == '0' || symbol == '2' || symbol == '3' ||
                    symbol == '4' || symbol == '5' || symbol == '6'
                    || symbol == '7' || symbol == '8' || symbol == '9') {
                count++;
            }
        }
        System.out.println("В строке " + count + " цифр.");
    }
}
