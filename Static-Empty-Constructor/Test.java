public class Test
{
	
	//static block
	static
	{
		System.out.println("Static block executed");
	}
	//empty block
	{
		System.out.println("Empty block executed");
	}
	//constructor
	Test()
	{
		System.out.println("Constructor executed");
	}
}