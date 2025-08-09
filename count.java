public class count {
    public static void main(String[] args) {
        int n=100;
        int count=0;
        for(int i=0;i<n;i++){
            if(pali(i)){
                count++;
            System.out.println(i);
            }
        }
        System.out.println("count"+count);
        
        
    }
    static boolean pali(int n){
        int original=n;
        int sum=0;
            while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(sum==original){
           return true;
        }
        else{
           return false;
        }

    }
}
