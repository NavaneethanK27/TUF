package recursion;

public class basic {
    public static void print_1_n(int n){
        if(n==0)return;
        print_1_n(n-1);
        System.out.print(n+" ");
    }
    public static void print_n_1(int n){
        if(n==0)return;
        System.out.print(n+" ");
        print_n_1(n-1);

    }
    public  static int sum_first_n_numbers(int n){
        if(n==0)return 0;
        return n+sum_first_n_numbers(n-1);
    }

    public  static void reverse(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        reverse(arr,left+1,right-1);
    }
    public static int  sum(int n){
        if(n==0) return 0;
        return n%10+sum(n/10);
    }
    public  static  void print(int n){
        if(n==0)return;;
        System.out.println(n);
        print(--n);
    }
    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        return reverse(n/10,(rev*10+(n%10)));
    }
    public static int count_zero(int n,int count){
        if(n==0) return count;
        if(n%10==0){
             return count_zero(n/10,count+1);
        }else{
            return count_zero(n/10,count);
        }
    }
    public static void main(String[] args){
        int n=5;
//        print_1_n(n);
//        System.out.println();
//        print_n_1(n);
//        System.out.println();
//        System.out.print(sum_first_n_numbers(n));
//       int[] arr = {1,2,3,4,5};
//       reverse(arr,0,4);
//        System.out.println();
//       for(int i:arr){
//           System.out.print(i+" ");
//       }
//        System.out.println();
//       System.out.println(sum(123));
//       print(5);
//       System.out.println(reverse(123,0));

       System.out.println(count_zero(2002,0));
    }
}
