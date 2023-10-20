import java.util.*;
public class alphapractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //question 1
       /*
        System.out.print("Enter 1st nymber = ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number = ");
        int c = sc.nextInt();
        System.out.println("Average = " +(a+b+c)/3);
        */

        //question 2
        System.out.print("Enter number more than 1 digit = ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("Sum of the digit = " +sum);
       
    }    
}
