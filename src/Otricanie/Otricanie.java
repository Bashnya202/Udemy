package Otricanie;

public class Otricanie {

    public static boolean isEven (int num){
        return num % 2==0;
    }
    public static boolean isPositiv (int num){
        return num>0;
    }
    public static boolean noIsEven (int num){
        return !isEven(num);
    }
    public static boolean noIsPositiv (int num){
        return !isPositiv(num);
    }

    public static boolean notEvenAndPositive(int num){
        return (noIsEven(num)&&isPositiv(num));
    }
    public static boolean evenOrNotPositive(int num){
        return (isEven(num)||noIsPositiv(num));
    }


    public static void main(String[] args) {
        boolean result =Otricanie.isEven(3);
        System.out.println(result);
        result = Otricanie.isPositiv(3);
        System.out.println(result);
        result=Otricanie.noIsEven(3);
        System.out.println(result);
        result=Otricanie.noIsPositiv(-4);
        System.out.println(result);
        result=notEvenAndPositive(2);
        System.out.println(result);
        result=Otricanie.evenOrNotPositive(3);
        System.out.println(result);
    }

}
