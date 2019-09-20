public class AddBinary {
    /*
    (char)的转换：(char)(48)=>'0' 而不是(char)(0)=>'0'
     */
    public static String addBinary(String a, String b) {
        String c="";
        if(a.length()<b.length()){
            c=a;
            a=b;
            b=c;
        }
        int i=0;
        int add=0;
        char[] res=new char[a.length()+1];
        int sum=0;
        while(i<b.length()){
            sum=a.charAt(a.length()-1-i)-'0'+b.charAt(b.length()-1-i)-'0'+add;
            if(sum>=2){  //进位
                add=1;
                res[res.length-1-i]=(char)(sum-2+'0');
            }else{
                add=0;
                res[res.length-1-i]=(char)(sum+'0');
            }
            i++;
        }
        while(i<a.length()){
            sum=a.charAt(a.length()-1-i)-'0'+add;
            if(sum>=2){  //进位
                add=1;
                res[res.length-1-i]=(char)(sum-2+'0');
            }else{
                add=0;
                res[res.length-1-i]=(char)(sum+'0');
            }
            i++;
        }
        if(add==1){
            res[0]='1';
            return String.valueOf(res);
        }else{
            return String.valueOf(res).substring(1,res.length);
        }

    }

    public static void main(String args[]){
        System.out.println(addBinary("0","1"));
    }
}
