package Arrays.Hard;

public class Watering_Plants {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        int[] arr ={2,2,3,3};
        int capcity = 5;
        int water = capcity;
        int steps = 0;
        for(int i=0;i<arr.length;i++){

            if(water<arr[i]){
                steps+= 2*i;
                water = capcity;
            }
            water-=arr[i];
            steps++;
        }
        System.out.println(steps);
    }
}
