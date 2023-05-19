import java.util.Scanner;

public class Dsaj1 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(num==1){
            System.out.println("neither prime nor not prime");
        }
        if (num%2==0){
            System.out.println("number is not prime");
        }

        else{
            System.out.println(" prime number");
        }

    }
}
