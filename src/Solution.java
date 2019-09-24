import java.util.Scanner;

public class Solution {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(func("ciso<1234>"));
    }

    public static String func(String str){
        int start=0;
        int end=0;
        int flag=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z')&&flag==0){
                start=i;
                flag=1;
            }
            if((str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z')&&flag==1){
                end=i;
            }
            if(str.charAt(i)=='<'){
                break;
            }
        }
        return str.substring(start,end+1);

    }


}
