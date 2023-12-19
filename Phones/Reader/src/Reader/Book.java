package Reader;

public class Book {
        private static String name;
        private static String author;

        public Book(String name, String author) {
            Book.name = name;
            Book.author = author;
        }
    public static String getName() {
        return name;
    }
    public  static String getAuthor(){
            return author;
    }


}

