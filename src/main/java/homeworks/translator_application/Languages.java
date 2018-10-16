package homeworks.translator_application;

public enum Languages {

    RUSSIAN_UKRAINIAN("Russian Ukrainian"), UKRAINIAN_RUSSIAN("Ukrainian Russian"),
    ENGLISH_RUSSIAN("English Russian"), RUSSIAN_ENGLISH("Russian English");

    private String nameLanguage;

    Languages(String nameLangv) {
        nameLanguage = nameLangv;
    }
}
