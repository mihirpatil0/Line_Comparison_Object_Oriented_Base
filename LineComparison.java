package linecomparison;

public class LineComparison
{

	/**
	 * @param args
	 * Creating object of a class.
	 * Calling different methods using object except static methods.
	 */
	public static void main(String[] args)
	{
		LineComparison lineComparisonObj = new LineComparison();
		lineComparisonObj.displayWelcome();
	}

	/**
	 * Printing Welcome message.
	 */
	private void displayWelcome() 
	{
		System.out.println("Welcome to Line Comparison Problem.");
	}
}
