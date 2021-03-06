package hw10_P4_Library;

public class Book {
	protected String title;
	protected String author;
	protected int pages;
	
	public Book(){
	}
	
	public Book(String title, String author, int pages){
		super();
		setTitle(title);
		setAuthor(author);
		setPages(pages);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		String result = "";
		result += "Title:\t" + getTitle();
		result += "\nAuthor:\t" + getAuthor();
		result += "\nPages:\t" + getPages();
		return result;
	}
	
	
	
}
