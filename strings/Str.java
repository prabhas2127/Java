public class Str {

    public static void main(String[] args){

        String str1 = "Hello ";
        String str2 = "world...";

        System.out.println("Length of str1 : " + str1.length());
        System.out.println("Length of str2 : " + str2.length());

        String concat_str = str1.concat(str2);
        System.out.println("Concatenated string : " + concat_str);

        String str_spaces = "   Java Programming   ";
        System.out.println("String with spaces : " + str_spaces);
        System.out.println("String with removed spaces : '" + str_spaces.trim() + "'");
    }
    
}
