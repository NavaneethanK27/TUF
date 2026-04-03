package Arrays.Hard;

import java.util.HashMap;

public class findmissingnumberandrepatingnumber {
    public static void main(String[] args){

        int[] nums ={3, 5, 4, 1, 1};
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int missing=-1;
        int repeated=-1;
        for(int i=1;i<=n;i++){
            if(map.containsKey(i)) {
                if (map.get(i) > i) {
                    missing = i;
                }
            }else{
                    repeated=i;
            }
        }
        System.out.println(missing+" "+repeated);

    }
}
