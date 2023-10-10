// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Book {
    public String title;
    public String author;
    public int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static void main(String[] args) {


        Book[] bookList = new Book[5];

        bookList[0] = new Book("Narnia", "C.S Lewis", 1995);
        bookList[1] = new Book("Narnia", "C.S Lewis", 1995);
        bookList[2] = new Book("Narnia", "C.S Lewis", 1995);
        bookList[3] = new Book("Narnia", "C.S Lewis", 1995);
        bookList[4] = new Book("Narnia", "C.S Lewis", 1995);

        PrintBookAttributes.printTitle(bookList);
        PrintBookAttributes.printAuthor(bookList);
        PrintBookAttributes.printYear(bookList);


    }

    public static class PrintBookAttributes {

        public static void printTitle(Book[] bookList){
            for(int i = 0; i < bookList.length ; i++)
                System.out.println(bookList[i].title);
        }
        public static void printAuthor(Book[] bookList){
            for(int i = 0; i < bookList.length ; i++)
                System.out.println(bookList[i].author);
        }
        public static void printYear(Book[] bookList){
            for(int i = 0; i < bookList.length ; i++)
                System.out.println(bookList[i].year);
        }
    }
}