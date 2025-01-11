public class primeornot{
    //public static boolean isPrime(int r){
      //boolean isPrime = true;
       /// if( r == 2){
          //  isPrime = true;
        //}
        //for(int i=2; i<=r-1; i++){
            //if( r % i == 0){
              //  isPrime = false;
            //    break; 
          //  }

        //}
      //  return isPrime;

       
    //}
    //public static void main(String args[]){
     //   System.out.println(isPrime(2));
  //  }
//}




public static boolean isPrime(int n){
    if ( n == 2){
        return true;
    }
    for(int i = 2; i<=Math.sqrt(n); i++){
        if( n % i == 0){
            return false;
        }
    }
    return true;

}
public static void main(String args[]){
    System.out.println(isPrime(15));
}

}