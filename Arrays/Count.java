
import java.util.*;
public class Count {
    public static void main(String[] args) {
        // int num=123456;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("number of digits "+count);
    }
}
