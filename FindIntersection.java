package weekAssignment1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray1[] = {3,2,11,4,6,7};
		int myArray2[] = {1,2,8,4,9,7};
		
		for (int i=0; i<=myArray1.length-1;i++) {
			for (int j=0; j<=myArray2.length-1;j++) {
				
			if(myArray1[i] == myArray2[j]){
				
			System.out.println( myArray2[j]);
			
		
			}	
		
		}
	}
	}
}
	


