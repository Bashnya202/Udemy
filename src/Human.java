public class Human {
    String name;
    int age;
    Human(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Cinema {
    public boolean cinema(int age){
        return age>=18;
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human Dima = new Human("Dima",16);
        Cinema c = new Cinema();
        boolean result = c.cinema(Dima.age);
        System.out.println(result);
    }
}
