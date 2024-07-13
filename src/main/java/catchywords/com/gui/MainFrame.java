package catchywords.com.gui;

import catchywords.com.model.WordsCollection;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends AbstractFrame{
    private JButton addWordButton = new JButton("Add Word");
    private JButton preview = new JButton("Preview");
    private JButton playCatchWords = new JButton("Play Catching Words");
    private JButton playCompleteOnTheOtherSide = new JButton("Play Completing On The Other Side");

    public MainFrame() {
        super("Catchy Words");
        JLabel wordsNumber = new JLabel("Words counter: " + WordsCollection.getInstance().getWords().size());
        add(wordsNumber);
        add(addWordButton);
        addWordButton.addActionListener(e -> new AddWordFrame());
        add(preview);
        preview.addActionListener(e -> new TableFrame());
        add(playCatchWords);
        add(playCompleteOnTheOtherSide);
    }
}
