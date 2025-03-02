package org.example.tasks;

public class FerryTicketOffice {
    public void calculatePaymentsAndPassengers(Transport[] transports) {
        double totalPayment = 0;
        int totalPassengers = 0;

        for (Transport transport : transports) {
            if (transport.getType().equals("грузовой")) {
                totalPayment += 30;
                totalPassengers += transport.getPassengerCount();
            } else if (transport.getType().equals("легковой")) {
                if (transport.getPassengerCount() <= 2) {
                    totalPayment += 10;
                } else {
                    totalPayment += 15;
                }
                totalPassengers += transport.getPassengerCount();
            }
        }

        System.out.println("Общая сумма оплат: " + totalPayment + " евро");
        System.out.println("Общее количество пассажиров на пароме: " + totalPassengers);
    }
}
