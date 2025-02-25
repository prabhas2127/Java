
class Sum_ol{

    public int sum(int a, int b){
        return a + b;
    }

    public int sum (int a, int b, int c){
        return a + b + c;
    }

    public double sum(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        
        Sum_ol calc = new Sum_ol();

        System.out.println("Sum of two ints : " + calc.sum(5, 10));
        System.out.println("Sum of three ints : " + calc.sum(5, 10, 15));
        System.out.println("Sum of two doubles : " + calc.sum(2.71, 3.14));
    }
}
