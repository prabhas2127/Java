public class Arr_mat {
    
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1,2,3},
            {4,5,6}
        };

        System.out.println("Matrix : ");
        for(int[] row : matrix){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
