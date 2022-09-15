package weekAssignment1.day2;



public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		String rev = "";
		

	char[] charArray = str.toCharArray();
		
		for (int i = charArray.length-1;i>=0;i--) {
			
			rev = rev + str.charAt(i);
			
			if (rev.equals(str)) {
			
				System.out.println("Given String is a Palindrome");
				
			}
			else {
				
				System.out.println("Given String is not a Palindrome");
			}
		}
		
		
	}

}
