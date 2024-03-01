import java.util.ArrayList;

public class BookShelf{
    public char firstLetter;
    public ArrayList <Book> books;

    public BookShelf(char firstLetter){
        this.firstLetter = firstLetter;
        this.books = new ArrayList<Book>();
    }

    public char getFirstletter(){
        return firstLetter;
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public void addBook(Book book){
        if(book.getTitle().charAt(0) == firstLetter && books.size() <= 8 ){
            books.add(book);
        }else{
            return;
        }

    }

    

    public void removeBook(Book book){
       books.remove(book);

    }

    public String toString() {
        String shelfInfo = "";

        if (books.isEmpty()) {
            shelfInfo += "Empty";
        } else {
            for (int i = 0; i < books.size(); i++) {
                shelfInfo += books.get(i).getTitle() + "   ";
            }
        }

        return shelfInfo.trim();
    }


}

