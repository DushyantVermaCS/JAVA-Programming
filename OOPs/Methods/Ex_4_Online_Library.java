package OOPs.Methods;
import java.util.Scanner;

/* Problem Statement:
 You have to implement a  library using Java Class -> Library
*  Methods: addBook, issueBook, returnBook, showAvailableBooks
* Properties: Array to store the available books,
* Array to store the issued books
* */

class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[5];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        System.out.println(book + " book has been added!");
        no_of_books++;
    }

    void showAvailableBooks(){
        System.out.println("Available books are :");
        for(String b : this.books){
            if(b == null){
                continue;
            }
            else
                System.out.println("* " + b);
        }
    }

    void issueBook(String book){
        for(int i = 0; i < this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println(book + " has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("You give and an invalid book");
    }
    void returnBook(String book){
        addBook(book);
    }

}

public class Ex_4_Online_Library {
    public static void main(String[] args) {
        Library central = new Library();
        central.addBook("The Power of Subconscious mind");
        central.addBook("The Alchemist");
        central.addBook("Think and Grow Rich");
        central.addBook("Cracking the coding interview");

        central.showAvailableBooks();

        central.issueBook("The Alchemist");
    }
}
