public class Substring {

    /**
     * Difficulty: Medium
     * PAGES 19-20 (Longest substring w/o repeating chars)
     * method COMPLETED
     * @param str
     */
    public int longestUnique(String str){
        StringBuilder stringBuilder = new StringBuilder();

        //stringBuilder.append(str.charAt(0));
        for (int  i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) != str.charAt(i+1)){
                stringBuilder.append(str.charAt(i));
            }
        }

        //weird
        stringBuilder.append(str.charAt(str.length()-1));
        System.out.println(stringBuilder);
        return stringBuilder.length();
    }
}
