package homeworks.airport_timetable;

import java.util.Objects;

/**
 * Created by antoni on 12.06.2018.
 * Создать приложение, позволяющие создавать расписание аэропорта.
 * Приложение должно позволять:
 * 1) Создавать рейс.
 * 2) После ввода города прибытия и/или города отправления выводить список подходящих рейсов.
 * 3) Просматривать все рейсы.
 * 4) Просматривать информацию о конкретном рейсе.
 * 5) Организовать "умный поиск". Пользователь вводит требования(город отправления, город прибытия, время в полете, количество мест)
 * и выводить рейс, который соответствует требованиям.
 * Для полей "город отправления", "город прибытия" использовать enums.
 */
public class AirportService {


    private Flight[] flights;

    public AirportService() {
        flights = new Flight[10];
    }

    // 1)Create a flight
    public void addFlight(Flight flight) {

        resize();

        for (int i = 0; i < flights.length; i++) {

            if (Objects.isNull(flights[i])) {
                flights[i] = flight;
                break;
            }
        }

        flight.showDataAirport();
    }
    //После ввода города прибытия и/или города отправления выводить список подходящих рейсов.
    //2) After entering the city of arrival, display a list of suitable flights.

    public void showCityOfArrival(CityOfArrival cityOfArrival) {

        for (Flight flight : flights) {
            if (Objects.nonNull(flight) && flight.getCityName().equals(cityOfArrival)) {

                flight.showDataAirport();
            }
        }
    }

    //После ввода города прибытия и/или города отправления выводить список подходящих рейсов.
    //3 After entering the city of departure, display a list of suitable flights.

    public void showDepartureCity(DepartureCity departureCity) {

        for (Flight flight : flights) {

            if (Objects.nonNull(flight) && flight.getDepartureCity().equals(departureCity)) {

                flight.showDataAirport();

            }
        }
    }

    // 4) Просматривать все рейсы
    // View all flights
    public void showFlights() {
        for (Flight flight : flights) {
            if (Objects.nonNull(flights)) {
                flight.showDataAirport();
            }
        }
    }

    // 5) Просматривать информацию о конкретном рейсе
    //View information about a specific flight
    public void searchFlightByName(String nameFlight) {
        for (Flight flight : flights) {

            if (Objects.nonNull(flight) && flight.getNameFlight().equals(nameFlight)) {

                flight.showDataAirport();
            }

        }
    }
    //6) Организовать "умный поиск". Пользователь вводит требования(город отправления, город прибытия, время в полете, количество мест)
    // * и выводить рейс, который соответствует требованиям

    public void searchCityTimeInFlightNumberSeats(CityOfArrival cityOfArrival, DepartureCity departureCity,
                                                  int timeInFlight, int numberSeats) {

        for (Flight flight: flights) {
            if(Objects.nonNull(flight) &&
                    cityOfArrival == flight.getCityName() &&
                    departureCity == flight.getDepartureCity() &&
                    timeInFlight ==flight.getTimeInFlight() &&
                    numberSeats == flight.getNumberSeats()){
                flight.showDataAirport();
            }
        }

    }


    private void resize() {
        if (Objects.isNull(flights[flights.length - 1])) {

            int newSize = flights.length * 2;

            Flight[] tmpArray = new Flight[newSize];

            System.arraycopy(flights, 0, tmpArray, 0, flights.length);

            flights = tmpArray;
        }
    }
}
