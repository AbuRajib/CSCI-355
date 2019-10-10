package practice;
import java.util.Scanner;

public class ScannerUsername {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name");
		
		String username=sc.nextLine();
		System.out.println("Username is: "+username);
		
		//nextLine() for string, nextInt() for integer, nextFloat() for float
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		
		System.out.println("Sum: "+c);
		sc.close();
	}

}
