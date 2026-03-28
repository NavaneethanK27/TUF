package String;

public class countandsay {
    public static String count(int n){
        if(n==1){
            return "1";
        }
        String result="";
        String fr = count(n-1);
        int count=1;
        for(int i=1;i<fr.length();i++){
            if(fr.charAt(i-1)==fr.charAt(i)){
               count++;
            }else{
              result+=count+""+fr.charAt(i-1);
              count=1;
            }
        }
        result+=count+""+fr.charAt(fr.length()-1);
        return result;
    }
    public static void main(String[] args){
        int n=2;
        System.out.println(count(n));
    }
}
