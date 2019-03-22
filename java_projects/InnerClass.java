package java_projects;

public class InnerClass 
{
		private int data=10;
		void display()
		{
			System.out.println("outer class");
			class Local
			{
				void msg() 
				{
					System.out.println(data);
				}
			}
			Local l = new Local();
			l.msg();
		}
		public static void main(String[] args)
		{
			InnerClass in=new InnerClass();
			in.display();
		}
}
