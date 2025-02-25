import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number or string : ");
        String input = sc.nextLine();

        if(isPalindrome(input)){
            System.out.println(input + " is palindrome");
        }else {
            System.out.println(input + " is not a palindrome");
        }
        
        sc.close();
    }

    public static boolean isPalindrome(String str){

        int left = 0, right = str.length() - 1;
        
        while(left < right){
            if(str.charAt(right) != str.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
