package Assignment2;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;


import Assignment2.position.positionName;
import Assignment2.typeQuestion.TypeName;
import Assignment2.categoryQuestion.CategoryName;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		department dep1 = new department(1, "Sale");
		department dep2 = new department(2, "Giam doc");
		department dep3 = new department(3, "Ky thuat");
		department dep4 = new department(4, "Tai chinh");
//		System.out.println(dep1.toString());
//		System.out.println(dep2.toString());
//		System.out.println(dep3.toString());
//		System.out.println(dep4.toString());
		
		position pos1 = new position(1, positionName.DEV);
		position pos2 = new position(2, positionName.TEST);
		position pos3 = new position(3, positionName.SECRUM_MASTER);
		position pos4 = new position(4, positionName.PM);
//		System.out.println(pos1.toString());
//		System.out.println(pos2.toString());
//		System.out.println(pos3.toString());
//		System.out.println(pos4.toString());
		
		account acc1 = new account(1, "admin@gmail.com", "Username1", "Fullname1", dep4, pos4,
									new Date());
		account acc2 = new account(2, "Email2@gmail.com", "Username2", "Fullname2", dep1, pos4, new Date());
		account acc3 = new account(3, "Email3@gmail.com", "Username2", "Fullname3", dep2, pos3, new Date());
		account acc4 = new account(4, "Email4@gmail.com", "Username2", "Fullname4", dep3, pos1, new Date());
		
//		System.out.println(acc1.toString());
		
		
		
		group group1 = new group(1, "Testing System", acc3, new Date());
		group group2 = new group(2, "Development", acc1, new Date());
		group group3 = new group(3, "VTI Sale 01", acc2, new Date());
		group group4 = new group(4, "Management", acc4, new Date());
//		System.out.println(group1.toString());
		
		groupAccount groupAccount1 = new groupAccount(group1, new account[] { acc1, acc2 }, new Date());
		groupAccount groupAccount2 = new groupAccount(group2, new account[] { acc1, acc2, acc3 }, new Date());
		groupAccount groupAccount3 = new groupAccount(group3, new account[] { acc1, acc3 }, new Date());
		groupAccount groupAccount4 = new groupAccount(group4, new account[] { acc1, acc2, acc3, acc4 }, new Date());
//		System.out.println(groupAccount1.toString());
		
		typeQuestion typeQuestion1 = new typeQuestion(1, TypeName.ESSAY);
		typeQuestion typeQuestion2 = new typeQuestion(2, TypeName.MULTIPLE_CHOICE);
//		System.out.println(typeQuestion1.toString());
//		System.out.println(typeQuestion2.toString());
		
		categoryQuestion categoryQuestion1 = new categoryQuestion(1, CategoryName.JAVA);
		categoryQuestion categoryQuestion2 = new categoryQuestion(2, CategoryName.DOT_NET);
		categoryQuestion categoryQuestion3 = new categoryQuestion(3, CategoryName.SQL);
		categoryQuestion categoryQuestion4 = new categoryQuestion(4, CategoryName.RUBY);
		categoryQuestion categoryQuestion5 = new categoryQuestion(5, CategoryName.POSTMAN);
//		System.out.println(categoryQuestion1.toString());
		
		question question1 = new question(1, "Cau hoi ve Java", categoryQuestion1, typeQuestion2, acc4, LocalDate.now());
		question question2 = new question(2, "Cau hoi ve PHP", categoryQuestion2, typeQuestion2, acc1, LocalDate.now());
		question question3 = new question(3, "Cau hoi ve Ruby", categoryQuestion4, typeQuestion2, acc2, LocalDate.now());
		question question4 = new question(4, "Cau hoi ve .Net", categoryQuestion2, typeQuestion2, acc3, LocalDate.now());
		question question5 = new question(5, "Cau hoi ve PostMan", categoryQuestion5, typeQuestion2, acc4, LocalDate.now());
//		System.out.println(question1.toString());
		
		answer answer1 = new answer(1, "Tra loi 01", question5, true);
		answer answer2 = new answer(2, "Tra loi 02", question3, true);
		answer answer3 = new answer(3, "Tra loi 03", question4, true);
		answer answer4 = new answer(4, "Tra loi 04", question2, true);
		answer answer5 = new answer(5, "Tra loi 05", question1, true);
		answer answer6 = new answer(6, "Tra loi 06", question1, true);
		answer answer7 = new answer(7, "Tra loi 07", question1, true);
		answer answer8 = new answer(8, "Tra loi 08", question5, true);
//		System.out.println(answer1.toString());
		
		exam exam1 = new exam(1, "VTIQ001", "Đề thi C#", categoryQuestion1, 60, acc4, new Date());
		exam exam2 = new exam(2, "VTIQ002", "Đề thi PHP", categoryQuestion2, 120, acc3, new Date());
		exam exam3 = new exam(3, "VTIQ003", "Đề thi .Net", categoryQuestion3, 90, acc2, new Date());
		exam exam4 = new exam(4, "VTIQ004", "Đề thi Java", categoryQuestion5, 60, acc1, new Date());
		exam exam5 = new exam(5, "VTIQ005", "Đề thi SQL", categoryQuestion4, 90, acc2, new Date());
		exam exam6 = new exam(6, "VTIQ006", "Đề thi C#", categoryQuestion3, 120, acc1, new Date());
//		System.out.println(exam1.toString());
		
		ExamQuestion examQuestion1 = new ExamQuestion(exam1, question4);
		ExamQuestion examQuestion2 = new ExamQuestion(exam2, question2);
		ExamQuestion examQuestion3 = new ExamQuestion(exam3, question3);
		ExamQuestion examQuestion4 = new ExamQuestion(exam4, question1);
//		System.out.println(examQuestion1.toString());
		
		// Q1:  
				if (acc2.getDepartment().getDepartmentName() == null) {
					System.out.println("Nhan vien nay khong co phong ban");
				}
					else {
						System.out.println("Nhan vien nay co phong ban la: " + acc2.getDepartment().getDepartmentName());
					}
		// Q2		
			acc2.groups = new group[] {group1, group2, group4};
			System.out.println("Q2 ");
			int countGroup = acc2.groups.length;
			if (countGroup ==  0) {
				System.out.println("Nhan vien nay chua co group.");
			} else {
				if (countGroup == 1 || countGroup == 2) {
					System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				}
				if (countGroup == 3) {
					System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				} else {
					System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				}
			}
		//Q3
			String resultQ3 = acc2.getDepartment().getDepartmentName() == null ? "Nhan vien nay khong co phong ban" 
													: "Nhan vien co phong ban la: " + acc2.getDepartment().getDepartmentName();
			System.out.println(resultQ3);
	
//			Question 4:
//				Sử dụng toán tử ternary để làm yêu cầu sau:
//				Kiểm tra Position của account thứ 1
//				Nếu Position = Dev thì in ra text "Đây là Developer"
//				Nếu không phải thì in ra text "Người này không phải là Developer"
			String resultQ4 = acc1.getPosition().getName().toString() == "DEV" ? "Đây là Developer" : "Người này không phải là Developer";
			System.out.println(resultQ4);
//			Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"
			System.out.printf("GroupAccount1 : ");
			switch (groupAccount1.account.length) {
			case 1:
				System.out.println("Nhóm có 1 thành viên");
				break;
			case 2:
				System.out.println("Nhóm có 2 thành viên");
				break;
			case 3:
				System.out.println("Nhóm có 3 thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
			//Q6: Sử dụng switch case để làm lại Question 2
			System.out.printf("Question 6: ");
			switch (countGroup) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			case 4:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			default:
				System.out.println("Nhân viên này chưa có group");
				break;
			}
			//Q7: Sử dụng switch case để làm lại Question 4
			System.out.printf("Question 7: ");
			switch (acc1.getPosition().getName().toString()) {
			case "DEV":
				System.out.println("Đây là Developer"); 
				break;

			default:
				System.out.println("Người này không phải là Developer");
				break;
			}
			//Q8 In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
			System.out.println("Question 8");
			account[] accounts = {acc1, acc2, acc3, acc4};
			for (account account : accounts) {
				System.out.println("Email: " + account.getEmail());
				System.out.println("FullName: " + account.getFullName());
				System.out.println("Department: " + account.getDepartment().getDepartmentName());
			}
			//Q9: In ra thông tin các phòng ban bao gồm: id và name
			System.out.println("Question 9");
			department[] departments = {dep1, dep2, dep3, dep4};
			for (department department : departments) {
				System.out.println("Department ID: " + department.getDepartmentID());
				System.out.println("Department Name:" + department.getDepartmentName());
			}
			//Q10
			System.out.println("Question 10");
			for (int i = 0; i < accounts.length; i++ ) {
				System.out.println("Thong tin account " + (i+1));
				System.out.println("Email: " + accounts[i].getEmail());
				System.out.println("FullName: " + accounts[i].getFullName());
				System.out.println("Department Name: " + accounts[i].getDepartment().getDepartmentName());
			}
			//Q11
			System.out.println("Question 11");
			for (int i = 0; i < departments.length; i++) {
				System.out.println("DepartmentID: " + departments[i].getDepartmentID());
				System.out.println("DepartmentName: " + departments[i].getDepartmentName());
			}
			//Q12 Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
			System.out.println("Question 12");
			for (int i = 0; i < departments.length; i++) {
				if (i == 2) break;
				System.out.println("DepartmentID: " + departments[i].getDepartmentID());
				System.out.println("DepartmentName: " + departments[i].getDepartmentName());
			}
			//Q13
			System.out.println("Question 13");
			for (int i = 0; i < accounts.length; i++ ) {
				if (i == 1) continue;
				System.out.println("Thong tin account " + (i+1));
				System.out.println("Email: " + accounts[i].getEmail());
				System.out.println("FullName: " + accounts[i].getFullName());
				System.out.println("Department Name: " + accounts[i].getDepartment().getDepartmentName());
			}
			// Question 14: In ra thông tin tất cả các account có id < 4
			System.out.println("Question 14");
			for (int i = 0; i < accounts.length; i++ ) {
				if (accounts[i].getId() < 4) {
					System.out.println("Thong tin account " + (i+1));
					System.out.println("ID: " + accounts[i].getId());
					System.out.println("Email: " + accounts[i].getEmail());
					System.out.println("FullName: " + accounts[i].getFullName());
					System.out.println("Department Name: " + accounts[i].getDepartment().getDepartmentName());
				}	
			}
			// Q15 In ra các số chẵn nhỏ hơn hoặc bằng 20
			System.out.println("Question 15");
			for (int i = 1; i <= 20; i++)
			{
				if (i%2 == 0) System.out.printf(i + " ");
			}
			//Q16
			int i = 0;
			System.out.println("\nQ13 with while do");
			while (i < accounts.length) {
				if (i == 1) { i++; continue;}
				System.out.println("Thong tin account " + (i+1));
				System.out.println("Email: " + accounts[i].getEmail());
				System.out.println("FullName: " + accounts[i].getFullName());
				System.out.println("Department Name: " + accounts[i].getDepartment().getDepartmentName());
				i++;
			}
			System.out.println("Q14 with while do");
			i = 0;
			while (i < accounts.length) {
				if (accounts[i].getId() < 4) {
					System.out.println("Thong tin account " + (i+1));
					System.out.println("ID: " + accounts[i].getId());
					System.out.println("Email: " + accounts[i].getEmail());
					System.out.println("FullName: " + accounts[i].getFullName());
					System.out.println("Department Name: " + accounts[i].getDepartment().getDepartmentName());
				}	
				i++;
			}
			System.out.println("Q15 with while do");
			i = 0;
			while (i <= 20) {
				if (i%2 == 0) System.out.printf(i + " ");
				i++;
			}
			
			//Q17
			System.out.println("Q17 ");
			i = 0;
			do {
				if (i == 1) { i++; continue;}
				System.out.println("Thong tin account " + (i+1));
				System.out.println("Email: " + accounts[i].getEmail());
				System.out.println("FullName: " + accounts[i].getFullName());
				System.out.println("Department Name: " + accounts[i].getDepartment().getDepartmentName());
				i++;
			} while (i < accounts.length);
//			Question 6 / Exercise2:
//			In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//			table (giống trong Database)
			System.out.printf("Question 6 Exercise 2\n");
			for (account account : accounts) {
				System.out.printf("\nEmail: " + account.getEmail());
				System.out.printf("\nFullName: " + account.getFullName());
				System.out.printf("\nDepartment: " + account.getDepartment().getDepartmentName());
			}
			
	}

}
