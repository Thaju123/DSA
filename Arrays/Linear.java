public class Linear {
    public static void main(String[] args) {
        
        int []arr={1,2,5,4,4,6};
        int target=4;
        System.out.println(lsearch(arr,target));
    }


        static int lsearch(int [] arr, int target){
       
       if(arr.length==0){
       return -1;}
       for(int i=0;i<arr.length;i++){
        int element=arr[i];
        if(element==target){
            return i;
        }
       }
       return-1;

       
        }
    }

