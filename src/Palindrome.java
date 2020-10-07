import java.util.Scanner;

public class Palindrome {

    /**
     * Difficulty: Easy
     * PAGE 10 (validPalindrome)
     * method COMPLETED
     * @param str
     */
    public boolean validPalindrome(String str){
        try {
            System.out.println(("Enter a word (lowercase)"));
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine().toLowerCase();

            StringBuilder stringBuilder = new StringBuilder(str);
            String strReg = stringBuilder.toString();
            String strRev = stringBuilder.reverse().toString();

            if (strReg.equals(strRev)) {
                System.out.println("VALID palindrome");
                return true;
            }

        } catch (Exception e){
            System.out.println("Ya done f'd up somewhere mate");
        }
        System.out.println("INVALID palindrome");
        return false;
    }

    public Palindrome(){}

}
