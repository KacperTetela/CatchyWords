import catchywords.com.gui.TableFrame;
import catchywords.com.model.WordsCollection;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WordCollectionTests {
    WordsCollection wordsCollection;
    Faker faker;

    @BeforeTest
    public void setUp() {
        faker = new Faker();
        wordsCollection = WordsCollection.getInstance();
    }

    @Test
    public void add100Words() {
        for (int i = 0; i < 100; i++) {
            wordsCollection.addWord(faker.programmingLanguage().name(), faker.programmingLanguage().name());
        }
        wordsCollection.getWords().forEach(System.out::println);
    }
}
