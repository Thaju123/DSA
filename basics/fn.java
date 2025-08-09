package basics;
import java.util.Scanner;

public class fn {
        public static void main(String[] args) {
            for(int i=0;i<10;i++){
sum();
            }

    }
    static void sum(){
        Scanner in= new Scanner(System.in);
int a,b,sum;
System.out.println("first number");
        a=in.nextInt();
        System.out.println("second number");
        b=in.nextInt();
        sum=a+b;
System.out.println("sum"+sum);

}
}
