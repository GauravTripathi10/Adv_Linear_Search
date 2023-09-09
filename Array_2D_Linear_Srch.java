import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_2D_Linear_Srch {
    public static void main(String[] args) {
        // Linear Search in 2D Array
        int[][] nums={
            {1,2,3,4},
            {12,23,45,56},
            {12,90,101,12},
            {20,2,3}
        };
        System.out.println("Enter the target element:");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] ans=Array_2D_Search(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Array_2D_Search(int[][] arr,int target){
        if(arr.length == 0){
            return new int[]{-1 -1};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1 -1};
    }
}
