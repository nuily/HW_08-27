package nyc.c4q.huilin;

/**
 * Created by huilin on 9/3/16.
 *
 *     /* Q7 elide

 // method(String str)
 // return new string containing 1st three letters of arg + "..." + last letter
 // if result > arg, method return arg
 */
public class ProblemSeven {


    public static String elide(String begin3String) {

        int beginStringLen = begin3String.length();
        int lastIndex = begin3String.length() - 1;
//              System.out.println(lastIndex);
        char endChar = begin3String.charAt(lastIndex);
//        System.out.println(endChar);
        String newString = begin3String.substring(0, 3) + "..." + endChar;
        int newStringLen = newString.length();

        if (newStringLen < beginStringLen) {
            return newString;

        } else {
            return begin3String;
        }

    }

    public static void main(String[] args) {

        System.out.println(elide("LOVE"));

    }

}

