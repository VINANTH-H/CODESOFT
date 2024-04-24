//Random number generator

package pack2;
import java.util.Random;
import java.util.Scanner;

public class RandomNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int out=r.nextInt(100)+1;
        System.out.println("The random Number generation has started");
        int t=1;
        int max=5;
        while(t<=max){
            System.out.println("Enter the number to be compared :");
            int cmp=sc.nextInt();
            t++;
            if(cmp==out) {
                System.out.println("Match has found");
                break;
            }
              else if(cmp<out){
                System.out.println("The Number guessed is too low");
            }
              else {
                System.out.println("The Number guessed is too high");

            }
        }
        if(t==max+1){
            System.out.println("Maximum limit has reached :");
        }
        System.out.println("YOur Score is"+(t-1));
    }
}
