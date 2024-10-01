
import java.util.*;

class Codex {
	public static void main(String argv[]) throws Exception{
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Input1: ");
		int num1 = sc.nextInt();

		System.out.print("Input2: ");
		int num2 = sc.nextInt();

		int Sum = num1+num2;
		int Sub = num1>num2?num1-num2:num2-num1;

		System.out.println("Addition is "+Sum);
		System.out.println("Subtraction is "+Sub);
	}
}
