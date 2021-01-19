import java.util.Scanner;
public class Robo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int countOfL = 0,countOfR=0,countOfU=0,countOfD=0;
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Please Enter Robo Path"); //Getting input from the user 
		System.out.println("valid input must contain any of the four letters -–“L”,”R”,”U”,”D”");
		String path=scannerObject.nextLine().toUpperCase(); // Changing inputs to upper case
		char[] character=path.toCharArray();
		//Iterating character array to get the count of character's to check the robo path
		/*
		 * Logical approach for this problem is that robo should have travelled equal number of times left, right and up, down. 
		 So by calculating number of times the characters have repeated will provide us the desired output. 
		 There is an  additional check to determine if we are able to scan valid inputs.
		 */


		for(char c:character) {
		// Checking for characters other than L,R,U,D and throwing error message if we get any other character
			if(!(c==('L') || c==('R') || c==('U') || c==('D'))) 
			{
				throw new IllegalArgumentException();
			}
			else if(c=='L')
			{
				countOfL=countOfL+1;
			}
			else if(c=='R')
			{
				countOfR=countOfR+1;
			}
			else if(c=='U')
			{
				countOfU=countOfU+1;
			}
			else if(c=='D')
			{
				countOfD=countOfD+1;
			}
		}
		
		if(countOfL==countOfR && countOfU==countOfD)
		{
			System.out.println("Output: true");
			System.out.println("Number of times Robo moves UP(U) and number of times Robo moves Down(D) are same and also number "
					+ "of times Robo moves LEFT(L) and number of times Robo moves RIGHT(R) Because of this, it ends up at the\r\n"
					+ " origin where it started. Therefore, we return true");
		}
		else
		{
			System.out.println("Output: false");
			System.out.println("Number of times Robo moves UP(U) and  Down(D) or Left(L) and Right(R) or both are not same Because of this, "
					+ "robo didn't end up at the\r\n"
					+ " origin where it started. Therefore, we return false");
		}
	}
	catch (Exception e)
	{
		System.out.println("Enter Valid Input");
	}
}
}
