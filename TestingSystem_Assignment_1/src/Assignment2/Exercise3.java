package Assignment2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import Assignment2.position.positionName;
import Assignment2.typeQuestion.TypeName;
import Assignment2.categoryQuestion.CategoryName;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		department dep1 = new department(1, "Sale");
		department dep2 = new department(2, "Giam doc");
		department dep3 = new department(3, "Ky thuat");
		department dep4 = new department(4, "Tai chinh");
		position pos1 = new position(1, positionName.DEV);
		position pos2 = new position(2, positionName.TEST);
		position pos3 = new position(3, positionName.SECRUM_MASTER);
		position pos4 = new position(4, positionName.PM);
		account acc1 = new account(1, "admin@gmail.com", "Username1", "Fullname1", dep4, pos4,
				new Date());
		account acc2 = new account(2, "Email2@gmail.com", "Username2", "Fullname2", dep1, pos4, new Date());
		account acc3 = new account(3, "Email3@gmail.com", "Username2", "Fullname3", dep2, pos3, new Date());
		account acc4 = new account(4, "Email4@gmail.com", "Username2", "Fullname4", dep3, pos1, new Date());
		group group1 = new group(1, "Testing System", acc3, new Date());
		group group2 = new group(2, "Development", acc1, new Date());
		group group3 = new group(3, "VTI Sale 01", acc2, new Date());
		group group4 = new group(4, "Management", acc4, new Date());
		groupAccount groupAccount1 = new groupAccount(group1, new account[] { acc1, acc2 }, new Date());
		groupAccount groupAccount2 = new groupAccount(group2, new account[] { acc1, acc2, acc3 }, new Date());
		groupAccount groupAccount3 = new groupAccount(group3, new account[] { acc1, acc3 }, new Date());
		groupAccount groupAccount4 = new groupAccount(group4, new account[] { acc1, acc2, acc3, acc4 }, new Date());
		typeQuestion typeQuestion1 = new typeQuestion(1, TypeName.ESSAY);
		typeQuestion typeQuestion2 = new typeQuestion(2, TypeName.MULTIPLE_CHOICE);
		categoryQuestion categoryQuestion1 = new categoryQuestion(1, CategoryName.JAVA);
		categoryQuestion categoryQuestion2 = new categoryQuestion(2, CategoryName.DOT_NET);
		categoryQuestion categoryQuestion3 = new categoryQuestion(3, CategoryName.SQL);
		categoryQuestion categoryQuestion4 = new categoryQuestion(4, CategoryName.RUBY);
		categoryQuestion categoryQuestion5 = new categoryQuestion(5, CategoryName.POSTMAN);
		question question1 = new question(1, "Cau hoi ve Java", categoryQuestion1, typeQuestion2, acc4, LocalDate.now());
		question question2 = new question(2, "Cau hoi ve PHP", categoryQuestion2, typeQuestion2, acc1, LocalDate.now());
		question question3 = new question(3, "Cau hoi ve Ruby", categoryQuestion4, typeQuestion2, acc2, LocalDate.now());
		question question4 = new question(4, "Cau hoi ve .Net", categoryQuestion2, typeQuestion2, acc3, LocalDate.now());
		question question5 = new question(5, "Cau hoi ve PostMan", categoryQuestion5, typeQuestion2, acc4, LocalDate.now());
		answer answer1 = new answer(1, "Tra loi 01", question5, true);
		answer answer2 = new answer(2, "Tra loi 02", question3, true);
		answer answer3 = new answer(3, "Tra loi 03", question4, true);
		answer answer4 = new answer(4, "Tra loi 04", question2, true);
		answer answer5 = new answer(5, "Tra loi 05", question1, true);
		answer answer6 = new answer(6, "Tra loi 06", question1, true);
		answer answer7 = new answer(7, "Tra loi 07", question1, true);
		answer answer8 = new answer(8, "Tra loi 08", question5, true);
		exam exam1 = new exam(1, "VTIQ001", "Đề thi C#", categoryQuestion1, 60, acc4, new Date());
		exam exam2 = new exam(2, "VTIQ002", "Đề thi PHP", categoryQuestion2, 120, acc3, new Date());
		exam exam3 = new exam(3, "VTIQ003", "Đề thi .Net", categoryQuestion3, 90, acc2, new Date());
		exam exam4 = new exam(4, "VTIQ004", "Đề thi Java", categoryQuestion5, 60, acc1, new Date());
		exam exam5 = new exam(5, "VTIQ005", "Đề thi SQL", categoryQuestion4, 90, acc2, new Date());
		exam exam6 = new exam(6, "VTIQ006", "Đề thi C#", categoryQuestion3, 120, acc1, new Date());
		ExamQuestion examQuestion1 = new ExamQuestion(exam1, question4);
		ExamQuestion examQuestion2 = new ExamQuestion(exam2, question2);
		ExamQuestion examQuestion3 = new ExamQuestion(exam3, question3);
		ExamQuestion examQuestion4 = new ExamQuestion(exam4, question1);
//		Question 1:
//		In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//		dạng vietnamese
		

		System.out.println("Question 1");
//		System.out.println(exam1.getCreateDate());
		Locale locale = new Locale("vn", "VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateFormat.format(exam1.getCreateDate());
		System.out.println(date);
//		Question 2:
//		In ra thông tin: Exam đã tạo ngày nào theo định dạng
//		Năm – tháng – ngày – giờ – phút – giây
		System.out.println("Question 2");
		exam[] exams = { exam1, exam2, exam3, exam4, exam5, exam6 };
	
		String format1 = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(format1);
		for (int i = 0; i < exams.length; i++) {
			System.out.println(exams[i].getCode() + " : " + simpleDateFormat2.format(exams[i].getCreateDate()));
		}
		
//		Question 3:
//		Chỉ in ra năm của create date property trong Question 2
		System.out.println("Question 3 ");
		String format2 = "yyyy";
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(format2);
		for (int i = 0; i < exams.length; i++) {
			System.out.println(exams[i].getCode() + " : " + simpleDateFormat3.format(exams[i].getCreateDate()));
		}
//		Question 4:
//		Chỉ in ra tháng và năm của create date property trong Question 2
		System.out.println("Question 4");
		String format3 = "MM-yyyy";
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(format3);
		for (int i = 0; i < exams.length; i++) {
			System.out.println(exams[i].getCode() + " : " + simpleDateFormat4.format(exams[i].getCreateDate()));
		}

//	Question 5:
//		Chỉ in ra "MM-DD" của create date trong Question 2

		System.out.println("Question 5");
		String format4 = "MM-dd";
		SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(format4);
		for (int i = 0; i < exams.length; i++) {
			System.out.println(exams[i].getCode() + " : " + simpleDateFormat5.format(exams[i].getCreateDate()));
		}
	}

}
