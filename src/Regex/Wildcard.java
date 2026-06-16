package Regex;

public class Wildcard {
    public static void main(String[] args){
        String s = "aa", p = "*";
        int m=s.length();
        int n=p.length();
        int i=0;
        int j=0;
        int star=-1;
        int match=0;
        while(i<m){
            if(j<n && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')){
                i++;
                j++;
            }else if(j<n && p.charAt(j)=='*'){
                star=j;
                match=i;
                j=star+1;
            }else if(star!=-1){
                match=match+1;
                i=match;
                j=star+1;
            }else{
                System.out.println("False");
                return;
            }
        }
        while(j<n && p.charAt(j)=='*'){
            j++;
        }
        System.out.println(j==m);

    }
}
