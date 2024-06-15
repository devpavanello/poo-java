
public class ExFinally
{

	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(3);
		}
	}
	
}
