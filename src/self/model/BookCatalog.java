package self.model;

public class BookCatalog {

    private int numOfBooks;
    private Book[] books;
    
    
    public BookCatalog(int lengthOfCatalog) {
        books = new Book[lengthOfCatalog];
    }

    public int size() {
        return books.length;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int addBook(Book bookAdded) {
        if(this.numOfBooks == books.length) {
            return -1;
        }
        
        books[numOfBooks] = bookAdded;
        numOfBooks++;
        return numOfBooks - 1;
    
    }

    public int unAvailableBook(Book bookUnAvailable) {
        int result = -1;
        for (int i = 0; i < books.length; i++) {
            if(bookUnAvailable.equals(books[i])) {
                books[i].setAvailable(false);
                result = i;
                break;
            }
        }
        
        return result;
    }

    @Override
    public String toString() {
        String listOfBooks = "***List of Books***\n";
        for (int i = 0; i < numOfBooks; i++) {
            listOfBooks += books[i] + "\n";
        }

        return listOfBooks;
    }

}
