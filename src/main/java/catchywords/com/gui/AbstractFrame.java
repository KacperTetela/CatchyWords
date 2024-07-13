package catchywords.com.gui;

import javax.swing.*;
import java.awt.*;

public class AbstractFrame extends JFrame {

    public AbstractFrame(String title, LayoutManager layoutManager) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(layoutManager);
        setResizable(true);
        setLocation(600, 200);
/*        setLocation(0, 0);*/
        setVisible(true);
    }

    public AbstractFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(true);
        setLocation(600, 200);
        setVisible(true);
    }
}
