import java.util.*;

public class productfunction {
    public static int name(int a, int b){
        int prod = a*b;
        return prod;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = name(a , b);
        System.out.println("Product is = "+prod);
    }
    
}
