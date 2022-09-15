package Assignment2;
import java.time.LocalDate;

public class question {
	private int id;
	private String content;
	private categoryQuestion categoryQuestion;
	private typeQuestion typeQuestion;
	private account creator;
	private LocalDate createDate;
	public question(int id, String content, categoryQuestion categoryQuestion, typeQuestion typeQuestion,
			account creator, LocalDate createDate) {
		super();
		this.id = id;
		this.content = content;
		this.categoryQuestion = categoryQuestion;
		this.typeQuestion = typeQuestion;
		this.creator = creator;
		this.createDate = createDate;
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
	public categoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}
	public void setCategoryQuestion(categoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}
	public typeQuestion getTypeQuestion() {
		return typeQuestion;
	}
	public void setTypeQuestion(typeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
	}
	public account getCreator() {
		return creator;
	}
	public void setCreator(account creator) {
		this.creator = creator;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public String toString() {
		return "Question [ id = " + id + ", content = " + content + ", categoryQuestion = " + categoryQuestion
				+ ", typeQuestion = " + typeQuestion + ", creator = " + creator + ", createDate = " + createDate + "]";
	}
}
