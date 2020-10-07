import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean done = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the program n stuff");
        System.out.println(" \n");
        //System.out.println(" \n");

        while(!done) {

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //instantiation and method calls goes here (below)

            TwoSum ts = new TwoSum();
            ts.getTwoSumTwo(new int[]{1,2,3,4,5});
            //ts.getTwoSum(testArr);
            ts.getTwoSumTwo(new int [] {3,6,1,13,9});

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////

            /**
             *
             **/
            System.out.println(
                    "Press any key to continue\n" +
                            "Press 't' to  terminate\n"
            );
            String userInput = scanner.nextLine();

            if (userInput.equals("t") || userInput.equals("T")){
                done = true;
            }
        }
    }
}
