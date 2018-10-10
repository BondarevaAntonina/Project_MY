package homeworks.collection_online_store.entity;

public enum City {

    KHARKOV("Kharkov"), KIEV("Kiev"),ODESSA("Odessa"), MINSK("Minsk"),
    GOMEL("Gomel"), SOCHI("Sochi"), UFA("Ufa"), OTTAVA("Ottava");

    private String nameCity;

    City(String nameC) {
        nameCity = nameC;
    }
}
