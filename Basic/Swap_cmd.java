public class Swap_cmd {

    public static void main(String[] args){

        if(args.length < 2){
            System.out.println("Please provide two numbers as a command line arguments....");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Before swapping\ta : " + a + " , b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping\t a : " + a + " , b : " + b);
    }


    
}
