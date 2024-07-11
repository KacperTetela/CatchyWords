package catchywords.com.model;

import java.util.ArrayList;
import java.util.List;

public class WordsCollection {
    private static final WordsCollection wordsCollection = new WordsCollection();
    private List<Word> words;

    private WordsCollection() {
        words = new ArrayList<>();
    }

    public static WordsCollection getInstance() {
        return wordsCollection;
    }

    public List<Word> getWords() {
        return words;
    }

    public void addWord(String englishMeaning, String polishMeaning) {
        words.add(new Word(englishMeaning, polishMeaning));
    }

    @Override
    public String toString() {
        String path = "";
        for (Word word : words) {
            path += ("\n" + word.toString());
        }
        return path;
    }
}
