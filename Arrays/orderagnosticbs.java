public class orderagnosticbs {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int target=2;
        int result=order(arr,target);
        System.out.println(result);

}
static int order(int[]arr,int target){
            int first=arr[0];
        int last=arr[arr.length-1];
        if(first<last){
            return BinarysearchAsc(arr,target);
        
}
else return BinarysearchDsc(arr,target);
    }

         static int BinarysearchAsc(int []arr,int target){
            int start = 0;
            int end = arr.length - 1;
                    System.out.println("This is in ascending order");


            while(start<=end){
         int mid = start + ((end - start) / 2);
                if(target<arr[mid]){
                    end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;

            }else{
            return mid;
            }
        }
        return-1;
    
}

 static int BinarysearchDsc(int []arr,int target){
            int start = 0;
            int end = arr.length - 1;
                System.out.println("This is in Descending  order");

            while(start<=end){
         int mid = start + ((end - start) / 2);
                if(target>arr[mid]){
                    end=mid-1;
            }
            else if(target<arr[mid]){
                start=mid+1;

            }else{
            return mid;
            }
        }

        return-1;
    
}
}

