public class Sqrt {

    public static int mySqrt(int x) {

        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        long low=1;
        long high=x;
        long mid=0;
        while(true){
            mid=(low+high)/2;
            if(mid*mid==x) {
                return (int)mid;
            }else if(mid*mid<x&&(mid+1)*(mid+1)>x){
                return (int)mid;
            }else if(mid*mid<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

    }

    public static void main(String args[]){
        System.out.println(mySqrt(2147395599));
    }
}
