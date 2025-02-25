import java.util.Scanner;

public class Str_pal2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string or number : ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();

        if(str.equals(rev)){
            System.out.println(str + " is a palindrome ");
        }else{
            System.out.println(str + " is not a palindrome ");
        }

        sc.close();
    }
    
}
