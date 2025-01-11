import java.util.*;
public class fever {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        double temp = sc.nextDouble();

        if(temp>200){
            System.out.println("Tu marnar aahe bhava !");
        }
        else if(temp<=200 && temp>100){
            System.out.println("Fever");

        }
        else{
            System.out.println("no fever");
        }
    }
}
