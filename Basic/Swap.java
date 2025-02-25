import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int t = a;
        a = b;
        b = t;

        System.out.println("after swapping\ta : " + a + ", b = " + b);
        sc.close();

        
    }
    
}
