package nyc.c4q.huilin;

/**
 * Created by huilin on 9/3/16.
 */
public class ProblemNine {

    /* Q9
Count- Code

// check string for "code" and return amt found
// the d in code can be substituted for any letter
// is there a way to find the index of "co" and then add + 1 to that index to view character at 'e' index

*/


    public static int countCode(String ramble) {
        int counter = 0;

        for (int i = 0; i < ramble.length(); i++) {
            if (ramble.charAt(i) == 'c') {
                if (ramble.charAt(i + 1) == 'o') {
                    if (ramble.charAt(i + 3) == 'e') {
                        counter++;
                    }
                }
            }

         }
        System.out.println(counter);
        return counter;

    }

    public static void main (String[] args) {
        countCode("aaacodebbbcodelksadjfsaldcodecodecode");
    }

}

