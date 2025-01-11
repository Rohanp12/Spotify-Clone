import java.util.*;

public class continue1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter a number : ");
            int number = sc.nextInt();
            if ( number % 10 == 0){
                continue;

            }
        System.out.println("number was : " +number);
        } while(true);
   
    }

    
}
