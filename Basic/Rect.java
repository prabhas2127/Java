import java.util.Scanner;

public class Rect {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length : ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth : ");
        double b = sc.nextDouble();

        double area = l * b;
        double perimeter = 2 * ( l + b);

        System.out.println("Area of rectangle : " + area);
        System.out.println("Perimeter of  rectangle : " + perimeter);

        sc.close();
    }

    
}
