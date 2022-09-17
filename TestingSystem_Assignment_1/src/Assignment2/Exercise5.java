package Assignment2;


import java.util.Scanner;

import Assignment2.position.positionName;;

public class Exercise5 {
	static Scanner scanner = new Scanner(System.in);

	public static void question1() {
//		Question 1:
//			Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		System.out.println("----- Question 1 --------");
		System.out.println("Nhập x: ");
		int x = scanner.nextInt();
		System.out.println("Nhập y: ");
		int y = scanner.nextInt();
		System.out.println("Nhập z: ");
		int z = scanner.nextInt();
		System.out.println("Bạn vừa nhập: " + "x: " + x + ", y: " + y + ", z: " + z);
		scanner.close();
	}

	public static void question2() {
//		Question 2:
//			Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		System.out.println("---- Question 2 ---------");
		System.out.println("Nhập số thực f: ");
		float f = scanner.nextFloat();
		System.out.println("Nhập số thưc g: ");
		float g = scanner.nextFloat();
		System.out.println("Bạn vừa nhập: " + "f: " + f + ", g: " + g);
		
	}

	public static void question3() {
		System.out.println("------ Question 3 --------");
		System.out.println("Nhập họ và tên:");
		String hoVaTen = scanner.nextLine();
		System.out.println("Họ tên bạn nhập: " + hoVaTen);
		
	}

	public static void question4() {
//		Question 4:
//			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		System.out.println("------ Question 4 --------");
		System.out.println("Nhập ngày: ");
		int ngaySinh = scanner.nextInt();
		System.out.println("Nhập tháng: ");
		int thangSinh = scanner.nextInt();
		System.out.println("Nhập năm: ");
		int nam = scanner.nextInt();
		System.out.println("Ngày sinh nhật: ");
		System.out.println(ngaySinh + " - " + thangSinh + " - " + nam);
		
	}

	public static void question5() {
//		Question 5:
//			Viết lệnh cho phép người dùng tạo account (viết thành method)
//			Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//			chương trình sẽ chuyển thành Position.Dev, Position.Test,
//			Position.ScrumMaster, Position.PM

		System.out.println("Chức năng Tạo Account: ");
		account acc = new account();
		System.out.println("Nhập ID: ");
		acc.setId(scanner.nextInt());
		System.out.println("Nhập email: ");
		acc.setEmail(scanner.next());
		System.out.println("Nhập fullName: ");
		acc.setFullName(scanner.next());
		System.out.println("Nhập Position: 1.Dev, 2.Test, 3.ScrumMaster, 4.PM");
		int input = scanner.nextInt();
		switch (input) {
		case 1:
			position pos1 = new position(1, positionName.DEV);
			acc.setPosition(pos1);
			break;
		case 2:
			position pos2 = new position(2, positionName.TEST);
			acc.setPosition(pos2);
			break;
		case 3:
			position pos3 = new position(3, positionName.SECRUM_MASTER);
			acc.setPosition(pos3);
			break;
		case 4:
			position pos4 = new position(4, positionName.PM);
			acc.setPosition(pos4);
			break;
		default:
			System.out.println("Nhập lại !!!!!!!");
			return;
		}
		System.out.println(acc.toString());
		
	}

	public static void question6() {
//		Question 6:
//			Viết lệnh cho phép người dùng tạo department (viết thành method)
		System.out.println("Tạo Department: ");
		department dep = new department();
		System.out.println("Nhập ID: ");
		dep.setDepartmentID(scanner.nextInt());
		System.out.println("Nhập Name: ");
		dep.setDepartmentName(scanner.next());
		System.out.println("Thông tin Deparment vừa nhập: ");
		System.out.println(dep.toString());
		
	}

	public static void question7() {
//		Question 7:
//			Nhập số chẵn từ console
		System.out.println("Nhập số chẵn từ console: ");
		while (true) {
			int chan = scanner.nextInt();
			if (chan % 2 == 0) {
				System.out.println("Bạn vừa nhập: " + chan);
				return;
			} else {
				System.out.println("Nhập lại số chẵn: ");
			}

		}
		
	}

	public static void question8() {
//		Question 8:
//			Viết chương trình thực hiện theo flow sau:
//			Bước 1:
//			Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//			dụng"
//			Bước 2:
//			Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//			Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//			department
//			Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//			lại" và quay trở lại bước 1
		while (true) {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
			System.out.println("Nhập 1 hoặc 2: ");
			int nhap = scanner.nextInt();
			switch (nhap) {
			case 1:
				question5();
				return;
			case 2:
				question6();
				return;
			default:
				System.out.println("Bạn nhập sai rồi. Nhập lại ...");
			}
		}
	}



	public static void main(String[] args) {

		// Thêm các Methos vào đây để chạy:
		// Ví dụ:
		
		question1();
		scanner.close();
	}
}