
import java.util.*;
public class factorialfunction {
    public static int factorial(int n){
        Scanner sc = new Scanner(System.in);
        int f= 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;//factorial of n 
    }
    public static void main(String args[]){
        int f = factorial(6);
        System.out.println("Factorial is = "+f);
    }
}
