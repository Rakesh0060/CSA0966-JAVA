import java.util.*;

public class DAY4SQUARESCUBES {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Decimal Number : ");
        float num = sc.nextFloat();

        System.out.println("Square of " + num + " : " + num*num);
        System.out.print("Cube of " + num + " : " );
        System.out.format("%.3f",(num*num*num));
    }
}
