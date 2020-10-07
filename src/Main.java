import java.util.Scanner;

/** Sterling Tyson (Pyramid Consulting Inc.)
 * [Place Holder]
 *
 */

public class Main {
    public static void main(String[] args) {
        boolean done = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the program n stuff");
        System.out.println(" \n");
        //System.out.println(" \n");

        while(!done) {

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            /**instantiation and method calls goes here (below)**/

            //TwoSum ts = new TwoSum();
            //Palindrome pal = new Palindrome();
            //ReversePhrase reversePhrase = new ReversePhrase();
            //ValidNumber validNumber = new ValidNumber();
            //Substring substring = new Substring();

            /**COMPLETED PROBLEM STATEMENT CLASS INSTANTIATION ABOVE**/

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////

            /**
             *
             **/
            System.out.println(
                    " \n" +
                    "Press any key to continue\n" +
                            "Press 't' to terminate\n"
            );
            String userInput = scanner.nextLine();

            if (userInput.equals("t") || userInput.equals("T")){
                done = true;
            }
        }
    }
}
