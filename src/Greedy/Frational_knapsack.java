package Greedy;

import java.util.ArrayList;

public class Frational_knapsack {
    public static int apporach_ratio(int[] profit,int[] weight,int n,int W){
        ArrayList<Integer>list = new ArrayList<>();
        int total =0;
        double[] ratio = new double[n];
        for(int i=0;i<n;i++){
            ratio[i]=((double)profit[i]/weight[i]);
        }

        while(W>0) {
            double maxratio = 0.0;
            for (int i = 0; i < n; i++) {
                maxratio = Math.max(ratio[i], maxratio);
            }
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (maxratio == ratio[i]) {
                    index = i;
                    break;
                }
            }

            int max = profit[index];
            W = W - weight[index];
            list.add(max);
            ratio[index] = 0;
        }

        System.out.println(list);
        for(int i:list){
            total+=i;
        }

        return total;
    }
    public static double apporach1(int[] profit,int[] weight,int n,int W){
        double totalprofit=0;
        ArrayList<Double>list = new ArrayList<>();
        Double max =0.0;
        while (W>0){
            max=0.0;
            int index=0;
            for(int i=0;i<n;i++){
                max = Math.max(profit[i],max);
            }

            for(int i=0;i<n;i++){
               if(profit[i]==max){
                   index = i;
                   break;
               }
            }
            if(weight[index]>=W){
                max = max * ((double)W / weight[index]);
            }
            W=W-weight[index];
            list.add(max);
            profit[index]=0;
        }
        for(double i:list){
            totalprofit+=i;
        }
        return totalprofit;
    }
    public static void main(String[] args){
        int[] profit = {60, 100, 120};
        int[] weight ={10, 20, 30};
        int n = 3;
        int W = 50;
//        System.out.println(apporach1(profit,weight,n,W));
         System.out.println(apporach_ratio(profit,weight,n,W));
    }
}
