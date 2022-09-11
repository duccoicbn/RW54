package Assignment_1;
import java.time.LocalDate;

import javax.sound.midi.Soundbank;

import Assignment_1.position.positionName;
import Assignment_1.typeQuestion.TypeName;
import Assignment_1.categoryQuestion.CategoryName;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		department dep1 = new department(1, "Sale");
		department dep2 = new department(2, "Giam doc");
		department dep3 = new department(3, "Ky thuat");
		department dep4 = new department(4, "Tai chinh");
		System.out.println(dep1.toString());
		System.out.println(dep2.toString());
		System.out.println(dep3.toString());
		System.out.println(dep4.toString());
		
		position pos1 = new position(1, positionName.DEV);
		position pos2 = new position(2, positionName.TEST);
		position pos3 = new position(3, positionName.SECRUM_MASTER);
		position pos4 = new position(4, positionName.PM);
		System.out.println(pos1.toString());
		System.out.println(pos2.toString());
		System.out.println(pos3.toString());
		System.out.println(pos4.toString());
		
		account acc1 = new account(1, "admin@gmail.com", "Username1", "Fullname1", dep4, pos4, LocalDate.of(2020, 12, 23));
		account acc2 = new account(2, "Email2@gmail.com", "Username2", "Fullname2", dep1, pos4, LocalDate.now());
		account acc3 = new account(3, "Email3@gmail.com", "Username2", "Fullname3", dep2, pos3, LocalDate.now());
		account acc4 = new account(4, "Email4@gmail.com", "Username2", "Fullname4", dep3, pos1, LocalDate.now());
		System.out.println(acc1.toString());
		
		group group1 = new group(1, "Testing System", acc3, LocalDate.now());
		group group2 = new group(2, "Development", acc1, LocalDate.now());
		group group3 = new group(3, "VTI Sale 01", acc2, LocalDate.now());
		group group4 = new group(4, "Management", acc4, LocalDate.now());
		System.out.println(group1.toString());
		
		groupAccount groupAccount1 = new groupAccount(group1, new account[] { acc1, acc2 }, LocalDate.now());
		groupAccount groupAccount2 = new groupAccount(group2, new account[] { acc1, acc2, acc3 }, LocalDate.now());
		groupAccount groupAccount3 = new groupAccount(group3, new account[] { acc1, acc3 }, LocalDate.now());
		groupAccount groupAccount4 = new groupAccount(group4, new account[] { acc1, acc2, acc3, acc4 }, LocalDate.now());
		System.out.println(groupAccount1.toString());
		
		typeQuestion typeQuestion1 = new typeQuestion(1, TypeName.ESSAY);
		typeQuestion typeQuestion2 = new typeQuestion(2, TypeName.MULTIPLE_CHOICE);
		System.out.println(typeQuestion1.toString());
		System.out.println(typeQuestion2.toString());
		
		categoryQuestion categoryQuestion1 = new categoryQuestion(1, CategoryName.JAVA);
		categoryQuestion categoryQuestion2 = new categoryQuestion(2, CategoryName.DOT_NET);
		categoryQuestion categoryQuestion3 = new categoryQuestion(3, CategoryName.SQL);
		categoryQuestion categoryQuestion4 = new categoryQuestion(4, CategoryName.RUBY);
		categoryQuestion categoryQuestion5 = new categoryQuestion(5, CategoryName.POSTMAN);
		System.out.println(categoryQuestion1.toString());
		
		question question1 = new question(1, "Cau hoi ve Java", categoryQuestion1, typeQuestion2, acc4, LocalDate.now());
		question question2 = new question(2, "Cau hoi ve PHP", categoryQuestion2, typeQuestion2, acc1, LocalDate.now());
		question question3 = new question(3, "Cau hoi ve Ruby", categoryQuestion4, typeQuestion2, acc2, LocalDate.now());
		question question4 = new question(4, "Cau hoi ve .Net", categoryQuestion2, typeQuestion2, acc3, LocalDate.now());
		question question5 = new question(5, "Cau hoi ve PostMan", categoryQuestion5, typeQuestion2, acc4, LocalDate.now());
		System.out.println(question1.toString());
		
		answer answer1 = new answer(1, "Tra loi 01", question5, true);
		answer answer2 = new answer(2, "Tra loi 02", question3, true);
		answer answer3 = new answer(3, "Tra loi 03", question4, true);
		answer answer4 = new answer(4, "Tra loi 04", question2, true);
		answer answer5 = new answer(5, "Tra loi 05", question1, true);
		answer answer6 = new answer(6, "Tra loi 06", question1, true);
		answer answer7 = new answer(7, "Tra loi 07", question1, true);
		answer answer8 = new answer(8, "Tra loi 08", question5, true);
		System.out.println(answer1.toString());
		
		exam exam1 = new exam(1, "VTIQ001", "Đề thi C#", categoryQuestion1, 60, acc4, LocalDate.now());
		exam exam2 = new exam(2, "VTIQ002", "Đề thi PHP", categoryQuestion2, 120, acc3, LocalDate.now());
		exam exam3 = new exam(3, "VTIQ003", "Đề thi .Net", categoryQuestion3, 90, acc2, LocalDate.now());
		exam exam4 = new exam(4, "VTIQ004", "Đề thi Java", categoryQuestion5, 60, acc1, LocalDate.now());
		exam exam5 = new exam(5, "VTIQ005", "Đề thi SQL", categoryQuestion4, 90, acc2, LocalDate.now());
		exam exam6 = new exam(6, "VTIQ006", "Đề thi C#", categoryQuestion3, 120, acc1, LocalDate.now());
		System.out.println(exam1.toString());
		
		ExamQuestion examQuestion1 = new ExamQuestion(exam1, question4);
		ExamQuestion examQuestion2 = new ExamQuestion(exam2, question2);
		ExamQuestion examQuestion3 = new ExamQuestion(exam3, question3);
		ExamQuestion examQuestion4 = new ExamQuestion(exam4, question1);
		System.out.println(examQuestion1.toString());
		
	}

}