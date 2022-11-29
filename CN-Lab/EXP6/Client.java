import java.rmi.*;
public class Client
{
	public static void main(String[] args)
	{
	try
	{
	Adder s=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
	System.out.println(s.add(32,4));
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}