public class largest3 {
    public static void main(String args[]){
        int a = 1, b = 5, c = 4;
        if((a >= b) && (a >= c)){
            System.out.println("Largest is a");
        }else if(b >= c){
            System.out.println("Largest is b");
        }else{
            System.out.println("Largest is c");
        }

    }
}
