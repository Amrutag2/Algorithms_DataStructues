/* You have to implement a library using java class "Library"
* Methods: addBook, issueBook,returnBook, showAvailableBooks
* Properties : array to store the available books
* array to store the issued books */

class Library{
    String [] books;
    int noofBooks;
    Library(){
        this.books = new String[100];
        this. noofBooks=0;

    }
    void addBook(String book){
        this.books[noofBooks]= book;
        noofBooks++;
        System.out.println(book+" book has bean added");
    }
    void issueBook(String book){

            for(int i=0;i<this.books.length;i++) {

                if (this.books[i].equals(book)) {
                    System.out.println("the book has been issued");
                    this.books[i]= null;
                    return;
                }

            }
        System.out.println("This book does not exits");


    }
    void returnBook(String book){
        addBook(book);

    }
    void showAvailableBooks(){
        System.out.println("Available books");
        for(String ele:this.books){
            if(ele == null){
                continue;
            }
            System.out.println("* "+ele);
        }
    }

}
public class CWH_61_EX4 {
    public static void main(String[] args) {
        Library centralib = new Library();
        centralib.addBook("Happy Life");
        centralib.addBook("Atomic Habits");
        centralib.showAvailableBooks();
        centralib.issueBook("Atomic Habits");
        centralib.showAvailableBooks();
        centralib.returnBook("c++");
        centralib.showAvailableBooks();
    }
}
