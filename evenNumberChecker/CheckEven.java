import java.util.Scanner;

public class CheckEven {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime or not: ");

        int number = scan.nextInt();

        if (number < 2) 
        {
            System.out.println("Number is not prime");
        }
        if (number == 2 || number % 2 == 0) 
        {
            System.out.println("Number is even");
        } 
        else
        {
            System.out.println("Number is odd");
        }
        
    }
}