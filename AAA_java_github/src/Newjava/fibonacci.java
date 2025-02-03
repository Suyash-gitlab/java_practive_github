package Newjava;

public class fibonacci 
{
	public static void main(String[] args) 
	{
		fibonacci f= new fibonacci();
		f.fs();	
	}
		
		void fs()
		{
		int n1=0,n2=1,n3;
		for(int i=1;i<=15;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		}
}
