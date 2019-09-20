import java.util.Scanner;

public class Solution {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
    }

    public static boolean func(String str){
        if(str.charAt(0)==str.charAt(4)&&str.charAt(1)==str.charAt(3)){
            return true;
        }
        else
            return false;
    }


}
