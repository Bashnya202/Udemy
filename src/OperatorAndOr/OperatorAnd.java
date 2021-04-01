package OperatorAndOr;

public class OperatorAnd {

    public static void Cinema (boolean money, boolean vremya){
        if (money&&vremya){
            System.out.println("Go Cinema");
        }
        else {
            System.out.println("No");
        }
    }


    public static void main(String[] args) {
        Cinema(true,true);
    }
}
