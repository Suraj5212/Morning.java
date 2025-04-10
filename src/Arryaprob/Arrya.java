package Arryaprob;

public class Arrya {

	public static void main(String[] args) {
		           //0,1,2,3,4
		int arr[]= {10,12,15,14,14};
		
		for(int i=0;i<arr.length;i++) {
			    //10
			
			for(int j=i+1;j<arr.length;j++) {
				    //12
				
				
				if(arr[i]<arr[j]) {
				  System.out.println(" :" + arr[i]);
				}
			}
			
		}
	}
}
			
			
	