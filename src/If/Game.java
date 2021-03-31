package If;

public class Game {

    public static void menu(String name){
        if (name.equals("Mortal Kombat")){
            System.out.println("Start-Mortal Kombat");
        }
        else if (name.equals("Tanks")) {
            System.out.println("Start - Tanks");
        }
        else {
            System.out.println("Takoi game ne syjestvyet");
        }
        }

    public static void main(String[] args) {
        Game.menu("Tanks");
        Game.menu("Dota 2");
        Game.menu("Mortal Kombat");
    }

    }

