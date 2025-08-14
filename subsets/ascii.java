import java.util.ArrayList;

public class ascii {
    public static void main(String[] args) {
        // subseqAscii("", "abc");
        ArrayList<String> list=  subseqAsciii("", "abc");

        System.out.println(list);
        }
            static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
            char ch=up.charAt(0);
            subseqAscii(p+ch, up.substring(1));
            subseqAscii(p, up.substring(1));
            subseqAscii(p+(ch+0), up.substring(1));

        
    }
        static ArrayList<String> subseqAsciii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
            char ch=up.charAt(0);
            ArrayList<String> left= subseqAsciii(p+ch, up.substring(1));
            ArrayList<String> right=subseqAsciii(p, up.substring(1));
            ArrayList<String> asc=subseqAsciii(p+(ch+0), up.substring(1));
            left.addAll(right);
            left.addAll(asc);
            return left;

        
    }
        
    }


