package If;

public class If1 {
    int a;

    If1 (int a){
        this.a=a;
    }

    public static void main(String[] args) {
    If1 test1= new If1(0);
        if (test1.a>0){
            System.out.println("var a polojitelnoe chislo");
        }
        else if (test1.a<0){
            System.out.println("Var a otricatelnoe chislo");
        }
        else {
            System.out.println("Var a ravno 0");
        }
    }

}
