package Nataha;

public class Car {

    String color;
    String engine;
    int number;

    public Car(String color, String engine, int number) {
        this.color = color;
        this.engine = engine;
        this.number = number;
    }
}

class CarTest {

    void doore(Car st1, int number) {
        st1.number = number;
    }

    void cvet(Car s1, Car s2) {
        String color = s1.color;
        s1.color = s2.color;
        s2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct1 = new CarTest();
        Car car1 = new Car("red", "V8", 2);
        Car car2 = new Car("white", "V6", 4);
        ct1.doore(car1, 5);
        ct1.doore(car2, 1);
        ct1.cvet(car1, car2);
        System.out.println("Информация о первой машине: Цвет: " + car1.color + " Мотор: " + car1.engine + " Колличество дверей: " + car1.number);
        System.out.println("Информация о второй машине: Цвет: " + car2.color + " Мотор: " + car2.engine + " Колличество дверей: " + car2.number);
    }
}



