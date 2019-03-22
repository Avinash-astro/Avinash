package fileExample;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBufferNew 
{

	public static void main(String[] args) throws Exception 
	{
		FileReader fr= new FileReader("abc.txt");
		BufferedReader br  = new BufferedReader(fr);
		String name;
		while((name=br.readLine())!= null)
		{
			System.out.println(name);
		}
		System.out.println();
	}

}
