import java.util.Scanner;

public class Grades {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks of student (out of 100) : ");
        int marks = sc. nextInt();

        char grade;

        if(marks >= 90){
            grade = 'A';
        } else if(marks >= 80){
            grade = 'B';
        } else if(marks >= 70){
            grade = 'C';
        } else if(marks >= 60){
            grade = 'D';
        } else if(marks >= 50){
            grade = 'E';   
        }else {
            grade = 'F';
        }

        System.out.println("Student's Grade : " + grade);

        sc.close();
    }
    
}
