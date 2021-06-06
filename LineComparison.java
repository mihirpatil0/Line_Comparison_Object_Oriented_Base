package linecomparison;

import java.util.Scanner;

public class LineComparison
{
	public float x1=0, x2=0, y1=0, y2=0, lengthOfLine;
	
	/**
	 * @param args
	 * Creating object of a class.
	 * Calling different methods using object except static methods.
	 */
	public static void main(String[] args)
	{
		LineComparison lineComparisonObj = new LineComparison();
		lineComparisonObj.displayWelcome();
		lineComparisonObj.lineLength();
	}

	/**
	 * Printing Welcome message.
	 */
	private void displayWelcome() 
	{
		System.out.println("Welcome to Line Comparison Problem.");
	}
	
	/**
	 * Calculating length of an line.
	 * using the Cartesian formula.
	 */
	private void lineLength()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of a point x1:"); 
		x1 = scanner.nextFloat();
		System.out.print("Enter the value of a point y1:"); 
		y1 = scanner.nextFloat();
		System.out.print("Enter the value of a point x2:"); 
		x2 = scanner.nextFloat();
		System.out.print("Enter the value of a point y2:"); 
		y2 = scanner.nextFloat();
		lengthOfLine =(float) Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
		System.out.println("The length of a line is : " + lengthOfLine);
		scanner.close();
	}
}
