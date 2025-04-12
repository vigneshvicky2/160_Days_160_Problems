import java.util.Arrays;

public class rotate_array {

    public static void main(String[] arg) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // 3 4 5 1 2 
        int k = 3; // 5 4 3 2 1
        int n = arr.length;
        rot(0,k-1 , arr);
        System.out.println(Arrays.toString(arr));
        rot(k,n-1, arr);
        System.out.println(Arrays.toString(arr));
        rot(0,n-1 , arr);
        System.out.println(Arrays.toString(arr));

    }

    static void rot(int st, int en, int[] arr) {
        while(st<=en){
            arr[st]= arr[st]+arr[en] - (arr[en] =arr[st]);
            st++;
            en--;
        }

    }

}
 