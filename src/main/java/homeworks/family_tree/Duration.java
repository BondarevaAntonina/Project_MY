package homeworks.family_tree;

/**
 * Created by antoni on 14.11.2018.
 */
public enum Duration {
    ALIVE("Alive"), DEAD("Dead");

    private String nameStatus;

    Duration(String nameStatusLife) {
        nameStatus = nameStatusLife;
    }
}
