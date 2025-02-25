import java.util.Scanner;

public class Armstrong {

    static boolean isArmstrong(int num){

        int og_num = num;
        int sum = 0;
        int digits= String.valueOf(num).length();

        while(num != 0){

            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == og_num;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if(isArmstrong(number)){
            System.out.println(number + " is an Armstrong number.");
        } else{
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close();
    }
    
}
