import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        String str="M M THAJU";
        char[]arr=str.toCharArray();
        // System.out.println(Arrays.toString(arr));
        for(char ele:arr){
            System.out.println(ele);

        }
        String newt=new String(arr);
        System.out.println(newt);
    }
}
