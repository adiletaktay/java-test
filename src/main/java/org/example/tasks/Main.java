package org.example.tasks;

/*
Создать класс Транспортное средство. В нем должны быть поля: госномер (string), тип (легковой/грузовой), количество
человек на борту, масса.
Создайте отдельный класс для для кассы на пароме.
В нем создайте метод, который принимает аргументом массив транспортных средств, вычисляет и печатает на консоль сумму
оплат и количество пассажиров на пароме.
если авто грузовой - платит 30 евро;
если легковой и до 2 человек в салоне - платит 10 евро;
если легковой и если людей в салоне больше 2 - 15 евро.
Создайте отдельный класс для проверки допуска парома к рейсу.
Создайте метод для проверки допуска парома к рейсу: рейс разрешен, если на борту парома максимум 50 пассажиров и если
общая масса транспорта менее 15 тонн. Метод должен принимать массив транспортных средств и возвращать boolean.
Создайте класс c методом main, в котором создается 5 автомобилей с разными параметрами и загрузите паром.
*/

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[]{
                new Transport("A111aa", "легковой", 2, 1500),
                new Transport("S222SS", "грузовой", 2, 8000),
                new Transport("B333BB", "легковой", 4, 1200),
                new Transport("L444LL", "легковой", 1, 1100),
                new Transport("E555EE", "грузовой", 1, 7000)
        };

        FerryTicketOffice ticketOffice = new FerryTicketOffice();
        ticketOffice.calculatePaymentsAndPassengers(transports);

        FerryAccessCheck ferryCheck = new FerryAccessCheck();
        boolean isAllowed = ferryCheck.isFerryAllowedToSail(transports);

        if (isAllowed) {
            System.out.println("Рейс разрешен.");
        } else {
            System.out.println("Рейс не разрешен.");
        }
    }
}
