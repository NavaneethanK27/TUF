package String.Regex;

public class Wildcardmatching {
    public static void main(String[] args){
        String s="abcde";
        String p="a?c*";
        int i=0;
        int j=0;
        int n=s.length();
        int m=p.length();
        int match=0;
        int star=-1;
        while(i<n){
            if(j<m && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')){
                i++;
                j++;
            }else if(j<m && p.charAt(j)=='*'){
                star=j;
                match=i;
                j=star+1;
            }else if(star!=-1){
                j=star+1;
                match=match+1;
                i=match;

            }else {
                System.out.println("false");
                return;
            }
        }
        while(j<m && p.charAt(j)=='*'){
            j++;
        }
        if(j==m) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
