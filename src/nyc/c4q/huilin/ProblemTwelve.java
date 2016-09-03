package nyc.c4q.huilin;

/**
 * Created by huilin on 8/31/16.
 */
public class ProblemTwelve {

    // call a method to run through a loop printing the ordinals starting from first and printing the gift and anything after one will need to print the gifts given prior
    // how to use enum and no breaks (only for gifts)



/* Q12 the-twelve-days-of-christmas
*/


    public static String[] gifts = {

            " and a partridge in a pear tree", " two turtle doves,", " three French hens,", " four calling birds,", " five golden rings,", " six geese a laying,", " seven swans a swimming,",
            " eight maids a milking,", " nine ladies dancing,", " ten lords a leaping,", " eleven pipers piping,", " twelve drummers drumming,"


    };


    public static String[] ordinals = {
            "On the first day of Christmas, my true love gave to me", "On the second day of Christmas, my true love gave to me",
            "On the third day of Christmas, my true love gave to me", "On the fourth day of Christmas, my true love gave to me",
            "On the fifth day of Christmas, my true love gave to me", "On the sixth day of Christmas, my true love gave to me",
            "On the seventh day of Christmas, my true love gave to me", "On the eighth day of Christmas, my true love gave to me",
            "On the ninth day of Christmas, my true love gave to me", "On the tenth day of Christmas, my true love gave to me",
            "On the eleventh day of Christmas, my true love gave to me", "On the twelfth day of Christmas, my true love gave to me",
    };

    public static void main(String[] args) {

        String giftString = "";
        String ordinalString;

        for (int i = 0; i < gifts.length; i++) {
            ordinalString = ordinals[i];

                switch (i) {
                    case 12:
                        giftString += gifts[12];

                    case 11:
                        giftString += gifts[11];

                    case 10:
                        giftString += gifts[10];

                    case 9:
                        giftString += gifts[9];

                    case 8:
                        giftString += gifts[8];

                    case 7:
                        giftString += gifts[7];

                    case 6:
                        giftString += gifts[6];

                    case 5:
                        giftString += gifts[5];

                    case 4:
                        giftString += gifts[4];

                    case 3:
                        giftString += gifts[3];

                    case 2:
                        giftString += gifts[2];

                    case 1:

                        giftString += gifts[1];

                    case 0:

                        giftString += gifts[0];a

                }

                if (i == 0) {
                    System.out.println(ordinalString + " a partridge in a pear tree");
                    giftString = " ";

                } else {
                    System.out.println(ordinalString + giftString);
                    giftString = " ";
                }
            }

        }
    }


