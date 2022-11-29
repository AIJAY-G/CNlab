import java.rmi.*;
import java.rmi.registry.*;
public class Server
{
	public static void main(String args[])
	{
		try
		{
		 Adder s = new AdderRemote();
		 Naming.rebind("rmi://localhost:5000/sonoo",s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}