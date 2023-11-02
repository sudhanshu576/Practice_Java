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
       

       //question 3
       int[] arr = {4, 5, 6, 10, 12, 17, 19};
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
          System.out.println(arr[0]);
          System.out.println(arr[1]);
          System.out.println(arr[2]); */

          //question 4
          System.out.print("Enter number : ");
        int n = sc.nextInt();
        int temp = n, sum = 0, pow = 1;
        while(temp>0){
            int rem = temp%10;
            sum = sum +rem*pow;
            pow = pow*10;
            temp = temp/10;
        }
        if(sum == n){
            System.out.println("palidrone number");
        }else{
            System.out.println("not palidrone number");
        }

        
    }    
}
