package homeworks.collection_online_store.entity;

import java.util.ArrayList;

public class Administrator extends Person {
    public Administrator() {
        this.groupsList = new ArrayList<Groups>();
    }

    @Override
    public String toString() {
        return "Administrator[ id=" + id + " ]";
    }
}
