public class Convert {

    /**
     * Difficulty: Easy
     * PAGES 14-15 (String to Integer)
     * method COMPLETED
     * @param str
     */
    public static int strToInt(String str) {
        int num = 0;
        try {
            num = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("Siiiiike");
        }

        return num;

        //OR (ez option below)
        //return Integer.parseInt(str);
    }

    public static String intToStr(int num){

        return String.valueOf(num);
    }
}
