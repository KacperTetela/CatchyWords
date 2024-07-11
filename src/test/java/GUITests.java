import catchywords.com.gui.MainFrame;
import catchywords.com.gui.TableFrame;
import org.testng.annotations.Test;

public class GUITests {
    MainFrame mainFrame;
    TableFrame tableFrame;

    @Test
    public void createFirstFrame() throws Exception{
        mainFrame = new MainFrame();
        Thread.sleep(1000000000);
    }

    @Test
    public void createFirstTable() throws Exception{
        tableFrame = new TableFrame();
        Thread.sleep(1000000000);
    }
}
