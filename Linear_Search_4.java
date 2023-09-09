import java.util.Scanner;

public class Linear_Search_4 {
    public static void main(String[] args) {
        // Find the index is present in the array 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter the array ");
        for(int i=0; i<size; i++){
        nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target index :");
        int index=sc.nextInt();
        boolean ans=elementExists(nums, size, index);
        System.out.println(ans);
        
    }
    static boolean elementExists(int[] array,int size,int indx){
        if(array.length==0){
            return false;
        }
        else if(indx<size){
            return true;
        }
        return false;
    }
    
}
