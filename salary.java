import java.util.*;
public class Main{ 
public static void main(String args[])
{ 
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the employee salary");
 int salary= sc.nextInt(); 
 System.out.println("Salary:"+salary);
 if(salary>10000)
 {
 System.out.println("Enter the grade of the employee");
 char choice = sc.next().charAt(0); 
 switch (choice)
 {
 case 'A' :
 case 'a' :
 float c=(salary/100)*5;
 float d=salary+c;
 System.out.println("Bonus:"+c);
 System.out.println("Total Salary:"+d);
 break;
 case 'B' :
 case 'b' :
 float e=(salary/100)*10;
 float f=salary+e;
 System.out.println("Bonus:"+e);
 System.out.println("Total Salary:"+f);
 break;
 default :
 System.out.println("Incorrect Input!");
 }
 }
 else
 {
 float g=(salary/100)*2; 
 float h=salary+g;
 System.out.println("Bonus:"+g);
 System.out.println("Total Salary:"+h);
 }
}
}
