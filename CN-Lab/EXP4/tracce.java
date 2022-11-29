import java.io.*;
import java.util.*;
public class tracce
{
	public static void main(String[] args) 
	{
		try
		{
			Process p = Runtime.getRuntime().exec("tracert WWW.yahoo.com");
			BufferedInputStream str = new BufferedInputStream(p.getInputStream());
			int data = 0;
			while((data = str.read())>0)
			{
				System.out.print((char)data);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}