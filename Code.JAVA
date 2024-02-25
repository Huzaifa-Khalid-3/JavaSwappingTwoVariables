package SwappingTwoVariables;
/*Author: Huzaifa Khalid
 * Date: 2024-02-25
 * Purpose: to swap the values of two variables and print them out
 */
public class Code {

	public static void main(String[] args) {
		// variables
		int x=3;
		int y=4;
		int temp=0;
		
		// print original values
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		temp=x;
		x=y;
		y=temp;
		// print swapped values
		System.out.println("Swapped values: ");
		System.out.println("x = "+x);
		System.out.println("y = "+y);

	}

}
