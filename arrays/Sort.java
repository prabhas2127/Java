import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " numbers : ");
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i < n - 1; i++){
            for(int j=0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        System.out.print("Sorted array : ");
        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();
    }
    
}
