package homeworks.airport_timetable;

/**
 * Created by antoni on 12.06.2018.
 * город прибытия
 */
public enum CityOfArrival {

    CITY("BONN"), CITY2("Trir");

    private String cityName;

    CityOfArrival(String nameCity) {
        cityName = nameCity;
    }

    @Override
    public String toString() {
        return cityName;
    }
}



