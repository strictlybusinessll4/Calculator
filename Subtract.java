public class Subtract extends Operation {
	
	public Subtract()
	{
		super();
	}


	public double process()
	{
		super.process();

		return this.x - this.y;

	}


	public void displayResults(double result)
	{

		System.out.println(this.x + " - " + this.y + " = " + result);	
	}

}
