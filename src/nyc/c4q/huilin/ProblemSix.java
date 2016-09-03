package nyc.c4q.huilin;
import java.util.Scanner;

/**
 * Created by huilin on 9/3/16.
 *
 *     /*
 Q6. Scanner-Hungry-hippos

 // read input and accept h
 // use if statement to print yum! else yuck!
 */
public class ProblemSix {




    public static void main(String[] args) {

        Scanner hippoEat = new Scanner(System.in);
        System.out.println("Enter a food:");
        String food = hippoEat.nextLine();

        char h = 'h';

        if (Character.toLowerCase(food.charAt(0)) == h) {
            System.out.println("Yum!");

        } else {
            System.out.println("Yuck!");
        }


    }
}

/*
End Q6
*/

