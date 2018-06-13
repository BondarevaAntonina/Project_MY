package homeworks.airport_timetable;

/**
 * Created by antoni on 12.06.2018.
 *  Создать приложение, позволяющие создавать расписание аэропорта.
 Приложение должно позволять:
 1) Создавать рейс.
 2) После ввода город прибытия и/или город отправления выводить список подходящих рейсов.
 3) Просматривать все рейсы.
 4) Просматривать информацию о конкретном рейсе.
 5) Организовать "умный поиск". Пользователь вводит требования(город отправления, город прибытия, время в полете, количество мест)
 и выводить рейс, который соответствует требованиям.
 Для полей "город отправления", "город прибытия" использовать enums.
 */
public class Flight {
    private String nameFlight;
    private DepartureCity departureCityName;
    private CityOfArrival cityName;
    private int numberSeats;
    private int timeInFlight;

    public Flight(String nameFlight, CityOfArrival cityName, DepartureCity departureCityName, int numberSeats, int timeInFlight) {
        this.nameFlight = nameFlight;
        this.cityName = cityName;
        this.departureCityName = departureCityName;
        this.numberSeats = numberSeats;
        this.timeInFlight = timeInFlight;
    }

    public int getTimeInFlight() {
        return timeInFlight;
    }

    public void setTimeInFlight(int timeInFlight) {
        this.timeInFlight = timeInFlight;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getNameFlight() {
        return nameFlight;
    }

    public void setNameFlight(String nameFlight) {
        this.nameFlight = nameFlight;
    }


    public void showDataMan() {
        String dataFlight= nameFlight + " " + departureCityName + " " + cityName + " " + cityName + " " + numberSeats + " " + timeInFlight + " ";
        System.out.println(dataFlight);

    }

}
