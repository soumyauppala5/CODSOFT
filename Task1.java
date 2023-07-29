import java.util.*;
public class Task1 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int someNumber = (int)(Math.random()*100);
        int Number = 0;
        int attempts=0;
        int max_attempts=10;
 
        do {
            System.out.println("Guess my number(1-100) : ");
            Number = sc.nextInt();
 
            if(Number == someNumber) {
                System.out.println("its the correct number");
                break;
            }
            else if(Number > someNumber) {
                System.out.println("your number is too large try again");
            }
            else {
                System.out.println("your number is too small try again");
            }
        } while(Number >= 0 && ++attempts<max_attempts);
        if(attempts == max_attempts){
            System.out.println("you loose the attempts are over!");
            System.out.println("the number was:"+someNumber);
        }
        
    }
}
