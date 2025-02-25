import java.util.Scanner;

public class For_fun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number : ");
        double n1 = sc.nextDouble();

        System.out.print("enter an operator ( + - * /) : ");
        char operator = sc.next().charAt(0);

        System.out.print("enter second number : ");
        double n2 = sc.nextDouble();

        double result;

        switch(operator){

            case '+':
            result = n1 + n2;
            System.out.println("Result : " + result);
            break;

            case '-':
            result = n1 - n2;
            System.out.println("Result : " + result);
            break;

            case '*':
            result = n1 * n2;
            System.out.println("Result : " + result);
            break;

            case '/':
            if(n2 != 0){
                result = n1 / n2;
                System.out.println("Result : " + result);
            } else { 
                System.out.println("Error : Division by zero is not possible...");
            }
            break;
            default:
                System.out.println("Invalid operator ! please enter valid one.....");
        }

        sc.close();
    }
}
