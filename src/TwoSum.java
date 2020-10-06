import java.util.Scanner;
// atnoerh test
//tst3

public class TwoSum {
    public int getTwoSum (int [] nums){


        try {
            Scanner scanner = new Scanner(System.in);
            int targetNum = scanner.nextInt();
            //int tmp = 0;

            for (int i = 1; i < nums.length-1; i++){
                int tmp = targetNum - nums[i];
                //tmp++;
                if(targetNum - nums[i] == tmp){
                    System.out.println(nums[i] + " " + tmp);
                }

            }
        }catch (Exception e){
            System.out.println("Some'n fcked up");
        }

        return 0;
    }
    public TwoSum (){}
    //test
}
