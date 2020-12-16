package by.epam.careers.part3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с
 * текстом три различные операции: отсортировать абзацы по количеству предложений; в каждом
 * предложении отсортировать слова по длине; отсортировать лексемы в предложении по убыванию
 * количества вхождений заданного символа, а в случае равенства - по алфавиту.*/
public class Task1 {
    public static void main(String[] args) {
        String text = "Java is a class-based, object-oriented programming language that is " +
                "designed to have as few implementation dependencies as possible. It is a " +
                "general-purpose programming language intended to let application developers " +
                "write once, run anywhere (WORA), meaning that compiled Java code can run on " +
                "all platforms that support Java without the need for recompilation. Java " +
                "applications are typically compiled to bytecode that can run on any Java " +
                "virtual machine (JVM) regardless of the underlying computer architecture. The " +
                "syntax of Java is similar to C and C++, but has fewer low-level facilities than " +
                "either of them. The Java runtime provides dynamic capabilities (such as " +
                "reflection and runtime code modification) that are typically not available in " +
                "traditional compiled languages. As of 2019, Java was one of the most popular " +
                "programming languages in use according to GitHub, particularly for " +
                "client-server web applications, with a reported 9 million developers.\n" +
                "Java was originally developed by James Gosling at Sun Microsystems (which has " +
                "since been acquired by Oracle) and released in 1995 as a core component of Sun " +
                "Microsystems' Java platform. The original and reference implementation Java " +
                "compilers, virtual machines, and class libraries were originally released by " +
                "Sun under proprietary licenses. As of May 2007, in compliance with the " +
                "specifications of the Java Community Process, Sun had relicensed most of its " +
                "Java technologies under the GNU General Public License. Oracle offers its own " +
                "HotSpot Java Virtual Machine, however the official reference implementation is " +
                "the OpenJDK JVM which is free open source software and used by most developers " +
                "including the Eclipse IDE and is the default JVM for almost all Linux " +
                "distributions.";
        List<String> paragraphsByNumberOfSentences = sortParagraphsByNumberOfSentences(text);
        print(paragraphsByNumberOfSentences);

        List<String> sentencesByWordLength = sortSentencesByWordLength(text);
        print(sentencesByWordLength);

        List<String> lexeme = getLexeme(text);
        print(lexeme);


    }

    public static List<String> getLexeme(String text) {
        List<String> lexeme = new ArrayList<String>();
        String wordLexeme = "(|^)\\S*develop\\S*\\b(|^)";
        Pattern pattern = Pattern.compile(wordLexeme);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            lexeme.add(text.substring(matcher.start(), matcher.end()));
        }
        lexeme.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        return lexeme;
    }

    public static List<String> sortSentencesByWordLength(String text) {
        Pattern pattern = Pattern.compile("[^.!?]*[.!?]");
        List<String> sentences = new ArrayList<>();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            sentences.add(text.substring(matcher.start(), matcher.end()));
        }
        for (int i = 0; i < sentences.size(); i++) {
            String sort = getWordByLength(sentences.get(i));
            sentences.set(i, sort);
        }
        return sentences;
    }

    public static String getWordByLength(String sentence) {
        Pattern patternWord = Pattern.compile("\\b\\w+");
        List<String> word = new ArrayList<>();
        Matcher matcherWord = patternWord.matcher(sentence);
        while (matcherWord.find()) {
            word.add(sentence.substring(matcherWord.start(), matcherWord.end()));
        }
        word.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        String s = "";
        for (String sen : word) {
            s += sen + " ";
        }
        return s;
    }

    public static List<String> sortParagraphsByNumberOfSentences(String text) {
        Pattern patternPar = Pattern.compile("^.+");
        Matcher matcherPar = patternPar.matcher(text);
        List<String> paragraphs = new ArrayList<String>();
        while (matcherPar.find()) {
            paragraphs.add(text.substring(matcherPar.start(), matcherPar.end()));
            paragraphs.add(text.substring(matcherPar.end() + 1));
        }
        for (int i = paragraphs.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (getNumberOfSentencesInParagraphs(paragraphs.get(j)) >
                        getNumberOfSentencesInParagraphs(paragraphs.get(j + 1))) {
                    String s = paragraphs.get(j + 1);
                    paragraphs.set(j + 1, paragraphs.get(j));
                    paragraphs.set(j, s);
                }
            }
        }
        return paragraphs;
    }

    public static int getNumberOfSentencesInParagraphs(String paragraphs) {
        Pattern pattern = Pattern.compile("[^.!?]*[.!?]");
        List<String> sentences = new ArrayList<>();
        Matcher matcher = pattern.matcher(paragraphs);
        while (matcher.find()) {
            sentences.add(paragraphs.substring(matcher.start(), matcher.end()));
        }
        return sentences.size();
    }

    public static void print(List<String> text) {
        for (String str : text) {
            System.out.println(str);
        }
    }

    public static void print(String message, List<String> text) {
        System.out.println(message);
        for (String str : text) {
            System.out.println(str);
        }
    }
}
