package homeworks.chat_map;

public enum NetworkStatus {

    ONLINE("Online"), NOT_HERE("Not_here"), OFFLINE("Offline"), INVISIBLE("Invisible");

    private String nameStatus;

    NetworkStatus(String nameStatusUser) {
        nameStatus = nameStatusUser;
    }

}
