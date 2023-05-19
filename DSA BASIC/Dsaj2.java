import java.util.Scanner;

public class Dsaj2 {
    public static void main(String[] args) {
        System.out.println("enter temperature in celcius");
        Scanner input=new Scanner(System.in);
        float temc=input.nextFloat();
        float tempf=(temc*9/5)+32;
        System.out.println("conversion of celcius to faherneit "+tempf);
    }
}
