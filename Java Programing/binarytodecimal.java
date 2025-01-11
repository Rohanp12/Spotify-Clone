public class binarytodecimal {
    public static void binaryToDecimal(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (int)(Math.pow(2, pow));
            
            pow++;
            binNum = binNum / 10;

        }
        System.out.println(" Decimal of " + myNum + " = " + binNum);
    }
    public static void main(String args[]){
        binaryToDecimal(1000110);
    }
}
