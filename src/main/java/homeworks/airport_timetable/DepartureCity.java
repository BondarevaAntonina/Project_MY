package homeworks.airport_timetable;

/**
 * Created by antoni on 12.06.2018.
 * город отправик
 */
public enum DepartureCity {

    DEPARTURE_CITY("Bob"), DEPARTURE_CITY2("Hamburg");

    private String departureCityName;

    DepartureCity(String departureCity) {
        departureCityName = departureCity;
    }
}
