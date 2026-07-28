class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
          freq[s.charAt(i)-'a']++; 
        }
        StringBuilder firsthalf = new StringBuilder();
        String middle = "";
        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
               middle = String.valueOf((char)('a'+i));
            }

            for(int j=0;j<freq[i]/2;j++){
              firsthalf.append((char)('a'+i));
            }
        }
        StringBuilder reverse = new StringBuilder(firsthalf).reverse();
        return firsthalf.toString()+middle+reverse.toString();
    }
}