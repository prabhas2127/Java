class Shape {

    public double area(double l, double w){
        return l * w;
    }

    public double area(double r){
        return 3.14 * r * r;
    }
    
    public double area(double b, double h, boolean isTriangle){
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        
        Shape shape = new Shape();

        System.out.println("Area of rectangle : " + shape.area(5.0, 10.0));
        System.out.println("Area of Circle : " + shape.area(7.0));
        System.out.println("Area of Triangle : " + shape.area(6.0, 8.0, true));
    }
}
