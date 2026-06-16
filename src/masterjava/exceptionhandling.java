package masterjava;

public class exceptionhandling {
    public static void main(String[] args){
        int n=0;
        try{
            System.out.println(n/0);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Helo");
    }
}
