package weekAssignment1.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strtext = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		//char[] charArray = strtext.toCharArray();
		String[] split = strtext.split("");
		for(int i=0; i<=split.length; i++) {
			for(int j=i+1; j<=split.length; j++) {
				if(split[i] == split[j]) {
					count++;
					
				}
					
			}
			
		}
		

	}
	

}
