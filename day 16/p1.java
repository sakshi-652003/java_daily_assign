import java.util.scanner;

class demo{
	public static void main(String [] args){
	scanner sc=new scanner(System.in);
	int sum=0;
	System.out.println("Enter num:");
	for(int i; i<=num/2;i++){
	if (num % i ==0)
		sum +=i;


	}

	if( num > 0 && sum == num){
	System.out.println("Perfect");

	}else{
	System.out.println("Not Perfect");
      }
   }
}