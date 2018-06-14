package homeworks.airport_timetable;

/**
 * Created by antoni on 12.06.2018.
 * Создать приложение, позволяющие создавать расписание аэропорта.
 * Приложение должно позволять:
 * 1) Создавать рейс.
 * 2) После ввода город прибытия и/или город отправления выводить список подходящих рейсов.
 * 3) Просматривать все рейсы.
 * 4) Просматривать информацию о конкретном рейсе.
 * 5) Организовать "умный поиск". Пользователь вводит требования(город отправления, город прибытия, время в полете, количество мест)
 * и выводить рейс, который соответствует требованиям.
 * Для полей "город отправления", "город прибытия" использовать enums.
 */
public class Flight {
    private String nameFlight;
    private DepartureCity departureCity;
    private CityOfArrival arrivalCity;
    private int numberSeats;
    private int timeInFlight;

    public Flight(String nameFlight, CityOfArrival nameCity,
                  DepartureCity departureCity, int numberSeats, int timeInFlight) {
        this.nameFlight = nameFlight;
        this.arrivalCity = nameCity;
        this.departureCity = departureCity;
        this.numberSeats = numberSeats;
        this.timeInFlight = timeInFlight;
    }


    public String getNameFlight() {
        return nameFlight;
    }

    public DepartureCity getDepartureCity() {
        return departureCity;
    }


    public CityOfArrival getCityName() {
        return arrivalCity;
    }

    public int getNumberSeats() {
        return numberSeats;
    }


    public int getTimeInFlight() {
        return timeInFlight;
    }

    public void showDataAirport() {
        System.out.println(nameFlight + " " +
                arrivalCity + " " +
                departureCity + " " +
                numberSeats + " " +
                timeInFlight);
    }

}
