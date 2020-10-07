import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TwoSum {

    /**
     * getTwoSum method COMPLETED
        - no test made (void method)
     * @param nums
     */

    public void getTwoSumTwo(int [] nums){
        //Ex: [{3,4,1,5,2}]
        //Test input: ts.getTwoSumTwo(new int [] {1,2,3,4,5});
        //Test Input 2: ts.getTwoSumTwo(new int [] {3,6,1,13,9});

        ArrayList al = new ArrayList<Integer>();
        for (int nbr: nums) {
            al.add(nbr);
        }

        al.sort(Comparator.naturalOrder());

        int []newArray = new int[al.size()];

        for(int i = 0; i< al.size(); i++){
            newArray[i] = (int) al.get(i);
        }

        try{
            System.out.println("Enter a number foo");
            Scanner scanner = new Scanner(System.in);
            int targetNum = scanner.nextInt();

            for (int i = 0; i < al.size(); i++){
                int tmp = targetNum - newArray[i];

                if(targetNum - newArray[i] == tmp && tmp > 0 && newArray[i] > 0 && al.contains(tmp)){
                    System.out.println(newArray[i] + " " + tmp);
                }
            }

        } catch (Exception e){
            System.out.println("Well ill be damned");
        }
    }


    public int findNumber(int num){

        return num;
    }


    public void addNumber(int num){
        
    }

    //default constructor
    //public TwoSum (){}
}
