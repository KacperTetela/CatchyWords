package catchywords.com.gui;

import javax.swing.*;

public class AddWordFrame extends AbstractFrame{
    private String englishMeaning;
    private String polishMeaning;
    private JTextField englishMeaningField;
    private JTextField polishMeaningField;
    private JLabel englishMeaningLabel = new JLabel("English Meaning");
    private JLabel polishMeaningLabel = new JLabel("Polish Meaning");
    private JButton cancel = new JButton("Cancel");
    private JButton submit = new JButton("Submit");

    public AddWordFrame(String title) {
        super(title);
    }
}
