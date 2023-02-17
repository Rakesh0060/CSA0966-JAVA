import java.util.Scanner;
class DAY5SUMOFDIGITSOFNDIGITNUMBER
{
public static void main(String arg[])
{
try
{
int m, n,sum,n1,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of.digits: ");
m=sc.nextInt();
System.out.println("Enter a number ");
n=sc.nextInt();
int n2=n;
while(n2>0)
{
n1=n%10;
c++;
n2=n2/10;
}
System.out.println("Digits:"+c);
if(m==c)
{
for(sum=0 ;n!=0 ;n/=10)
{
sum+=n%10;
}
System.out.println("Sum of digits "+sum);
}
else
{
System.out.println("Enter the correct digit number");
}
}
catch(Exception e)
{
System.out.println("Due to character exception");
}
}
