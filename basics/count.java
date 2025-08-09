public class count {
    public static void main(String[] args) {
        int n=123453673;
        int target=3;
        int count = 0;
        while(n>0){
            int rem=n%10;
            if(rem==target){
                count++;
                
            }
            n=n/10;
        }
        System.out.println("count="+count);
    }
}
