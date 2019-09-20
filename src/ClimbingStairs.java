import java.util.LinkedList;
import java.util.Queue;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        return func(n-1)+func(n-2);
    }

    public static int func(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }else{
            return func(n-1)+func(n-2);
        }
    }

    public static void main(String args[]){
        System.out.println(climbStairs(37));
        Queue<Integer> queue=new LinkedList<>();
    }
}
