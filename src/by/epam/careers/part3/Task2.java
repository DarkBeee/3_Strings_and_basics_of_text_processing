package by.epam.careers.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Дана строка содержащая следующий текст(xml-документ)
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узов xml-документа
 * и его тип(открывающий тег, закрывающий тег, содержимо тега, тег без тела). Пользоваться
 * готовыми парсерами XML для решения данной задачи нельзя.*/
public class Task2 {
    public static void main (String [] args) {
        String xml = "<notes>\n" +
                "\t<note id = \"1\">\n" +
                "\t\t<to>Вася</to>\n" +
                "\t\t<from>Света</from>\n" +
                "\t\t<heading>Напоминание</heading>\n" +
                "\t\t<body>Позвони мне завтра</body>\n" +
                "\t</note>\n" +
                "\t<note id = \"2\">\n" +
                "\t\t<to>Петя</to>\n" +
                "\t\t<from>Маша</from>\n" +
                "\t\t<heading>Важное напоминание</heading>\n" +
                "\t\t<body/>\n" +
                "\t</note>\n" +
                "</notes>";
        parseXML(xml);
    }

    public static void parseXML(String xml) {
        List<String> list = new ArrayList<>();
        Pattern openTag = Pattern.compile("<\\w.+?>");
        Pattern endTag = Pattern.compile("<\\/\\w.+?>");
        Pattern content = Pattern.compile(">.+?<");
        Pattern noBodyTag = Pattern.compile("<.+?\\/>");
        String[] lines = xml.split("\n");
        for (String line : lines) {
            Matcher open = openTag.matcher(line);
            Matcher end = endTag.matcher(line);
            Matcher info = content.matcher(line);
            Matcher noBody = noBodyTag.matcher(line);
            String s = "";
            if (open.find()) {
                s = line.substring(open.start() + 1, open.end() - 1);
            }
            if (info.find()) {
                s += " " + line.substring(info.start() + 1, info.end() - 1);
            }
            //if (end.find()) {
                //s += " " + line.substring(end.start() + 1, end.end() - 1);
            //}
            if (noBody.find()) {
                s += " void";
            }

            list.add(s);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

}



