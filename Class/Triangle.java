import java.util.Scanner;

class Triangle {
    private double base;
    private double height;

    public void getData(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        
        Triangle triangle = new Triangle();
        triangle.getData(base, height);
        
        System.out.println("Area of the triangle: " + triangle.area());
        
        scanner.close();
    }
}
