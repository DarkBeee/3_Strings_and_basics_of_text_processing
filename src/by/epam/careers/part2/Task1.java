package by.epam.careers.part2;

/**Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нём.*/
public class Task1 {
    public static void main(String[] args) {
        String s = " Строка   с        пробелами.   ";
        maximumSpace(s);
    }
    public static void maximumSpace(String s) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                continue;
            }
            if (count > max) {
                max = count;
            }
            count = 0;
        }
        System.out.println("Наибольшее количество подряд идущих пробелов: " + max);
    }
}
