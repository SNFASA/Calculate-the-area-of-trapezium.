import java.util.Scanner;
public class trapezium{
  public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double base1,base2,base3;
        double trpz;
         base1= sc.nextDouble();
         base2= sc.nextDouble();
         base3= sc.nextDouble();
         
       trpz = 0.5*(base1 + base2)*base3;
       System.out.print("Area of trapezium = " +trpz);
       
       
        
    }
}
 