import java.util.Scanner;

class Book {

    private String title;
    private String author;
    private String ISBN;

    public void accept_data(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void printData(){
        System.out.println("-------BOOK DETAILS-------");
        System.out.println("title : " + title);
        System.out.println("author : " + author);
        System.out.println("ISBN : " + ISBN);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title : ");
        String title = sc.nextLine();

        System.out.print("Enter author's name : ");
        String author = sc.nextLine();

        System.out.print("Enter ISBN : ");
        String ISBN = sc.nextLine();

        Book book = new Book();
        book.accept_data(title, author, ISBN);
        book.printData();

        sc.close();
    }
    
}
