import java.io.*;
import java.net.*;
public class Myclient56 {
  public static void main(String args[]) {
    try {
      Socket s = new Socket("localhost", 8080);
      DataOutputStream dout = new DataOutputStream(s.getOutputStream());
      dout.writeUTF("hello server ");
        DataInputStream y = new DataInputStream(s.getInputStream()); String str = (String) y.readUTF(); System.out.println("Echo from Server:" + str); dout.flush(); dout.close(); s.close();
      }
      catch (Exception e) {
        System.out.println(e);
      }
    }
  }