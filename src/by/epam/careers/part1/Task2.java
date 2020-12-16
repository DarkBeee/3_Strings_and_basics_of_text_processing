package by.epam.careers.part1;

/**Заменить в строке все вхождения 'word' на 'letter'.*/
public class Task2 {
    public static void main(String[] args) {
        String s1 = "word word latter word word";
        String s2 = s1.replace("word", "letter");
        System.out.println(s2);
    }
}

