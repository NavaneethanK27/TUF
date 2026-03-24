package Debug;
import java.util.*;
public class selfdrivingcar {
    public static void main(String[] args) {
        int total=0;
        int n=8;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        int backdiff=0;
        for(int i=n;i>=1;i--){
            backdiff+=i;
            if(total==backdiff){
                System.out.print(i);
                return;
            }
            total=total-i;
        }
        System.out.print(-1);

    }
}
