class Solution {
    public static void merge_sort(int[] nums,int left,int right){
        if(left>=right){
            return;
        }

        int mid  = left+(right-left)/2;
        merge_sort(nums,left,mid);
        merge_sort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int n1 = mid - left+1;
        int n2 = right-mid;
        int[] l = new int[n1];
        int[] r = new int[n2];

        for(int i=0;i<n1;i++){
            l[i] = arr[left+i];
        }

        for(int i=0;i<n2;i++){
            r[i] = arr[mid+i+1];
        }

        int i=0,j=0,k=left;

        while(n1>i && n2>j){
            if(l[i]<r[j]){
                arr[k++]=l[i++];
            }else{
                arr[k++]=r[j++];
            }
        }

        while(i<n1){
            arr[k++] = l[i++];
        }

        while(j<n2){
            arr[k++] = r[j++];
        }


    }
    public int[] sortArray(int[] nums) {
          merge_sort(nums,0,nums.length-1);
          return nums;
    }
}