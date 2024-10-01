import java.util.*;

class Code2 {
        public static void main(String argv[]) {

                Scanner sc  = new Scanner(System.in);

                System.out.print("Input1: ");
                int num1 = sc.nextInt();

                System.out.print("Input2: ");
                int num2 = sc.nextInt();

                int Mul = num1*num2;
                int Div = num1>num2?num1/num2:num2/num1;

                System.out.println("Multiplication is "+Mul);
                System.out.println("Division is "+Div);
        }
}
