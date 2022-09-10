import java.util.Scanner;

public class Calculator {
	private final Scanner input;
        	
	
	public Calculator()
	{
		this.input = new Scanner(System.in);
	}

	public void menuLoop()
	{
		String option = "";
		while (true)
		{
			showMenu();
			option = getOption();
			if(option.equals("quit"))
			{
					System.out.println("Quitting...");
					return;
			}

			

			doOperation(option);
			


			//get option
		}

	}
	
	
	private String getOption()
	{
		String value = this.input.next();
		return value;
	}

	private double getValue()
	{
		double value = this.input.nextDouble();
		return value;
	}

	private double doOperation(String operation)
	{
		double result = 0;
		Operation op; 
		switch(operation)
		{
			case "add":
				System.out.println("Adding..");
				op = new Add();
				result = op.process();
				op.displayResults(result);
				break;
			case "subtract":
				System.out.println("Subtracting..");
				op = new Subtract();
				result = op.process();
				op.displayResults(result);



				break;
		}


		return result;
	}

	public void showMenu()
	{
		System.out.println("Pick an Operation");
		System.out.println("Add -");
		System.out.println("Subtract -");
	}




}


