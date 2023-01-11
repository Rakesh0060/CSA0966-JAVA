import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Eligibity");
System.out.println("Enter your age: ");
int age=sc.nextInt();
if((age>11)&&(age<=100))
{
System.out.println("Congratulation , You are eligible for Voting");
}
else
{
System.out.println("Sorry , You allowed to vote after 11 years");
} 
}
}
