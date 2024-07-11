package catchywords.com.gui;

import catchywords.com.model.Word;
import catchywords.com.model.WordsCollection;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Table implements TableModel {
    private final List<Word> words;

    public Table(WordsCollection wordsCollection) {
        words = wordsCollection.getWords();
    }

    @Override
    public int getRowCount() {
        return words.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "English meaning";
            case 1:
                return "Polish meaning";
            default:
                return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String englishMeaning = words.get(rowIndex).getEnglishMeaning();
        String polishMeaning = words.get(rowIndex).getPolishMeaning();
        switch (columnIndex) {
            case 0:
                return englishMeaning;
            case 1:
                return polishMeaning;
            default:
                return "";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
