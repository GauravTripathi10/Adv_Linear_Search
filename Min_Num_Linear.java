import java.util.Scanner;

public class Min_Num_Linear {
    public static void main(String[] args) {
        // find the minimum number in the given array
        int size=5;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[size];
        System.out.println("Enter the array element:");
        for (int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans=minimumNumber(arr);
        System.out.println(ans);
    }
    static int minimumNumber(int[] nums){
        int minNum=nums[0];
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]<minNum){
                minNum=nums[i];
            }
        }
        return minNum;

    }
}
