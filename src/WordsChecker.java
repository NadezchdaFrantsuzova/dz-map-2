import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected Set<String> word;

    public WordsChecker(String text) {
        String[] list = text.split("\\P{IsAlphabetic}+");
        this.word = new HashSet<>();
        Collections.addAll(word, list);
    }

    public boolean hasWord(String o) {
        System.out.println("Есть ли в тексте слово " + o + "?");
        System.out.println(word.contains(o) ? "- Да\n" : "- Нет\n");
        return word.contains(o);
    }
}