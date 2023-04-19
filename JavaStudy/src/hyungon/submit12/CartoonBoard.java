package hyungon.submit12;

public class CartoonBoard extends Board {

	private String textImg;

	
	public CartoonBoard() {};
	
	public CartoonBoard(int textNum, String textName, String textDate, String textContent, String textImg) {
		super(textNum, textName, textDate, textContent);
		this.textImg = textImg;
	}

	public String getTextImg() {
		return textImg;
	}

	public void setTextImg(String textImg) {
		this.textImg = textImg;
	}
	
	
	
	
	
}
