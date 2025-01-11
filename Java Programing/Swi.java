import java.util.*;
public class Swi {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        switch(number){
            case 1: System.out.println("Samosa");
            break;
            case 2: System.out.println("Burger");
            break;
            case 3: System.out.println("Dodh");
            break;
            default:System.out.println("Utto ka tujha");
        }
    }
}
