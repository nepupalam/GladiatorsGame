import java.util.Random;

public class fight {

    public static void StartFight(fighter one, fighter two) {
        while (one.getHealth() > 0 && two.getHealth() > 0) {

            fight(one, two);

        }
        if (one.getHealth() > two.getHealth()) {

            System.out.println("гатс выйграл");
        }
        else {

            System.out.println("грифит выйграл");
        }
    }


    public static void fight(fighter one, fighter two) {
        Random random = new Random();

        if (one.block(random.nextInt(2)) == false && two.block(random.nextInt(2)) == false ) {


        }
        if (one.block(random.nextInt(2)) == true && two.block(random.nextInt(2)) == false ) {
            two.hit(one);

        }
        if (one.block(random.nextInt(2)) == false && two.block(random.nextInt(2)) == true ) {

            one.hit(two);
        }
        if (one.block(random.nextInt(2)) == false && two.block(random.nextInt(2)) == false ) {
            one.hit(two);
            two.hit(one);
        }
    }
}
