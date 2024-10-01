import java.util.*;

class Code3 {
        public static void main(String argv[]){

               Scanner sc  = new Scanner(System.in);

                System.out.print("Input1: ");
                int num1 = sc.nextInt();

                System.out.print("Input2: ");
                int num2 = sc.nextInt();

                int Sum = (num1*num1*num1)+(num2*num2*num2);
                int Sub = (num1*num1)-(num2*num2);

                System.out.println("Addition of "+(num1*num1*num1)+" & "+(num2*num2*num2)+" is "+Sum);
                System.out.println("Subtraction of "+(num1*num1)+" & "+(num2*num2)+" is "+Sub);
        }
}
