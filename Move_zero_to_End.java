class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int ind=0;
        int i=0;
        int n = arr.length;
        while (i<n){
            if(arr[i]!=0){
                arr[ind++]=arr[i];
            }
            i++;
        }
        while(ind<n){
            arr[ind]=0;
            ind++;
        }    
    }
}