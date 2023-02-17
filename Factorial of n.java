import java.util.*;
public class factorial
{
	public static void main(String[] args) 
	{
	    int i,a,x=1;
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter to get factorial: ");
		if(!sc.hasNextInt())
		{
			System.out.print("Invalid Enter only integers");
			return;
		}
		a=sc.nextInt();
		if(a<0)
		{
			System.out.print("Invalid Enter only positive integers");
			return;
		}
		for(i=1;i<=a;i++)
 		{
		    x=x*i;
		}
		System.out.print("Factorial= "+x);
	}
}
