import java.util.*;
class mul
{
public static void main(String [] args)
{
int a,b,i;
System.out.print("Enter a number table to be printed=");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.print("Enter a number to the range=");
b=sc.nextInt();
for(i=1;i<=b;i++)
{
System.out.println(+a  +" * " +i +" = "+(a*i));
}
}



}
