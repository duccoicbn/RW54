
public class Exercise3 {
	public static void main(String[] args) {
//		Question 1:
//			Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//			Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//			float có 2 số sau dấu thập phân)
		System.out.println("---- Question 1 -------");
		Integer a = 5000;
		System.out.printf("%3.2f%n", (float) a);

//		Question 2:
//			Khai báo 1 String có value = "1234567"
//			Hãy convert String đó ra số int
		System.out.println("----- Question 2 --------");
		String s = "1234567";
		int i = Integer.parseInt(s);
		System.out.println(i);

//		Question 3:
//			Khởi tạo 1 số Integer có value là chữ "1234567"
//			Sau đó convert số trên thành datatype int
		System.out.println("------ Question 3 -------");
		Integer a3 = 1234565;
		int result = a3.intValue();
		System.out.println(result);

	}
}
