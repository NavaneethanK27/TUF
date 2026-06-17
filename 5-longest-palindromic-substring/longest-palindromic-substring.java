class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end  = 0;
        String res = "";
        for(int i=0;i<s.length();i++){
            
            String len1 = expand(s,i,i);
            String len2 = expand(s,i,i+1);
            // int len = math.max(len1,len2);

            // count = Math.max(count,len);
            if(len1.length()>res.length()){
                res=len1;
            }
            if(len2.length()>res.length()){
                res=len2;
            }
        }
        return res;
    }
    public static String expand(String s , int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1,right);
    }
}