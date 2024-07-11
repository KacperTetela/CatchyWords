import catchywords.com.gui.TableFrame;
import catchywords.com.model.WordsCollection;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WordCollectionTests {
    WordsCollection wordsCollection;
    Faker faker;
    TableFrame tableFrame;

    @BeforeTest
    public void setUp(){
        faker = new Faker();
        wordsCollection = WordsCollection.getInstance();
    }

    @Test
    public void testAdding() throws Exception{
        for (int i = 0; i < 10; i++) {
            wordsCollection.addWord(faker.programmingLanguage().name(),faker.programmingLanguage().name());
        }
            tableFrame = new TableFrame();
            Thread.sleep(1000000000);
    }
}
