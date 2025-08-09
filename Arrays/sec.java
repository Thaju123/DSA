public class sec {
    public static void main(String[] args) {
        int n=1996;
        if(n%100!=0 &&n%4==0 || n%400==0){
            System.out.println("leap");

        }
        else{
            System.out.println("not");
        }
    }
}
