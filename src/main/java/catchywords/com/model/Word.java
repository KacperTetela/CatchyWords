package catchywords.com.model;

public class Word {
    private String englishMeaning;
    private String polishMeaning;

    Word(String englishMeaning, String polishMeaning) {
        this.englishMeaning = englishMeaning;
        this.polishMeaning = polishMeaning;
    }

    public String getEnglishMeaning() {
        return englishMeaning;
    }

    public String getPolishMeaning() {
        return polishMeaning;
    }

    @Override
    public String toString() {
        return englishMeaning + " = " + polishMeaning;
    }
}
