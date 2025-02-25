import java.util.Scanner;

public class Sum {

    static int sum_digits(int num){
        int sum = 0;

        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter an integer : ");
        int num = sc.nextInt();

        System.out.println("Sum of digits : " + sum_digits(num));

        sc.close();

    }
    
}
