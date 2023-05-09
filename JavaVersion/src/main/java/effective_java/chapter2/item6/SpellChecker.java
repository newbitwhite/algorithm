package effective_java.chapter2.item6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author ：xiaobai
 * @date ：2023/5/5 11:01
 */
public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary, "字典不能为空");
    }

    public static void isValid(String work){

    }

    public static List<String> suggestions(String work){
        return new ArrayList<>();
    }



    public static void main(String[] args) {
        System.out.println(new SpellChecker(new Lexicon()));
        System.out.println(new SpellChecker(null));
    }
}
