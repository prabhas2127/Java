import java.util.Scanner;

public class Swap_2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a  : ");
        int a = sc.nextInt();

        System.out.print("Enter value for b : ");
        int b = sc.nextInt();

        System.out.println("Before swapping\ta : " + a + ", b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("After swapping\ta : " + a + ", b : " + b);

        sc.close();
    }
    
}
