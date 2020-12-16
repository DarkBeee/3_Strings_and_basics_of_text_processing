package by.epam.careers.part2;

import java.util.Arrays;

/**Вводится строка слов, разделённых пробелами. Найти самое длинное слово и вывести его
 * на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/
public class Task8 {
    public static void main(String[] args) {
        String s = "один девять восемь двенадцать тринадцать";
        result(s);
    }
    public static void result(String s) {
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        String max = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length() == arr[i + 1].length()) {
                continue;
            }
            if (arr[i].length() > max.length()) {
                max = arr[i];
            }
        }
        System.out.println("Самое длинное слово \'" + max + "\'");
    }
}


