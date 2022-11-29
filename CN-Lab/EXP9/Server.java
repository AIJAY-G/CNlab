import java.io.*;
import java.net.*;
public class Server
{
	public static void main(String args [])throws IOException
	{
		byte b[]=new byte[3072];
		DatagramSocket ds = new DatagramSocket(1000);
		FileOutputStream f = new FileOutputStream("hello.txt");
		while(true)
		{
			DatagramPacket dp=new DatagramPacket(b,b.length);
		    ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
		}
	}
}