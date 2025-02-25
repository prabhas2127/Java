public class Str_eq {

    public static void main(String[] args){

        String str1 = new String("Hello");
        String str2 = new String("hello");

        if(str1.equals(str2)){
            System.out.println("Strings are exactly the same.....");
        }else {
            System.out.println("Strings are diffrent (case sensitive check)");
        }

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Strings are exactly the same (case in-sensitive check)");
        }else {
            System.out.println("Strings are diffrent even when ignore casse is employed.....");
        }
    }
    
}
