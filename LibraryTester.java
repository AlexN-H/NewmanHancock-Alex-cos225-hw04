public class LibraryTester {
    public static void main(String[] args) {
       
        BookShelf shelfO = new BookShelf('O');
        BookShelf shelfT = new BookShelf('T');

       
        System.out.println(shelfO);
        System.out.println(shelfT);

        Book b1 = new Book("The Heart of the betrayed", "Crime");
        Book b2 = new Book("Our Hill of Stars", "Fantasy" );
        Book b3 = new Book("One of a Kind", "Science Fiction");
        Book b4 = new Book("The Vision of Roses", "Romance");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        shelfO.addBook(b1);
        shelfO.addBook(b2);
        shelfO.addBook(b3);
        shelfO.addBook(b4);

        shelfT.addBook(b1);
        shelfT.addBook(b2);
        shelfT.addBook(b3);
        shelfT.addBook(b4);

        System.out.println(shelfO);
        System.out.println(shelfT);

    }
}



