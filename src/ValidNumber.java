public class ValidNumber {

    /**
     * Difficulty: Easy
     * PAGE 16 (Validate int value of a string)
     * method COMPLETED
     * @param str
     */
    public boolean validateNumber(String str){
        try{
            Double.parseDouble(str);  //doesn't work
            System.out.println("Valid number");
            return true;
        } catch (Exception e){
            System.out.println("Not a valid number");
        }

        try{
            Float.parseFloat(str);   //doesn't work
            System.out.println("Valid number");
            return true;
        } catch (Exception e){
            System.out.println("Not a valid number");
        }

        try{
            Integer.parseInt(str);
            System.out.println("Valid number");
            return true;
        } catch (Exception e){
            System.out.println("Not a valid number");
        }

        return false;
    }
}
