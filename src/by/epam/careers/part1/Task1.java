package by.epam.careers.part1;

/**Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/
public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"stringOne", "stringTwo", "stringThree", "stringFour", "stringFive"};
        System.out.println("camelCase: ");
        for (String a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
        snakeCase(arr);
    }
    private static void snakeCase(String[] arr) {
        System.out.println("snake_case: ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < arr[i].length(); j++) {
                char symbol = arr[i].charAt(j);
                if (!Character.isLowerCase(symbol)) {
                    s.append('_');
                    s.append(Character.toLowerCase(symbol));
                } else {
                    s.append(symbol);
                }
            }
            System.out.print(s.toString() + ", ");
        }
    }
}
