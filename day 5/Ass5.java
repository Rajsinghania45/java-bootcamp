//Write a function that takes a positive integer n and returns the sum of all integers from 1 to n.


import java.util.*;

public class Ass5 {
    
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int a=sc.nextInt();
        int d=sum(a);
        System.out.println("The sum of numbers upto the entered number is:"+ d);


    }
    //method to add all the numbers upto the Entered number 
    public static int sum(int n ){
        int total=0;
        for(int i=0;i<=n;i++){
            total=total+i;
        }
        return total;

    }
    
}
