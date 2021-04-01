package Ternar;

public class Ternar {
    public static String permission(int age){
        String label=age>=18?"Yes":"no";
        return label;
    }

    public static void main(String[] args) {
        String result=Ternar.permission(19);
        System.out.println(result);
    }
}
