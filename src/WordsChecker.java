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
        if (word.contains(o) == true) {
            System.out.println("- Да\n");
        } else {
            System.out.println(" - Нет\n");
        }
        return word.contains(o);
    }
}