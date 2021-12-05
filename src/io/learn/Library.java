package io.learn;

public class Library implements Cloneable {
	
	String bookname;
	
	
	

	public Library(String bookname) {
		super();
		this.bookname = bookname;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "Library [bookname=" + bookname + "]";
	}
	
	
	
	
	

}
