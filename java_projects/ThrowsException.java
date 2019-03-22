package java_projects;

import java.awt.Color;
import java.awt.TextArea;
import java.util.Arrays;

public class ThrowsException extends Thread{

	 static int flag=0;

	public static void main(String[] args) throws Exception
	{
		TextArea ta = new TextArea();
		int i;
		//StringBuffer sb= new StringBuffer("...");
		ta.setText(".");
		
		for(i=0;i<10;i++)
		{
			if(i<4 || flag==1)
			{
				System.out.print(ta.getText());
				sleep(1000);
			}
		}
		
	}
}
