package OperatorAndOr;

public class OperatorOr {
    public void permission(boolean money, boolean beFriend) {
        if (money || beFriend) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

class OperatorOrTest {
    public static void main(String[] args) {
        OperatorOr result = new OperatorOr();
        result.permission(false,false);
    }
}

