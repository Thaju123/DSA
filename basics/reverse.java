import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int num=12345;
        int rev=0;

        while(num>0){
            int rem=num%10;
             num=num/10;
            rev=rev*10+rem;
    
        }
        System.out.println("Reverse of the number is: "+rev);
    }
    
}
