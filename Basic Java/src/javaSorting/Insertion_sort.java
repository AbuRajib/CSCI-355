package javaSorting;

public class Insertion_sort {

	public static void main(String[] args) {
		
		int[] num={10,20,80,50,40};
		int temp,cursor;
		for(int i=1;i<num.length;i++){
			cursor=i;
			for(int j=i-1;j>=0;j--){
				if(num[j]>num[cursor]){
					temp=num[j];
					num[j]=num[cursor];
					num[cursor]=temp;
				}cursor--;
			} 
		}
		
		
		for(int n=0;n<num.length;n++){
			System.out.println(num[n]);
		}
	}

}
