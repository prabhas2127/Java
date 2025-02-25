public class Str_sort {

    public static void main(String[] args) {
        
        String[] cities = {"Mumbai", "Delhi", "Bangalore", "Chennai", "Kolkata"};

        for(int i=0; i < cities.length - 1; i++){
            for(int j = i+1; j < cities.length; j++){
                if(cities[i].compareTo(cities[j]) > 0){

                    String temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }

        System.out.println("Sorted city names : ");
        for(String city : cities){
            System.out.println(city);
        }
    }
    
}
