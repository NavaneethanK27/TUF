class Solution {
    public int[] diStringMatch(String s) {
        int d = s.length();
        int I = 0;
        int[] arr = new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i] = I;
                I++;
            }else{
                arr[i] = d;
                d--;
            }
        }
        arr[s.length()]=d;
        return arr;

    }
}