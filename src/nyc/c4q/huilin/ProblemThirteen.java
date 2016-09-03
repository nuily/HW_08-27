package nyc.c4q.huilin;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by huilin on 8/31/16.
 *
 *  Q13. scanner-ice-cream-start-up

 Your friends just came up with a great new start-up idea: it's like Uber for ice cream! They've asked you to write a prototype Java program that will accept
 ice cream orders for delivery. The program should use a Scanner object to read user input and should:

 Greet the user and ask them for a name.
 Ask the user what flavor of ice cream they would like.
 One-by-one, offer three toppings of your choice which the user will select by inputting 'yes'.
 Calculate the total price of the order: the base ice cream costs $2.33 and each topping is an additional $0.33 cents.
 Calculate a delivery wait time estimate, which should be a random number of minutes between 1 and 60.
 Print an order confirmation to the console that contains the following details: the user's name, ice cream flavor, number of toppings, total price, and delivery wait time.
 *
 * Here is an example interaction:

 Welcome to our ice cream service! What's your name?
 > Jim
 Okay Jim, which flavor of ice cream would you like?
 > vanilla
 Would you like chocolate chips?
 > yes
 Would you like bananas?
 > No
 Would you like gummy bears?
 > YES
 Okay! A vanilla ice cream with 2 toppings. Your total is $2.99 and your ice cream will arrive in 1
 *
 */
public class ProblemThirteen {

    int waitTime; //delivery wait time estimate 1 - 60

    public static void main(String[] args) {
        int countToppings = 0;
        double baseCost = 2.33;
        double toppingCost = 0.33;
        int waitTime;


//    }

//    public static void cashier() {

        Scanner receive = new Scanner(System.in);

        System.out.println("Welcome to our ice cream service! What's your name?");
        String customer = receive.nextLine();
        System.out.println("Okay " + customer + ", what flavor ice cream would you like?");
        String flavors = receive.nextLine();
        System.out.println("Would you like chocolate chips?");
        String topping = receive.nextLine();
        if (topping.equalsIgnoreCase("yes")) {
            countToppings ++;
        }
        System.out.println("Would you like bananas?");
        topping = receive.nextLine();
        if (topping.equalsIgnoreCase("yes")) {
            countToppings ++;
        }
        System.out.println("Would you like gummy bears?");
        topping = receive.nextLine();
        if (topping.equalsIgnoreCase("yes")) {
            countToppings ++;
        }

        System.out.println(countToppings);

        double total = baseCost + (toppingCost * countToppings);


        Random waitMin = new Random();
        waitTime = waitMin.nextInt(60) + 1;


        System.out.println("Thanks " + customer + " for your order of a " + flavors + " ice cream with " + countToppings + " toppings. Your total is $" + (Math.round(total*100.00)/100.00) +
                ", and your ice cream will arrive in " + waitTime + " minutes.");



    }


}
