package linecomparison;

import java.util.Scanner;

public class LineComparison
{
	public float x1=0, x2=0, y1=0, y2=0, a1=0, a2=0, b1=0, b2=0, firstLineLength, secondLineLength;
	
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
	 * Calculating length of an two line.
	 * using the Cartesian formula.
	 * Comparing two lines length using compare() method.
	 */
	private void lineLength()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a point x1:"); 
		x1 = scanner.nextFloat();
		System.out.println("Enter the value of a point y1:"); 
		y1 = scanner.nextFloat();
		System.out.println("Enter the value of a point x2:"); 
		x2 = scanner.nextFloat();
		System.out.println("Enter the value of a point y2:"); 
		y2 = scanner.nextFloat();
		System.out.println("Enter the value of a point a1:"); 
		a1 = scanner.nextFloat();
		System.out.println("Enter the value of a point b1:"); 
		b1 = scanner.nextFloat();
		System.out.println("Enter the value of a point a2:"); 
		a2 = scanner.nextFloat();
		System.out.println("Enter the value of a point b2:"); 
		b2 = scanner.nextFloat();
		float firstLineLength =(float) Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
		float secondLineLength =(float) Math.sqrt( ( ( a2 - a1 ) * ( a2 - a1 ) ) + ( ( b2 - b1 ) * ( b2 - b1 ) ) );
		System.out.println("The length of a line is:" + firstLineLength);
		System.out.println("The length of a line is:" + secondLineLength);
		Float firstLineLengthObj1 = firstLineLength;
		Float secondLineLengthObj2 = secondLineLength;
		int val = Float.compare(firstLineLengthObj1, secondLineLengthObj2);
	    if (val == 0) 
		{
			System.out.println("Both the line are equal.");
		}
		else if (val > 0)
		{
			System.out.println("The first line is greater than the second line.");
		}
		else
		{
			System.out.println("The second line is greater than first line.");
		}
		scanner.close();
	}
}
