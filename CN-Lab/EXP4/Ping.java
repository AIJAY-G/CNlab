import java .io.*;
class Ping
{
	public static void main(String[] args) 
	{
		BufferedReader in=null;
		try
		{
			Runtime r=Runtime.getRuntime();
			Process p=r.exec("Ping localhost");
			if(p==null)
			{
				System.out.println("couldnt connect");
			}
			in=new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while((line=in.readLine())!=null)
			{
				if(line.startsWith("reply")) System.out.println("There is reply");
				if(line.startsWith("request")) System.out.println("There is no reply");
				if(line.startsWith("destination")) System.out.println("destination is unreachable");
				System.out.println(line);
			}
			in.close();
		}
		catch(IOException io)
		{}
		
	}
}