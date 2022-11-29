import java.io.*;
import java.net.*;
public class Client
{
	public static void main(String args [])throws Exception
	{
		byte b[]=new byte[1024];
		DatagramSocket ds = new DatagramSocket(2000);
		FileInputStream f = new FileInputStream("Welcome.txt");
		int i=0;
		while(f.available()!=0)
		{
			b[i] = (byte)f.read();
			i++;
	}
		f.close();
		ds.send(new DatagramPacket(b,i,InetAddress.getLocalHost(),1000));

	}
}
