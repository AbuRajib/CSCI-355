package practice;

public class MathCase {

	public static void main(String[] args) {
		
		//max(x,y),min(x,y),pow(x,y),random(),round(x),sqrt(x)
		//log(x),floor(x),ceil(x),abs(x))
/*		
		Float x=5.2f,y=10.5f;
		int z=10;
		
		System.out.println("The Maximum Value is: "+Math.max(x, y));	//10.5
		System.out.println("The Minimum Value is: "+Math.min(x, y));	//5.2
		System.out.println("The Power is: "+Math.pow(x, y));			//27.04
		System.out.println("The Random Value is: "+Math.random());		// 0 / 1
		System.out.println("The Round Value is: "+Math.round(x));		//5
		System.out.println("The Square Root is: "+Math.sqrt(z));			//3.1
*/
		double x=3.7;
		
		System.out.println(Math.log(x));	//1.22
		System.out.println(Math.ceil(x));	//4.0
		System.out.println(Math.floor(x));	//3.0
		System.out.println(Math.abs(x));	//3.4
		System.out.println(Math.acos(x));
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}

}
