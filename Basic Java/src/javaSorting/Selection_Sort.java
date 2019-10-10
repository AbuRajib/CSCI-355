package javaSorting;

public class Selection_Sort {

	public static void main(String[] args) {
		
		int[] x={5,6,2,8,0};
		int temp;
		for(int i=0;i<x.length;i++){
			for(int j=i+1;j<x.length;j++){
				
				if(x[i]>x[j]){
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		
		
		for(int k=0;k<x.length;k++){
			System.out.println(x[k]);
		}
		
	}

}
