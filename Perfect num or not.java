import java.util.*;

public class DAY4PERFECTNUMBERS{
    public static boolean checkInt(String s){
        try{
            int x = Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Enter a Valid Number");
            return false;
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        String n = sc.nextLine();

        if(checkInt(n) == true){
            int num = Integer.parseInt(n);
            int sum = 0;
            for(int i = 1;i<num;i++){
                if(num%i==0){
                    sum=sum+i;
                }
            }
            if(sum == num){
                System.out.println("The Entered Number is a PERFECT Number. ");
            }
            else{
                System.out.println("The Entered Number is not a PERFECT Number. ");
            }
        }
    }
}
