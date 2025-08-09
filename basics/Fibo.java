package basics;
import java.util.Scanner;

public class Fibo{
    public static void main(String[] args) {
Scanner in= new Scanner(System.in);
System.out.println("enyer value of n");
        int n=in.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
{
    System.out.println(a);
    int c=a+b;
    b=c;
    a=b;
}



  





    }
}
