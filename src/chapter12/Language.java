package chapter12;

public enum Language {

    RU("Ռուսերեն"),
    HY("Հայերեն"),
    ENG("Անգլերեն"),
    FR;

    private String languageName;

    Language(String languageName) {
        this.languageName = languageName;
    }

    Language() {
    }

    public String getLanguageName() {
        return languageName;
    }

}
