package homeworks.airport_timetable;

/**
 * Created by antoni on 12.06.2018.
 * город отправик
 */
public enum DepartureCity {

    DEPARTURE("Bremen"), DEPARTURE2("Hamburg");

    private String departureCityName;

    DepartureCity(String departureCity) {
        departureCityName = departureCity;
    }

    @Override
    public String toString() {
        return departureCityName;
    }
}
