public class Max_Num_Array_2D {
    public static void main(String[] args) {
        // Find the max number in 2D Array
        int[][] nums={
            {1,2,3,4,5},
            {0,-1,7,9,-19},
            {1,2,3,4,50},
            {10,90,89}
        };
        int ans=maxNum(nums);
        System.out.println("The Maximum Number is: "+ans );

    }
    static int maxNum(int[][] arr){
       int max= arr[0][0];
       for(int i=0;i<=arr.length-1;i++){
        for(int j=0;j<=arr[i].length-1;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    }
        return max;
       
    }
    
}
