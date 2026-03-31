package Arrays.Easy;

public class Secondlargest {
    public static int secondsmallest(int[] arr,int n){
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<secondsmallest && arr[i]!=smallest){
                secondsmallest=arr[i];
            }
        }
        return secondsmallest;
    }
    public static int secondlarget(int[] arr,int n){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args){
        int[] arr = {1,9,3,5,7,4,2,0};
        System.out.println(secondlarget(arr,arr.length));
        System.out.println(secondsmallest(arr,arr.length));
    }
}
