import java.util.Scanner;

public class Arr_add {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int num : arr){
            sum += num;
        }

        System.out.println("Sum of array elements : " + sum);

        sc.close();
    }
    
}
