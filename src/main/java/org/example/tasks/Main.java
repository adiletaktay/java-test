package org.example.tasks;

/*
Есть 3 типа гаражей:
1. Могут храниться только автомобили BMW
2. Могут храниться только автомобили Tesla
3. Могут храниться любые автомобили. НО только автомобили, нельзя в гараж поставить самолет.
Придумайте такой класс и создайте 3 типа гаражей и припаркуйте там несколько автомобилей, используйте generics.
В каждом из гаражей посчитайте количество черных автомобилей и выведите на экран.
*/

public class Main {
    public static void main(String[] args) {
        BMW bmw1 = new BMW("BMW X5", "black");
        BMW bmw2 = new BMW("BMW M7", "red");
        Tesla tesla1 = new Tesla("Tesla Model S", "black");
        Tesla tesla2 = new Tesla("Tesla Model 3", "blue");
        Car anyCar = new BMW("BMW M4", "black");

        BMWGarage bmwGarage = new BMWGarage();
        bmwGarage.parkCar(bmw1);
        bmwGarage.parkCar(bmw2);
        System.out.println("BMW Garage: " + bmwGarage);

        TeslaGarage teslaGarage = new TeslaGarage();
        teslaGarage.parkCar(tesla1);
        teslaGarage.parkCar(tesla2);
        System.out.println("Tesla Garage: " + teslaGarage);

        AnyCarGarage anyCarGarage = new AnyCarGarage();
        anyCarGarage.parkCar(anyCar);
        System.out.println("Any Car Garage: " + anyCarGarage);
    }
}
