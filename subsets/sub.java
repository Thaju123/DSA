import java.util.ArrayList;

public class sub {
    public static void main(String[] args) {
        // subseq("", "abc");
        ArrayList<String> list=new ArrayList<>();
subseq2("", "abc", list);
System.out.println(list);
        
    }

    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
            char ch=up.charAt(0);
            subseq(p+ch, up.substring(1));
            subseq(p, up.substring(1));
        
    }
    static ArrayList<String> subseq2(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // Include the character
        subseq2(p + ch, up.substring(1), list);

        // Exclude the character
        subseq2(p, up.substring(1), list);

        return list; // Return after all recursive calls
    }
}
