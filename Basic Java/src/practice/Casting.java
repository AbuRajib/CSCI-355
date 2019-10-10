package practice;

public class Casting {

	public static void main(String[] args) {

		//Widening Casting (automatically): byte>short>char>int>Long>float>double
	/*	int a=10;
		double b=a;
		System.out.println(b);
		
		char ch='C';
		float ft=ch;
		System.out.println(ft);
		
		byte bt=100;
		long lg=bt;
		System.out.println(lg);
*/		
		//Narrowing Casting (Manually): double>float>long>int>char>short>byte
		float myNum=120.00f;
		int mynum1=(int)myNum;
		System.out.println(mynum1);
		
		double db=1001;
		long lg=(long)db;
		System.out.println(lg);
		
		char ch='A';
		byte bt=(byte)ch;
		System.out.println(bt);
		
	}

}
