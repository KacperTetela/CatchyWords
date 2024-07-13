package catchywords.com.gui;

import catchywords.com.model.WordsCollection;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class AddWordFrame extends AbstractFrame {
    private JTextField englishMeaningField = new JTextField();
    private JTextField polishMeaningField = new JTextField();
    private JLabel englishMeaningLabel = new JLabel("English Meaning", SwingConstants.CENTER);
    private JLabel polishMeaningLabel = new JLabel("Polish Meaning", SwingConstants.CENTER);
    private JButton cancel = new JButton("Cancel");
    private JButton submit = new JButton("Submit");
    private JPanel leftPanel = new JPanel();
    private JPanel rightPanel = new JPanel();
    private JPanel lowerButtons = new JPanel();

    public AddWordFrame() {
        super("Please enter word", null);
        setSize(400, 168);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        leftPanel.setLayout(new GridLayout(2, 1));
        rightPanel.setLayout(new GridLayout(2, 2));
        lowerButtons.setLayout(new FlowLayout());

        leftPanel.setBounds(0, 0, 200, 90);
        rightPanel.setBounds(200, 0, 200, 90);
        lowerButtons.setBounds(0, 90, 400, 50);

        leftPanel.add(englishMeaningLabel);
        rightPanel.add(polishMeaningLabel);

        leftPanel.add(englishMeaningField);
        rightPanel.add(polishMeaningField);

        lowerButtons.add(cancel);
        lowerButtons.add(submit);

        leftPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        rightPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        lowerButtons.setBorder(new EmptyBorder(10, 200, 40, 10));

        cancel.addActionListener(e -> this.setVisible(false));
        submit.addActionListener(e -> submitAdd());

        add(leftPanel);
        add(rightPanel);
        add(lowerButtons);
    }

    private void submitAdd() {
        String englishMeaning = englishMeaningField.getText();
        String polishMeaning = polishMeaningField.getText();
        if (englishMeaning.isEmpty() || polishMeaning.isEmpty() || englishMeaning.length() < 2 || polishMeaning.length() < 2) {
            JOptionPane.showMessageDialog(null, "Unable to add word", "", JOptionPane.WARNING_MESSAGE);
        } else {
            WordsCollection.getInstance().addWord(englishMeaning, polishMeaning);
            this.setVisible(false);
        }
    }
}
