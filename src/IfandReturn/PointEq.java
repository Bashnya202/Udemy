package IfandReturn;

public class PointEq {

    public static boolean eq (int x1,int y1,int x2,int y2){
        return x1==x2 && y1==y2;
//
//        boolean eqX= x1==x2;
//        boolean eqY = y1==y2;
//        return eqX && eqY;

//        boolean eqX= x1==x2;
//        boolean eqY = y1==y2;
//        if (eqX && eqY){
//            return true;
//        }
//        else {
//            return false;
//        }
 }

    public static void main(String[] args) {
        System.out.println(eq(2,1,2,2));
        System.out.println(eq(10,10,10,10));


    }
}
