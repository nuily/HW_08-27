package nyc.c4q.huilin;

/**
 * Created by huilin on 9/3/16.
 */
/* Q11
Cut A String At A Character

// find method for string *check hw* (substring?)
// needs 2 args (string, character)



public class ProblemEleven {

    public static String subStrAfterChars (String input, char letter) {

        String result = input.substring(input.lastIndexOf(letter)+1);

        System.out.println(result);
        return result;

    }

    public static void main (String[]args) {

        subStrAfterChars("this is a test string", 'a');
        subStrAfterChars("this is another test", 'o');

    }
}


End of Q11
*/
