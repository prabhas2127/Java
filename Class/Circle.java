
import java.awt.geom.Area;

class Circle {

    private double rad;

    public Circle(){
        this.rad = 1.0;
    }

    public Circle(double rad){
        this.rad = rad;
    }

    public double calc_area(){
        return Math.PI * rad * rad;
    }

    public void display(){
        System.out.println("radius : " + rad);
        System.out.println("area : " + calc_area());
    }

    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        System.out.println("Circle with default radius : ");
        c1.display();
        
        Circle c2 = new Circle(5.0);
        System.out.println("Circle with parameterized radius : ");
        c2.display();
    }
    
}
