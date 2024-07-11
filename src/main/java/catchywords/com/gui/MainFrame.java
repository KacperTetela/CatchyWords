package catchywords.com.gui;

import catchywords.com.model.WordsCollection;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends AbstractFrame{

    public MainFrame() {
        super("Catchy Words");
        JLabel wordsNumber = new JLabel("Words counter: " + WordsCollection.getInstance().getWords().size());
        add(wordsNumber);
        JButton addWordButton = new JButton("Add Word");
        add(addWordButton);
    }
}
