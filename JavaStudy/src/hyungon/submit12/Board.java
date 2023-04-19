package hyungon.submit12;

public class Board {
	private int textNum;
	private String textName;
	private String textDate;
	private String textContent;
	
	
	
	
	
	public Board() {};
	

	
	public Board(int textNum, String textName, String textDate, String textContent) {
		super();
		this.textNum = textNum;
		this.textName = textName;
		this.textDate = textDate;
		this.textContent = textContent;
	}

	@Override
	public String toString() {
		return "Board [textNum=" + textNum + ", textName=" + textName + ", textDate=" + textDate + ", textContent="
				+ textContent + "]";
	}

	public int getTextNum() {
		return textNum;
	}

	public void setTextNum(int textNum) {
		this.textNum = textNum;
	}

	public String getTextName() {
		return textName;
	}

	public void setTextName(String textName) {
		this.textName = textName;
	}

	public String getTextDate() {
		return textDate;
	}

	public void setTextDate(String textDate) {
		this.textDate = textDate;
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
	
	
	
	
}
