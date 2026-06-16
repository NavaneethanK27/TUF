package Stack.Convex;
import java.util.*;
public class prefix_to_infix {
    public static String infix(String prefix){
        Stack<String>st = new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(Character.toString(ch));
            }
            else {
                String opt1 = st.pop();
                String opt2 = st.pop();
                String temp="("+ opt1 + ch + opt2 + ")";
                st.push(temp);
            }
        }
        return st.peek();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
//        String str = sc.nextLine();

        System.out.println(infix("*+ab-cd"));
    }
}
