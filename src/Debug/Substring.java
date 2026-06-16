package Debug;

public class Substring {
    public static void main(String[] args){
        String str = "barfoothefoobarman";
        String str1 = "foobar";
        String str2 ="barfoo";
        int n = str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(str.substring(i,j).equals(str1) || str.substring(i,j).equals(str2)) {
                    System.out.println(str.substring(i, j)+" "+i);
                }
            }
        }
    }
}
