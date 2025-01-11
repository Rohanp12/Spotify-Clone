import java.util.*;

public class bill{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    float pen = sc.nextFloat();
    float paper = sc.nextFloat();
    float pencil = sc.nextFloat();

    float bill = pen + pencil + paper;
    float newbill = bill + (0.18f * bill );
    System.out.println("Bill without GST :"+bill);
    System.out.println("Bill with GST is :"+newbill);
    
  }
}