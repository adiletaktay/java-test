package org.example.tasks;

public class ClientService {
    public void offerDatingService(Person person) {
        if (person.getBirthYear() < 2007 && person.getMaritalStatus().equals("single")) {
            if (person.getGender().equals("male")) {
                System.out.println("Уважаемый " + person.getFirstName() + ", желаете ли познакомиться с девушкой?");
            } else if (person.getGender().equals("female")) {
                System.out.println("Уважаемая " + person.getFirstName() + ", мы поможем вам найти мужчину мечты.");
            }
        } else {
            System.out.println("Извините, на данный момент мы предлагаем услуги только для одиноких людей старше 18 лет.");
        }
    }
}