import java.util.*;
class fibanacci
{
	public static void main(String args[])
	{
		int n,t1=0,t2=1,i,nextTerm;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(" "+t1);
			nextTerm=t1+t2;
			t1=t2;
			t2=nextTerm;
		}
	}
}
