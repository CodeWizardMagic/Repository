package Reader;


import java.time.LocalDate;

public class Main {
    public static void main(String[] arg22222222222222s){
        //Reader:
        Reader reader = new Reader("Ansar", "12345", "Computer Science", "555-1234", LocalDate.of(2004, 5, 1));
        Reader reader2 = new Reader("Olzhas", "1234", "Software Engineering", "444-1234", LocalDate.of(2006, 5, 18));
        Reader[] readers = {reader, reader2};

        Book Adventure = new Book("Adventures", "Author1");
        Book Dictionary = new Book("Dictionary", "Author2");
        Book Encyclopedia = new Book("Encyclopedia", "Author3");

        reader.takeBook(3);
        reader.takeBook("Adventures", "Dictionary", "Encyclopedia","nksofao");
        reader.takeBook(Adventure,Dictionary,Encyclopedia);

        readers[0].ReturnBook(2);
        readers[0].returnBook("Adventure");
        readers[1].returnBook(Adventure);

    }

    }
