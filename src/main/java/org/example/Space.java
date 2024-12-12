package org.example;

public class Space {
    public static void main(String[] args) {
        String[] namesOfMonth = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь",
        };
        String result = "";
        for (int i = 0; i < namesOfMonth.length; i++) {
            result += namesOfMonth[i];
            if (i == namesOfMonth.length -1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);

        String month = "Июнь";

        switch (month) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Несуществующее время года");
                break;
        }
    }
}
