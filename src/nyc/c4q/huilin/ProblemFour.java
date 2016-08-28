package nyc.c4q.huilin;

/**
 * Created by huilin on 8/28/16.
 *
 * Q4. endsly

 Write a Java method that takes a string as a parameter and returns true if it ends in "ly".
 */

public class ProblemFour {

    public static void main(String[] args) {

        System.out.println(endsly("really"));
    }

    public static boolean endsly(String input) {
            return input.endsWith("ly");
    }
}
