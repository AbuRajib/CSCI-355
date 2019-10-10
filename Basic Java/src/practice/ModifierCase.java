package practice;

public class ModifierCase {
	
	//Access Modifier : Public, Private, Protected, default
	//Non Access Modifier: final, abstract,static, transient
	//difference between public: method must be called by creating object & static: don't need to create object  
	public int a=10;
	static int b=10;
	
	public void student(){	
		System.out.println("My name is John");
	}
	
	static void studentid(){
		System.out.println("ID: 12345");
	}
	
	
	public static void main(String arg[]){
		
		studentid();
		ModifierCase md=new ModifierCase();
		md.student();
		md.a=20;
		System.out.println(md.a);
		System.out.println(b);
	}
}
