package Reader;

import java.time.LocalDate;
import java.util.ArrayList;


public class Reader {
    public static String fullName;
    public String cardNumber;
    public String faculty;
    public LocalDate DateOfBirth;
    public String Phone;
    public ArrayList<Book> books = new ArrayList<>();

    public Reader(String fullName, String cardNumber, String faculty, String Phone, LocalDate DateOfBirth) {
        Reader.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.DateOfBirth = DateOfBirth;
        this.Phone = Phone;
    }


    public void takeBook(int a) {
        String formattedOutput = String.format("%s took %d books", fullName, a);
        System.out.println(formattedOutput);
    }
    public void takeBook(String... BookTitles){
        StringBuilder Titles = new StringBuilder();
        for(String Title : BookTitles){
            Titles.append(Title).append(", ");
        }
        System.out.println(fullName + " took books: " + Titles.toString().trim());
    }
    public void takeBook(Book... books) {
        StringBuilder booksString = new StringBuilder();
        for (Book book : books) {
            booksString.append(Book.getName()).append(", ");
        }
        System.out.println(fullName + " took books: " + booksString.toString().trim());
    }

    public void ReturnBook(int a) {
        System.out.println(fullName + " returned " + a + " books");
    }
    public void returnBook(String... bookTitles) {
        StringBuilder booksString = new StringBuilder();
        for (String bookTitle : bookTitles) {
            booksString.append(bookTitle).append(", ");
        }
        System.out.println(fullName + " returned the books: " + booksString.toString().trim());
    }

    public void returnBook(Book... books) {
        StringBuilder booksString = new StringBuilder();
        for (Book book : books) {
            booksString.append(Book.getName()).append(", ");
        }
        System.out.println(fullName + " returned the books: " + booksString.toString().trim());
    }
}

