package advance.dev;
import java.util.Scanner;
public class mainApp {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Phần a: Nhập hai số nguyên và xử lý ngoại lệ nếu b = 0
	        System.out.println("Nhập vào hai số nguyên a và b:");
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();

	        try {
	            int c = a / b;
	            System.out.println("Kết quả của phép chia là: " + c);
	        } catch (ArithmeticException e) {
	            System.out.println("Lỗi: Phép chia cho 0 không hợp lệ.");
	        }

	        // Phần b: Nhập một chuỗi và chuyển đổi sang số nguyên
	        System.out.println("Nhập vào một chuỗi số nguyên:");
	        String input = scanner.next();

	        try {
	            int number = Integer.parseInt(input);
	            System.out.println("Số nguyên đã nhập: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Lỗi: Chuỗi nhập không phải là số nguyên.");
	        }

	        scanner.close();
	    }
	

}
