public class first {
    public static void main(String[] args) {
        int n=123321;
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(sum==original){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
