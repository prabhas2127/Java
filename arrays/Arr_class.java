import java.util.Arrays;

public class Arr_class {
    
    public static void main(String[] args){

        int[] nums = {5,2,8,1,3};

        System.out.println("Original array : " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Sorted array : " + Arrays.toString(nums));

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {5,4,3,2,1};

        System.out.println("Arr1 equals to Arr2 ?? -> " + Arrays.equals(arr1, arr2));
        System.out.println("Arr1 equals to Arr3 ?? -> " + Arrays.equals(arr1, arr3));

        System.out.println("Arr1 : " + Arrays.toString(arr1));

        System.out.println("Length of Arr1 : " + arr1.length);

        int[] copied_arr = Arrays.copyOf(arr3, arr3.length);
        System.out.println("Copied array : " + Arrays.toString(copied_arr));

        int[] copied_arr_ext = Arrays.copyOf(arr3,7);
        System.out.println("Copied arr with extended length : " + Arrays.toString(copied_arr_ext));


    }
}
