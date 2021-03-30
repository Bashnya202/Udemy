package Lesson13;

public class Month {

    public static void MonthNumber(int m){

        switch (m){
            case 1:
                System.out.println("V yanvare 31 den'"); break;
            case 2:
                System.out.println("V fevrale 28 den'"); break;
        }

    }

    public static void main(String[] args) {
        MonthNumber(2);
    }

}
