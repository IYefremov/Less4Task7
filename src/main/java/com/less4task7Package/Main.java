//Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
//        Finally, create another class, a specific type of Car that inherits from the Car class.
//        You should be able to hand steering, changing gears, and moving(speed in other words).
//        You will want to decide where to put the appropriate state and behaviours(fields and methods).
//        As mentioned above, changing gears, increasing/decreasing speed should be included.
//        For you specific type of vehicle you will want to add something specific for that type of car.

package com.less4task7Package;

public class Main {
    public static void main(String[] args) {

        SportCat sportCar = new SportCat();

        sportCar.setDoorNumber(2);
        sportCar.setMaxSpeed(320);
        sportCar.setSeatNumber(2);
        sportCar.setVinNumber("123456789");
        sportCar.setGearsCount(6);


        // Разгоняемся до максимальной скорости,  переключаем передачи

        for (int i = 0; i <= sportCar.getMaxSpeed(); i += 20) {
            sportCar.setCurrentSpeed(i);
            sportCar.gearChange(i);
            System.out.println("Speed is " + i + " " + "The current gear is " + sportCar.getCurrentGear());
        }

        // Тормозим до полной остановки. Переключаем передачи
        for (int i = sportCar.getCurrentSpeed(); i >= 0; i -= 20) {
            sportCar.gearChange(i);
            System.out.println("Speed is " + i + " " + "The current gear is " + sportCar.getCurrentGear());
        }

        // поворачиваем рулем вправо
        sportCar.steeringToTheRight();

        // поворачиваем рулем влево
        sportCar.steeringToTheRight();
    }
}
