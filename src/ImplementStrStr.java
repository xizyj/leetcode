public class ImplementStrStr {
    /*
    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    返回haystack中第一次出现针的索引，如果针不是haystack的一部分，则返回-1。
     */

    public int strStr(String haystack, String needle) {
        if(needle.length()<=0){
            return 0;
        }
        int res=-1;
        for(int i=0;i<(haystack.length()-needle.length()+1);i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j;
                for(j=1;j<needle.length();j++){
                    if(haystack.charAt(i+j)==needle.charAt(j)){
                        continue;
                    }else{
                        break;
                    }
                }
                if(j==needle.length()){
                    res=i;
                    break;
                }
            }
        }
        return res;
    }

}
