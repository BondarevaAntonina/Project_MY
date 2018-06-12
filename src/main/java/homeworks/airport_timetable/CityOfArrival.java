package homeworks.airport_timetable;

/**
 * Created by antoni on 12.06.2018.
 * город прибытия
 */
public enum CityOfArrival {

    CITY_OF_ARRIVAL("Nurnberg"), CITY_OF_ARRIVAL2("Munchen");

    private String cityName;

    CityOfArrival(String name) {
        cityName = name;
    }

}
