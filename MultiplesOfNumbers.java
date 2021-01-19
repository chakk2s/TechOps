import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MultiplesOfNumbers {

	public static void main(String[] args) {
		int upperLimitCount,lowerLimitCount=0;
		ArrayList<Integer> productList = new ArrayList<Integer>();
		ArrayList<Integer> exceptionList = new ArrayList<Integer>();
		try  {
			Scanner scannerObject = new Scanner(System.in);
			//Reading user's input
			System.out.println("Enter the multiplier");
			int multiplier = scannerObject.nextInt();  
			System.out.println("Enter lower limit Number");
			int lowerLimit = scannerObject.nextInt(); 
			System.out.println("Enter Upper limit Number");
			int upperLimit = scannerObject.nextInt();
			//checking if we are getting valid inputs, if not then throwing exception
			if(lowerLimit>=upperLimit)
			{
				throw new IllegalArgumentException();
		//throwing exception if user is providing bigger number in lower limit and small number in upper limit
			}
		// Reading the count of number's user wanted to input
			System.out.println("Enter the count of numbers to be exempted");
			
			int count = scannerObject.nextInt();
			System.out.println("Enter "+count+" exempt Numbers");
			
			for(int j=1;j<=count;j++)
			{
				exceptionList.add(scannerObject.nextInt());
			}
			
			upperLimitCount=upperLimit/multiplier;
			lowerLimitCount=lowerLimit/multiplier;
			
	// Checking if multiplication of lowerLimitCount * multiplier will be resulting in actual entered lowerLimit
			if(lowerLimitCount*multiplier!=lowerLimit)
			{
				lowerLimitCount=lowerLimitCount+1;
			}
	//Here we are iterating the value i so that it will be multiplied same as the count of upperLimitCount

			/* Logical approach for this is to get the limit values and divide it by multiplier to get number of times 
			 * loop should be run. Then iterate using a for loop and then multiply the multiplicand and multiplier to get
			 * product . Later on verification is done to exempt the exempt number's from final output.
			 * Since i am iterating in an orderly manner i have used collections. reverse to get the decreasing order
			 
			 */
			for(int i=lowerLimitCount;i<=upperLimitCount;i++)
			{
				int productofNumber=multiplier*i;
				//checking into exception list to remove exempt numbers
				if(!(exceptionList.contains(productofNumber))) 
				{
					productList.add(productofNumber);
				}
			}
			//Since we are iterating in an orderly manner we are just reversing the list to get descending order
			Collections.reverse(productList);
		System.out.println(productList);
		}
		catch(Exception e) {
			  System.out.println("Enter valid Number");
			}
	}
}

