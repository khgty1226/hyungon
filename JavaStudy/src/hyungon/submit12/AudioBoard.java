package hyungon.submit12;

public class AudioBoard extends Board {
	
	private String textAudio;

	
	public AudioBoard() {};
	
	public AudioBoard(int textNum, String textName, String textDate, String textContent, String textAudio) {
		super(textNum, textName, textDate, textContent);
		this.textAudio = textAudio;
	}

	public String getTextAudio() {
		return textAudio;
	}

	public void setTextAudio(String textAudio) {
		this.textAudio = textAudio;
	}
	
	
	
}
