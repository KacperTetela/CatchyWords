package catchywords.com.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class AddWordFrame extends AbstractFrame {
    private String englishMeaning;
    private String polishMeaning;
    private JTextField englishMeaningField = new JTextField();
    private JTextField polishMeaningField = new JTextField();
    private JLabel englishMeaningLabel = new JLabel("English Meaning",SwingConstants.CENTER);
    private JLabel polishMeaningLabel = new JLabel("Polish Meaning",SwingConstants.CENTER);
    private JButton cancel = new JButton("Cancel");
    private JButton submit = new JButton("Submit");
    private JPanel leftPanel = new JPanel();
    private JPanel rightPanel = new JPanel();

    public AddWordFrame(String title) {
        super(title, new GridLayout(1,2));

        leftPanel.setLayout(new GridLayout(2,1));
        rightPanel.setLayout(new GridLayout(2,2));

        leftPanel.setBackground(Color.YELLOW);
        rightPanel.setBackground(Color.BLUE);

        leftPanel.setPreferredSize(new Dimension(200, 100));
        rightPanel.setPreferredSize(new Dimension(200, 100));

        leftPanel.add(englishMeaningLabel);
        rightPanel.add(polishMeaningLabel);

        leftPanel.add(englishMeaningField);
        rightPanel.add(polishMeaningField);

        leftPanel.setBorder(new EmptyBorder(10,10,10,20));
        rightPanel.setBorder(new EmptyBorder(10,10,10,20));

        add(leftPanel);
        add(rightPanel);

        pack();
    }
}
