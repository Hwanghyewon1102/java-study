package sec01.homework;

public class Book implements Comparable<Book>{
	
	private String title;
	private String author;
	private String genre;
	private String category;
	private int price;
	
	public Book() {}
	public Book(String title, String author, String genre, int price) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	public int getPrice() {
		return price;
	}
	
    @Override
    public int compareTo(Book book) {
        return this.title.compareTo(book.getTitle()); // 제목 기준 오름차순
    }

    @Override
    public String toString() {
       
		return "제목: " + title + ", 저자: " + author + ", 장르: " + category + ", 가격: " + price;
    }




}
