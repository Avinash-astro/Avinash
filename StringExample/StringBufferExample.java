package StringExample;

public class StringBufferExample
{
	public static void main(String[] args) 
	{
		int age=10;
		StringBuffer sb=new StringBuffer("hello");
		StringBuffer sb1=new StringBuffer("world");
		//String ss=sb;
		System.out.println(sb+" "+sb1);
		System.out.println(sb.append(age));
		System.out.println(sb.length());
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		//System.out.println((String)sb.charAt(0));
		System.out.println(sb.reverse());
		System.out.println(sb);
	}
}
