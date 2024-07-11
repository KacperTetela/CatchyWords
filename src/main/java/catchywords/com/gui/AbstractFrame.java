package catchywords.com.gui;

import javax.swing.*;
import java.awt.*;

public class AbstractFrame extends JFrame {

    public AbstractFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
        setResizable(false);
        setLocation(600, 200);
        setSize(800,580);
    }
}
