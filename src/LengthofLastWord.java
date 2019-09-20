public class LengthofLastWord {

    /*
    Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
    return the length of last word in the string.
    If the last word does not exist, return 0.


    给定字符串s由大写/小写字母和空格字符''组成，返回字符串中最后一个单词的长度。 如果最后一个单词不存在，则返回0。
     */

    public int lengthOfLastWord(String s) {
        if(s.length()<=0){
            return 0;
        }
        int j=s.length()-1;
        while(j>=0&&s.charAt(j)==' '){
            j--;
        }
        if(j==-1){
            return 0;
        }
        for(int i=j;i>=0;i--){
            if(s.charAt(i)==' '){
                return j-i;
            }
        }
        return j+1;
    }
}
