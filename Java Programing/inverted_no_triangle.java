public class inverted_no_triangle {
    public static void invertednos(int n){
         for(int i=1; i<=n; i++){
            //inner nos
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
         }
    }
    public static void main(String args[]){
        invertednos(6);
    }
}
