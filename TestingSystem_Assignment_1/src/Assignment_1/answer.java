package Assignment_1;

public class answer {
	private int id;
	private String content;
	private question question;
	private boolean isCorrect;
	public answer(int id, String content, question question, boolean isCorrect) {
		super();
		this.id = id;
		this.content = content;
		this.question = question;
		this.isCorrect = isCorrect;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public question getQuestion() {
		return question;
	}
	public void setQuestion(question question) {
		this.question = question;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	public String toString() {
		return "Answer [ id = " + id + ", content = " + content + ", question = " + question + ", isCorrect = " + isCorrect
				+ " ]";
	}
}
