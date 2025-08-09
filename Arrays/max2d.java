import java.util.*;
public class max2d {
     public static void main(String[] args) {
        int [][]arr={
            {1,2,3},{5,7,9},{4,0}
        };
        int ans=max2d(arr);
        System.out.println(ans);
    }
    static int max2d(int [][]arr){
            int max=arr[0][0];

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }

            }
        }
        return max;



}
}
