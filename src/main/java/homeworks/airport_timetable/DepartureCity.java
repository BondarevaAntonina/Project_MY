package homeworks.airport_timetable;

/**
 * Created by antoni on 12.06.2018.
 *
 */
public enum DepartureCity {

    DEPARTURE_CITY("Berlin"), DEPARTURE_CITY2("Hamburg");

    private String departureCityName;

    DepartureCity(String cityName) {
        departureCityName = cityName;
    }
}
