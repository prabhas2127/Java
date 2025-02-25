import java.util.Scanner;

class Student {

    private int roll_no;
    private int[] marks = new int[3];
    private int total;
    private double avg;
    private char grade;

    public void getData(int roll_no, int[] marks){

        this.roll_no = roll_no;
        this.marks = marks;

        calc_total_avg();
    }

    private void calc_total_avg(){

        total = 0;
        for(int mark : marks){
            total += mark;
        }

        avg = total/3.0;

        if(avg >= 90) grade = 'A';
        else if(avg >= 75) grade = 'B';
        else if(avg >= 60) grade = 'C';
        else if(avg >= 50) grade = 'D';
        else if(avg >= 40) grade = 'E';
        else grade = 'F';
    }

    public void display(){

        System.out.println("Roll no : " + roll_no);
        System.out.println("Marks : " + marks[0] + " , " + marks[1] + " , " + marks[2]);
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);
        System.out.println("Grade : " + grade);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Student[] stud = new Student[5];

        for(int i=0; i<5; i++){
            stud[i] = new Student();
            System.out.print("Enter roll_no " + (i+1) + ": " );
            int roll_no = sc.nextInt();

            int[] marks = new int[3];
            System.out.print("Enter marks for 3 subjects : ");
            for(int j=0; j<3; j++){
                marks[j] = sc.nextInt();
            }
            stud[i].getData(roll_no, marks);
        }

        System.out.println("\n-------Student Details-------");
        for(Student std : stud){
            std.display();
            System.out.println();
        }

        sc.close();

    }
    
}
