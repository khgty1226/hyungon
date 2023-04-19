package hyungon.submit10;

public class Book {
	private int no;    // 도서 번호
	private String title ; // 도서 제목
	private boolean rental = false; // 대여 여부
	
	

	public Book() {
		
	}
	
	public Book(int no , String title) {
		this.no =  no;
		this.title = title;
	}

	@Override
	public String toString() {
		if(this.rental) {
			return  no + ". ["+ title + "] " + "대여중";
		}else {
			return  no + ". ["+ title + "] " + "입고중";
		}
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isRental() {
		return rental;
	}

	public void setRental(boolean rental) {
		this.rental = rental;
	}
	
	
	
	
	
	
	
}
