import catchywords.com.gui.AddWordFrame;
import catchywords.com.gui.MainFrame;
import catchywords.com.gui.TableFrame;
import catchywords.com.model.WordsCollection;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GUITests {
    private WordsCollection wordsCollection;
    private Faker faker = new Faker();
    private TableFrame tableFrame;

    @BeforeTest
    public void setUp() {
        wordsCollection = WordsCollection.getInstance();
    }

    @Test
    public void createFirstFrame() throws Exception {
        MainFrame mainFrame = new MainFrame();
        Thread.sleep(1000000000);
    }

    @Test
    public void createFirstTable() throws Exception {
        tableFrame = new TableFrame();
        Thread.sleep(1000000000);
    }

    @Test
    public void testAdding() throws Exception {
        for (int i = 0; i < 10; i++) {
            wordsCollection.addWord(faker.programmingLanguage().name(), faker.programmingLanguage().name());
        }
        tableFrame = new TableFrame();
        Thread.sleep(1000000000);
    }

    @Test
    public void addingWindowsSetup() throws Exception{
        AddWordFrame addWordFrame = new AddWordFrame("AddingWindow");
        Thread.sleep(1000000);
    }
}
