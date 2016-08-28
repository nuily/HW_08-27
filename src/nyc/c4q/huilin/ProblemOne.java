package nyc.c4q.huilin;

/**
 * Created by huilin on 8/28/16.
 *
 * Q1. add-function

 Write a method named add that takes in two numbers as arguments. The function should return the sum of the two numbers.

 */
public class ProblemOne {


    public static void main(String[] args) {

       System.out.println(add(1,2));
        System.out.println(add(10,12));

    }

    public static int add(int a, int b) {
        int result;

        result = a + b;

        return result;
    }
}
