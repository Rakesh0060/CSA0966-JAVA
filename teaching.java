import java.util.*; 
class teaching
{ 
public static void main(String[] args) 
{ 
Scanner sc= new Scanner(System.in); 
System.out.print("Total users: "); 
int a= sc.nextInt(); 
System.out.print("Staff users: "); 
int b= sc.nextInt(); 
int c=b/3;
int d=a-b-c; 
System.out.println("Student users:" +d); 
} 
} 
