import java.util.Scanner;
class Yearconverting{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.print("Enter days: ");
int days = in.nextInt();
if(days<0){
System.out.println("negative numbers should not be take n ");
}
else{
int years = (days / 365);
int weeks = (days % 365) / 7;
days = (days % 365) % 7;
System.out.println("Year/s = " + years);
System.out.println("Week/s = " + weeks);
System.out.println("Day/s = " + days);}
}
}
