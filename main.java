import java.util.Scanner;
	   
public class main {
	
	public static void main(String[] args) {
		try {
	  		Scanner input = new Scanner(System.in);
			System.out.println("Enter an integer: ");
			int n = input.nextInt();
			input.close();
			for(int i = 1; i <= n; i++) {
				if((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println("FizzBuzz");
				}else if(i % 3 == 0) {
					System.out.println("Fizz");
				}else if(i % 5 == 0) {
					System.out.println("Buzz");
				}else {
					System.out.println(i);
				}
			}
		}catch(Exception e) {
			System.out.println("Exception occured, goodbye!");
		}
	}
}
