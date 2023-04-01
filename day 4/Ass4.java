// write a function that returns the sum of two integers
import java.util.*;
public class Ass4 {
    public static void main(String args[]) {
        int sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second  number : ");
        int b= sc.nextInt();
        sum = add(a,b);

        System.out.println("The sum is : "+sum);  
    }
    //function to add two numbers 
    public static int add (int x,int y){
        int sum=x+y;
        return sum;

    }
    
}
