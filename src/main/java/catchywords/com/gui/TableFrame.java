package catchywords.com.gui;

import catchywords.com.model.WordsCollection;

import javax.swing.*;
import java.awt.*;

public class TableFrame extends AbstractFrame {
    Table table;
    final WordsCollection wordsCollection = WordsCollection.getInstance();

    public TableFrame() {
        super("TableFrame");
        table = new Table(wordsCollection);
        JTable jTable = new JTable(table);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        JPanel jPanel = new JPanel();
        jPanel.add(jScrollPane);
        add(jPanel);
        pack();
    }
}
