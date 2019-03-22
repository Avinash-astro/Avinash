package fileExample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample 
{

	public static void main(String[] args) throws Exception 
	{
		DataInputStream d= new DataInputStream(System.in);
		FileInputStream fi= new FileInputStream("abc.txt");
		
		FileOutputStream fo =new FileOutputStream("new.txt");
		System.out.println("enter the text");
		int ch,ch1;
		while((ch=d.read())!='\n')
		{
			fo.write(ch);
		}
		while((ch1=fi.read())!=-1)
		{
			fo.write(ch1);
			System.out.print((char)ch);
		}
		fo.close();
		fi.close();
		System.out.println("\nfile copied");
	}

}
