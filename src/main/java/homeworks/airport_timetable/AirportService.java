package homeworks.airport_timetable;

import java.util.Objects;

/**
 * Created by antoni on 12.06.2018.
 * Создать приложение, позволяющие создавать расписание аэропорта.
 * Приложение должно позволять:
 * 1) Создавать рейс.
 * 2) После ввода страны прибытия и/или страны отправления выводить список подходящих рейсов.
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

    //
    public void addFlight(Flight flight) {

        resizeMassive();

        for (Flight temp: flights){
            System.out.println(temp);
        }

        flight.showDataAirport();


    }



    public void resizeMassive() {

        if (Objects.isNull(flights[flights.length - 1])) {

            int newSize = flights.length * 2;

            Flight[] tmpArray = new Flight[newSize];

            System.arraycopy(flights, 0, tmpArray, 0, flights.length);

            flights = tmpArray;
        }
    }
}
