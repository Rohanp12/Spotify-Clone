import java.util.*;

public class parameters {
    public static void printjaishreeram(){
        System.out.println("Jai Shree Ram");
        System.out.println("Jai Shree Ram");
        System.out.println("Jai Shree Ram");
        System.out.println("Jai Shree Ram");


    }
    public static int calculatesum(int a,int b){//value passed in calculatesum are called parameters/formal paraamters
        int sum = a + b;
        return sum;
        //System.out.println("sum is :" + sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum( a, b);// here passed values are called arguments/actual parameters
        System.out.println("sum is :" + sum);

    }
}
