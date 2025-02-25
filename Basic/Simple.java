import java.util.Scanner;

public class Simple {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount (p) : ");
        double p = sc.nextDouble();

        System.out.print("Enter rate of interst (r) : ");
        double i = sc.nextDouble();

        System.out.print("Enter time in years (t) : ");
        double t = sc.nextDouble();

        double si = (p * i * t) / 100;

        System.out.print("Simple Interest : " + si);

        sc.close();
    }
    
}
