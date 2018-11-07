package homeworks.translator_application;

public enum LanguagesTrans {

    RUS_UKR("rus_ukr"),
    UKR_RUS("ukr_rus"),
    ENG_RUS("eng_rus"),
    RUS_ENG("rus_eng");

    private String name;

    LanguagesTrans(String name) {
        this.name = name;
    }

    public static LanguagesTrans getByName(String value){
        try {
            return LanguagesTrans.valueOf(value.toUpperCase());
        } catch(Exception err){
            return null;
        }
    }

}
