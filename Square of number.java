import java.util.*;
class square
{
public static void main(String [] args)
{
int a,i;
System.out.print("Enter a number=");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(i=1;i<a;i++)
{
while(a==(i*i))
{
System.out.print(+i);
break;
}
}
}
}
