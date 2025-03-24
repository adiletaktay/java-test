package org.example.tasks;

/*
Создайте класс, который хранит в себе информацию о посещениии сайта. У этого класса должны быть поля имя пользователя,
посещенный сайт и дата посещения.
В классе с методом мейн создайте коллекцию с посещениями сайтов (сайты должны быть разными) и заполните ее.
Затем вам необходимо сгруппировать данные из коллекции таким образом, чтобы был виден сайт и сколько посетителей было
у него за выбранный месяц. Параметр "месяц" пользователь вводит с консоли.
Подсказка. Название сайта - это ключ, а значение - количество пользователей.
*/

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class WebSiteMain {
    public static void main(String[] args) {
        List<WebsiteVisit> visits = new ArrayList<>();

        visits.add(new WebsiteVisit("Adi", "https://example.com", LocalDateTime.now()));
        visits.add(new WebsiteVisit("Di", "https://another-example.com", LocalDateTime.now().minusDays(1)));
        visits.add(new WebsiteVisit("Madi", "https://yetanotherexample.com", LocalDateTime.now().minusHours(5)));
        visits.add(new WebsiteVisit("Shadi", "https://example.org", LocalDateTime.now().minusDays(2)));
        visits.add(new WebsiteVisit("Bob", "https://example.net", LocalDateTime.now().minusMinutes(30)));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц (1-12): ");
        int monthInput = scanner.nextInt();

        Map<String, Integer> siteVisitCount = new HashMap<>();

        for (WebsiteVisit visit : visits) {
            if (visit.getVisitDate().getMonthValue() == monthInput) {
                String site = visit.getVisitedSite();
                siteVisitCount.put(site, siteVisitCount.getOrDefault(site, 0) + 1);
            }
        }

        System.out.println("Количество пользователей за месяц " + Month.of(monthInput) + ":");
        for (Map.Entry<String, Integer> entry : siteVisitCount.entrySet()) {
            System.out.println("Сайт: " + entry.getKey() + ", Пользователи: " + entry.getValue());
        }
    }
}
