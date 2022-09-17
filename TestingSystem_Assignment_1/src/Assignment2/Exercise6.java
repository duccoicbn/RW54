package Assignment2;

import java.util.Date;

import Assignment2.position.positionName;

public class Exercise6 {
	public static void soChanNhoHon10() {
//		Question 1:
//			Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
		System.out.println("các số chẵn nguyên dương nhỏ hơn 10");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d ", i);
			}
		}
	}
	public static void thongTinAccount(account account) {
//		Question 2:
//			Tạo method để in thông tin các account
		System.out.println("\nThông tin account: "+ account.getId());
		System.out.println(account.toString());
	}
	public static void soNguyenDuongNhoHon10() {
		System.out.println("Số Nguyên Dương Nhỏ Hơn 10");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", i);
		}
	}
	public static void main(String[] arg) {
		soChanNhoHon10();
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
		thongTinAccount(acc4);
		soNguyenDuongNhoHon10();
	}
}
