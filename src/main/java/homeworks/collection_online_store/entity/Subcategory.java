package homeworks.collection_online_store.entity;

/**
 * NOTEBOOK, HEAD_PHONES
 */

public enum Subcategory {

    NOTEBOOK("Notebook"), HEAD_PHONES("Head phones"), MOUSE("Mouse");

    private String subcategory;

    Subcategory(String namesubcat) {
        subcategory = namesubcat;
    }

}
