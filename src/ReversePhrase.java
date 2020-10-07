import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReversePhrase {

    /**
     * PAGE 12 (Reverse WORDS in a string)
     * reverse method COMPLETED
     * @param str
     */
    public String reverse(String str){
        return Arrays.stream(str.split(" ")).reduce((s,c) -> c+ " " + s).get() ;
    }
}
