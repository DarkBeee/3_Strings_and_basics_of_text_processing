package by.epam.careers.part2;

/**Проверить, является ли заданное слово палиндромом.*/
public class Task3 {
    public static void main(String[] args) {
        String s = "SATOR AREPO TENET OPERA ROTAS";
        String str = "Для примера";
        palindrome(s);
        palindrome(str);
    }
    public static void palindrome(String s) {
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        if (s.equals(s2)) {
            System.out.println("Заданное слово является палиндромом:");
            System.out.println(s);
            System.out.println(s2);
        } else {
            System.out.println("Заданное слово неявляется палиндромом:");
            System.out.println(s);
            System.out.println(s2);
        }
    }
}


