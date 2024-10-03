public class Solution {
    static Boolean isPalindrome(String s){
        char [] s1=s.toCharArray();
        char [] s2=new char[s1.length];
        int j=0;
        for(int i=s1.length-1;i>=0;i--){
            s2[j]=s1[i];
            j=j+1;
        }
        return Arrays.equals(s1,s2) ;
    }}