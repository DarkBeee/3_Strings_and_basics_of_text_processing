package by.epam.careers.part2;

/**Посчитать количество строчных (маленьких) и прописных (больших)
 * букв в введённой строке. Учитывать только английские буквы.*/
public class Task9 {
    public static void main(String[] args) {
        String s = "AbC DefGtQW erYWasDasf";
        result(s);
    }
    public static void result(String s) {
        String[] arr = s.split(" ");
        int countlow = 0;
        int countupp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isLowerCase(arr[i].charAt(j))) {
                    countlow++;
                } else if (!Character.isLowerCase(arr[i].charAt(j))) {
                    countupp++;
                }
            }
        }
        System.out.println("Количество строчных букв: " + countlow);
        System.out.println("Количество прописных букв: " + countupp);
    }
}
