package homeworks.airport_timetable;


import java.io.IOException;
import java.util.Scanner;

import static homeworks.test_zadanie.OperationArray.SCANNER;

/**
 * Created by antoni on 12.06.2018.
 * Создать приложение, позволяющие создавать расписание аэропорта.
 * Приложение должно позволять:
 * 1) Создавать c.
 * 2) После ввода город прибытия и/или город отправления выводить список подходящих рейсов.
 * 3) Просматривать все рейсы.
 * 4) Просматривать информацию о конкретном рейсе.
 * 5) Организовать "умный поиск". Пользователь вводит требования(город отправления, город прибытия, время в полете, количество мест)
 * и выводить рейс, который соответствует требованиям.
 * Для полей "город отправления", "город прибытия" использовать enums.
 */
public class TestAirport {

    private AirportService airportService;

    public TestAirport() throws IOException {
        airportService = new AirportService();

    }


    public static void main(String[] args) throws Exception {

        TestAirport testAirport = new TestAirport();
        testAirport.showMenuFlight();
    }

    public void showMenuFlight() {

        int userActionNumber;

        do {
            System.out.println("------- Dating for dating -------\n" +
                    "1 - Add flights to schedule\n" +
                    "2 - After entering the city of arrival and, display a list of suitable flights\n" +
                    "3 - After entering the city of departure, display a list of suitable flights\n" +
                    "4 - View all flights\n" +
                    "5 - View information about a specific flight\n" +
                    "6 - Organize smart search. The user enters requirements (city of departure, city of arrival, time in flight, number of seats)\n" +
                    "0 - Exit");
            try {
                userActionNumber = SCANNER.nextInt();
                doAction(userActionNumber);
            } catch (Exception e) {
                System.out.println("Input Error\n:" + e);
                userActionNumber = -1;
                e.printStackTrace();
            }
        } while (userActionNumber != 0);
    }

    public void doAction(int userActionNumber) {
        Scanner sc = new Scanner(System.in);

        switch (userActionNumber) {

            //1 - To be registered to the person is more senior 18 years
            case 1: {

                System.out.print("Enter the name of the flight:");

                String nameFlight = sc.nextLine();

                System.out.print("Enter arrival city:");

                CityOfArrival cityName = CityOfArrival.valueOf(sc.nextLine().toUpperCase());

                System.out.print("Enter the city of dispatch:");

                DepartureCity departureCityName = DepartureCity.valueOf(sc.nextLine().toUpperCase());

                System.out.print("Enter the number of seats:");

                int numberSeats = SCANNER.nextInt();

                System.out.print("Enter the flight time:");

                int timeInFlight = SCANNER.nextInt();

                Flight flight = new Flight(nameFlight, cityName, departureCityName, numberSeats, timeInFlight);

                airportService.addFlight(flight);

                break;
            }

            case 2: {
                System.out.print("Enter arrival city:");

                CityOfArrival cityOfArrival = CityOfArrival.valueOf(sc.nextLine().toUpperCase());

                airportService.showCityOfArrival(cityOfArrival);

                break;
            }

            case 3: {
                System.out.print("Enter the city of dispatch:");

                DepartureCity departureCity = DepartureCity.valueOf(sc.nextLine().toUpperCase());

                airportService.showDepartureCity(departureCity);

                break;
            }
            case 4: {

                airportService.showFlight();

                break;
            }

            case 5: {

                System.out.print("Enter the name of the flight:");

                String nameFlight = sc.nextLine();

                airportService.searchFlight(nameFlight);

                break;
            }

            case 6: {

                System.out.print("Enter arrival city:");

                CityOfArrival cityOfArrival = CityOfArrival.valueOf(sc.nextLine().toUpperCase());

                System.out.print("Enter the city of dispatch:");

                DepartureCity departureCity = DepartureCity.valueOf(sc.nextLine().toUpperCase());

                System.out.print("Enter the flight time:");

                int timeInFlight = SCANNER.nextInt();

                System.out.print("Enter the number of seats:");

                int numberSeats = SCANNER.nextInt();

                airportService.searchCityTimeInFlightNumberSeats(cityOfArrival, departureCity, timeInFlight, numberSeats);

                break;
            }
        }
    }
}
