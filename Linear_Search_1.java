import java.util.Scanner;

public class Linear_Search_1{
    public static void main(String[] args) {
        // search the target element in the array and return true and false
        int[] nums={10,20,34,76,12,123};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the target element");
        int target=scan.nextInt();
        boolean res=linearSearch(nums, target);
        System.out.println(res);
        

    }
     
    static boolean linearSearch(int[] arr,int target){
        if(arr.length ==0){
            return false;
        }
        for(int ans:arr){
            if(ans==target){
                return true;
            }
        }
        return false;
    }
}