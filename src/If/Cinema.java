package If;

public class Cinema {

    public static void access(int age){
        if (age>=18){
            System.out.println("Welcom to cinema");
        }
        else if (age>=0 && age < 18){
            System.out.println("It is not for you");
        }
        else {
            System.out.println("Vedeno ne corectnoe chislo");
        }
        }

    public static void main(String[] args) {
        access(18);
    }
    }

