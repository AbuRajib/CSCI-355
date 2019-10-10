package practice;

public class ConditionalCase1 {

	public static void main(String[] args) {
		
		// If...Else if...Else
		// Switch
		// While loop
		// For Loop
		// Break/Continue
		
/*		int x=15,y=20;
		
		if(x>y){
			System.out.println("x is greater than y");
		}else if(x==y){
			System.out.println("x & y are equals");
		}else{
			System.out.println("x is less than y");
		}
*/
		
		int marks=90;
		
		switch(marks){
			
			case 70:
				System.out.println("Curreny G.P.A: 'B' ");
				break;
		
			case 80:
				System.out.println("Curreny G.P.A: 'B+' ");
				break;
		
			case 90:
				System.out.println("Curreny G.P.A: 'A-' ");
				break;
		
			case 95:
				System.out.println("Curreny G.P.A: 'A' ");
				break;
				
			default:
				System.out.println("Below 70");
				break;
		}
		
	}

}
