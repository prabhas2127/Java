import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter base : ");
        int base = sc.nextInt();

        System.out.print("enter exponent : ");
        int expo = sc.nextInt();

        long result = 1;

        for(int i=1; i <= expo; i++){
            result *= base;
        }

        System.out.println(base + " ^ " + expo + " = " + result);

        sc.close();
    }
    
}
