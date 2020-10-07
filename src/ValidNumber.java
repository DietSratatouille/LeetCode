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
            Integer.parseInt(str);
            Float.parseFloat(str);   //doesn't work
//            int i = Integer.parseInt(str);
//            double d = Double.parseDouble(str);
//            float f = Float.parseFloat(str);
            System.out.println("Valid number");
            return true;
        }
        catch (Exception e){
            System.out.println("Not a valid number");
        }

        return false;
    }
}
