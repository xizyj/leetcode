public class RegularExpressionMatching {

    /*
    10. Regular Expression Matching
    Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.

    '.' Matches any single character.
    '*' Matches zero or more of the preceding element.

    The matching should cover the entire input string (not partial).

    给定输入字符串(s)和模式(p)，实现与支持正则表达式匹配'.'和'*'。
    '.'匹配任何单个字符。 '*'匹配前面元素的零个或多个。
    匹配应覆盖整个输入字符串（不是部分）。
     */

    public static boolean isMatch(String s, String p) {
        int i=0,j=0;
        while(i<s.length()&&j<p.length()){
            if(equalSelf(s.charAt(i),p.charAt(j))){
                i++;
                if(j+1<p.length()&&p.charAt(j+1)=='*'){

                }else{
                    j++;

                }
            }else{
                if(j+1<p.length()&&p.charAt(j+1)=='*'){

                    j=j+2;

                }else{
                    return false;
                }
            }
        }
        if(j+1<p.length()&&p.charAt(j+1)=='*'){
            j=j+2;
        }
        if(i==s.length()&&j==p.length()){
            return true;
        }else{
            return false;
        }

    }

    public static boolean equalSelf(char a, char b){
        if(b=='.'){
            return true;
        }
        if(a==b){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        System.out.println(isMatch("aab","c*a*b"));
    }
}
