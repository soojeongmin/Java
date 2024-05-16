package chap99_Homework.homework11;

public class Book {
	// 02
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	public Book() {
		
	}
	
	public void setBookInfo(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void printBookInfo() {
		System.out.println("제목: "+this.title);
		System.out.println("저자: "+this.author);
		System.out.println("출판사: "+this.publisher);
		System.out.println("가격: "+this.price+"원");
	}
}
