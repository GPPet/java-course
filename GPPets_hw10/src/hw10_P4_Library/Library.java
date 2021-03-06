package hw10_P4_Library;

import java.util.HashMap;

public class Library {
	private String library;
	private String address;
	private Book book;
	private int bookCopies;
	private HashMap<Book, Integer> bookCollection;
	
	public Library(){
	}
	
	public Library(String library, String address, HashMap<Book, Integer> bookCollection) {
		super();
		this.library = library;
		this.address = address;
		this.bookCollection = bookCollection;
	}

	public String getLibrary() {
		return library;
	}
	public void setLibrary(String library) {
		this.library = library;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getBookCopies() {
		return bookCopies;
	}
	public void setBookCopies(int bookCopies) {
		this.bookCopies = bookCopies;
	}
	public HashMap<Book, Integer> getBookCollection() {
		return bookCollection;
	}
	public void setBookCollection(HashMap<Book, Integer> bookCollection) {
		this.bookCollection = bookCollection;
	}
	
	public HashMap<Book, Integer> addBookCopy(HashMap<Book, Integer> bookCollection, Book book, int newCopies){
		this.bookCollection = bookCollection;
		this.book = book;
		if(bookCollection.containsKey(book)==false) bookCollection.put(book, newCopies);
		else {
			int oldValue = bookCollection.get(book);
			int newValue = bookCollection.get(book) + newCopies;
			bookCollection.replace(book, oldValue, newValue);
		}
		return bookCollection;
	}
	
	public HashMap<Book, Integer> deleteBookCopy(HashMap<Book, Integer> bookCollection, Book book){
		this.bookCollection = bookCollection;
		this.book = book;
		int oldValue = bookCollection.get(book);
		int newValue = bookCollection.get(book) -1;
		bookCollection.replace(book, oldValue, newValue);
		return bookCollection;
	}

	@Override
	public String toString() {
		String result = "";
		result += "Library:\t" + getLibrary();
		result += "\nAddress:\t" + getAddress();
		result += "\nBook Collection:" ; 
		for(Book book : getBookCollection().keySet()){
			result += "\n" + book + "\nCopies:\t" + getBookCollection().get(book) + "\n";
		}
		return result;
	}
	
	
	
	

}
