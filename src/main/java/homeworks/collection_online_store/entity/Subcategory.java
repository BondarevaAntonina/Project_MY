package homeworks.collection_online_store.entity;

import java.util.ArrayList;

/**
 * Created by antoni on 21.08.2018.
 */
public class Subcategory extends Category {

//    PHONE, HEAD_PHONES

    private String nameSubCat;

    public Subcategory(String name, String tags, String sire, ArrayList<Product> productList, Subcategory subcategory, String nameSubCat) {
        super(name, tags, sire, productList, subcategory);
        this.nameSubCat = nameSubCat;
    }

    @Override
    public String toString() {
        return getName() + " [Name: " + nameSubCat + "]";
    }
}
