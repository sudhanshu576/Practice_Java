import java.util.Scanner;
public class practicejava{
    public static void main(String[] args) {
       /* char ch1 = 'A';
        for(int ch = A; ch<=Z; ch++){
         System.out.println(ch1 + "=" + ch);
         ch1++
        }*/

        //question 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size =");
        int n = sc.nextInt();
        /*int sp = 0; 
        int st = n;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=st; k++){
                System.out.print("* ");
            }

            sp++;
            st--;
            System.out.println();
        }*/

        //question 2
        /*int d = n;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=d; j++){
                System.out.print(j + "  ");
            }
            System.out.println();
            d--;
        }*/

        //question 3
        
        /*int d = 1;
        for(int i = 1; i<=n; i++){
            char ch = 'A';
            for(int j = 1; j<=d; j++){
                System.out.print(ch + " ");
                ch++;
            }
            d++;
            System.out.println();
        }
        //question 4
        int sp = n-1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(k);
            }
            sp--;
            System.out.println();
        }
        //question 5

        int sp = n-1;
        for(int i =1; i<=n; i++){

           for(int j =1; j<=sp; j++){
            System.out.print(" ");
           }
           for(int k =i; (k<=i && k>0); k--){
            System.out.print(k);
           }
           sp--;
           System.out.println();
        } 

        //question 6
        System.out.print("enter row = ");
        int r = sc.nextInt();
        System.out.print("enter column = ");
        int c = sc.nextInt();
        int col = c-2;
        for(int i=1; i<=r; i++){
            if(i!=1 && i!=r){
             System.out.print("*");
             for(int j =1; j<=col; j++){
                System.out.print(" ");
                }
                System.out.print("*");
            }else{
                for(int l=1; l<=c; l++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //question 7
        int t =sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(t + "*" + i + "=" + t*i);
        }

        //question 8
        int val =1;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(val+ " ");
                val++;
            }
            System.out.println();
        }
        */
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }






    }

}