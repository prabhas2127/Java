import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n-------M-E-N-U-------");
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();
            
            if(choice == 5){
                System.out.println("Exiting.....!");
                break;
            }

            System.out.print("Enter first number : ");
            double n1 = sc.nextDouble();
            
            System.out.print("enter second number : ");
            double n2 = sc.nextDouble();

            double res = 0;

            switch(choice){

                case 1:
                res = n1 + n2;
                System.out.println("Addition : " + res);
                break;

                case 2:
                res = n1 - n2;
                System.out.println("Substraction : " + res);
                break;

                case 3:
                res = n1 * n2;
                System.out.println("Product : " + res);
                break;

                case 4:
                res = n1 / n2;
                System.out.println("Quotient : " + res);
            }
        }

    }

    
}
