import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int even = 0, odd = 0;
        int digit;

        while(num != 0){
            digit = num % 10;

            if(digit % 2 == 0){
                even++;
            } else {
                odd++;
            }

            num /= 10;
        }

        System.out.println("Even digits in number : " + even);
        System.out.println("Odd digits in number : " + odd);

        sc.close();
    }
    
}
