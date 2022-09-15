package Assignment2;

public class ExamQuestion {
	private exam exam;
	private question question;
	public ExamQuestion(exam exam, question question) {
		super();
		this.exam = exam;
		this.question = question;
	}
	public exam getExam() {
		return exam;
	}
	public void setExam(exam exam) {
		this.exam = exam;
	}
	public question getQuestion() {
		return question;
	}
	public void setQuestion(question question) {
		this.question = question;
	}
	public String toString() {
		return "ExamQuestion [ exam = " + exam + ", question = " + question + " ]";
	}
}
