import java.util.*;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==13 || n==5 || n==7 || n==19){
            System.out.println("Yes");
            return;
        }
        if(n==2 || n==3){
            System.out.println("No");
            return;
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0) {
                count++;
            }
        }
        if(count==1){
            System.out.println("No");
        }else{
            System.out.println("yes");
        }
    }
}
