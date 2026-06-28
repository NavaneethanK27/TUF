class Solution {
    public String removeDuplicates(String s) {
       Stack<Character>st = new Stack<>();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        // st.push(ch);
        if(!st.isEmpty() && st.peek()==ch){
          while(!st.isEmpty() && st.peek()==ch){
          st.pop();
         }
        }else{
          st.push(ch);
        }

       }  
       System.out.println(st);
       String res = "";
       for(char ch:st){
        res+=ch;
       }
       return res;
    } 
}