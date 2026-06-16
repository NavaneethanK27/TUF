package Pattern;

public class Patterns {
    public void rectangular_star(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public void right_angled_triangle(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public void right_angled_number(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }System.out.println();
        }
    }

    public void right_angled_number2(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }System.out.println();
        }
    }

    public void  Inverted_right_pyramid(){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public void Inverted_right_pyramid_number(){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }
    }

    public void  Star_Pyramid(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void xpatern(){
        String str = "Program";
        int n=str.length();
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(str.charAt(i));
                }else if(j==n-1-i){
                    System.out.print(str.charAt(j));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Patterns p=new Patterns();
//        p.rectangular_star();
//        p.right_angled_triangle();
//        p.right_angled_number();
//        p.right_angled_number2();
//        p.Inverted_right_pyramid();
//        p.Inverted_right_pyramid_number();
//        p.Star_Pyramid();
        p.xpatern();
    }
}
