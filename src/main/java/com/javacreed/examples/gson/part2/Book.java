package com.javacreed.examples.gson.part2;

public class Book {
	private String[] authors;
	private String isbn10;
	private String isbn13;
	private String title;
	
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public String getIsbn10() {
		return isbn10;
	}
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}
	public String getIsbn13() {
		return isbn13;
	}
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString(){
	    final StringBuilder formatted = new StringBuilder();
	    formatted.append("title : ").append(title);
	    formatted.append("\n").
	    	append("isbn10 : ").append(isbn10).
	    	append("\nisbn13 : ").append(isbn13).
	    	append("\nWritten by:");
	    for (final String author : authors) {
	      formatted.append("\n  >> ").append(author);
	    }

	    return formatted.toString();
	}
	
}
