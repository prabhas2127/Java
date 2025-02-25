public class Str_pal {

    public static void main(String[] args){

        String str = "HellolleH";

        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();

        if(str.equals(rev)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not a palindrome");
        }
    }
    
}
