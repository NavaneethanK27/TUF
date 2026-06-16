package TCS;

public class Unique_key_Words {
    public static void main(String[] args){
        String str1 = "aaaaaabaa";

        String str2 = "Aaaaaaaa";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int[] freq = new int[26];
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            freq[ch-'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>=1){
                System.out.println((char)(i+'a'));
                return;
            }
        }


    }
}
