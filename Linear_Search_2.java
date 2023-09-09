import java.util.Scanner;

public class Linear_Search_2 {
    public static void main(String[] args) {
        // Search the characters in the string is present or not
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String name=scan.nextLine();
        System.out.println("Please enter the target character:");
        char target=scan.next().charAt(0);
        boolean res=searchCharacter(name, target);
        System.out.println(res);
    }
    static boolean searchCharacter(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<=str.length()-1;i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
    
}
