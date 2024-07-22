class Handling
{
	public static void main(String[] args){
		try
		{
			System.out.println("Learn Coding");
			int a=20,b=2,c;
			c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException a)
		{
			System.out.println("can't divide by zero");
		}
		finally
		{
			System.out.println("smjh aya");
		}
		System.out.println("main method ended");
	}
}