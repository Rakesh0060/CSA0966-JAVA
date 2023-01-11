import java.util.*; 
class Main 
{ 
public static void main(String[] args) 
{ 
Scanner sc= new Scanner(System.in);
System.out.print("Enter the 1st Denomination : "); 
int a= sc.nextInt(); 
System.out.print("Enter the 1st Denomination number of notes: "); 
int a1= sc.nextInt(); 
System.out.print("Enter the 2nd Denomination: "); 
int b= sc.nextInt(); 
System.out.print("Enter the 2nd Denomination number of notes: "); 
int b1= sc.nextInt();
System.out.print("Enter the 3rd Denomination : "); 
int c= sc.nextInt(); 
System.out.print("Enter the 3rd Denomination number of notes: "); 
int c1= sc.nextInt(); 
System.out.print("Enter the 4th Denomination: "); 
int d= sc.nextInt(); 
System.out.print("Enter the 4th Denomination number of notes: "); 
int d1= sc.nextInt();
int e=a*a1+b*b1+c*c1+d*d1; 
System.out.println("Total Available Balance in ATM = " +e); 
} 
}
