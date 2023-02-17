import java.util.*;
class simpleintrest
{
public static void main(String [] args)
{
int a,b,c;
System.out.print("Enter the principal amount=");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.print("Enter the no of years=");
b=sc.nextInt();
System.out.print("Is the customer senior citizen or child(of age 0 to 12) or adults(13 to 59) \n If Your senior citizen or child enter=1 \n If adults enter=2 \n Enter =");
c=sc.nextInt();
if(c==1)
{
System.out.print("Simple Intrest is " +((a*b*12)/100));
}
if(c==2)
{
System.out.print("Simple Intrest is " +((a*b*10)/100));
}
}
}
