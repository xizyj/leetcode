public class PlusOne {
    /*
    Given a non-empty array of digits representing a non-negative integer,
    plus one to the integer.
    The digits are stored such that the most significant digit is at the head of the list,
    and each element in the array contain a single digit.
    You may assume the integer does not contain any leading zero, except the number 0 itself.
    给定表示非负整数的非空数字数组，加上整数的1。
    存储数字使得最高有效数字位于列表的开头，并且数组中的每个元素包含单个数字。
     您可以假设整数不包含任何前导零，除了数字0本身。

     */

    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        digits[i]++;
        int add=0;
        while(i>=0){
            digits[i]+=add;
            if(digits[i]>=10){
                digits[i]=0;
                add=1;
            }else{
                add=0;
            }
            i--;
        }
        if(digits[0]==0){

            int[] res=new int[digits.length+1];
            res[0]=1;
            for(int j=0;j<digits.length;j++){
                res[j+1]=digits[j];
            }
            return res;

        }
        return digits;
    }


}
