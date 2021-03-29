package Lesson11;

public class Car {
    String color;
    String engine;
    int kolDoor;

    Car(String color, String engine, int kolDoor) {
        this.color = color;
        this.engine = engine;
        this.kolDoor = kolDoor;
    }
}


class CarTest {

    void numberDoor(Car x, int kolDoor) {
        x.kolDoor = kolDoor;
    }

    static void changeColor(Car car1, Car car2) {
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;

    }


    public static void main(String[] args) {
        Car c1 = new Car("White", "V6", 5);
        Car c2 = new Car("Black", "V8", 3);
        CarTest ct1 = new CarTest();
        System.out.println(c1.kolDoor);
        ct1.numberDoor(c1, 3);
        System.out.println(c1.kolDoor);
        changeColor(c1, c2);
        System.out.println(c1.color + " " + c2.color);
    }


}