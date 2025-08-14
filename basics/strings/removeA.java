public class removeA {
public static void main(String[] args) {
    // skip("", "thaaaaju");
    // String ans=skip2("thaaaju");
    // System.out.println(ans);
    System.out.println(skip3("haiapplehelloapplehellohaiappleapplappleappl"));
    
}
static void skip(String p,String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch=up.charAt(0);
    if(ch=='a'){
    skip(p, up.substring(1));
}else{
    skip(p+ch, up.substring(1));
}

}
static String skip2(String up){
    if(up.isEmpty()){
        return "";
    }
    char ch=up.charAt(0);
    if(ch=='a'){
   return  skip2(up.substring(1));
}else{
    return ch+skip2(up.substring(1));
}

}
static String skip3(String up){
    if(up.isEmpty()){
        return "";
    }
    char ch=up.charAt(0);
    if(up.startsWith("apple")){
   return  skip3(up.substring(5));
}else{
    return ch+skip3(up.substring(1));
}

}
}