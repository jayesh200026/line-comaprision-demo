import java.util.*;
import java.lang.Math;

public class LineComparison{
  public static void main(String args[])
  {
    int x1,y1,x2,y2;
    double distance;
    System.out.println("Welcome to line comaprison computation");
    System.out.println("Enter the line coordination");
    Scanner reader=new Scanner(System.in);
    x1=reader.nextInt();
    y1=reader.nextInt();
    x2=reader.nextInt();
    y2=reader.nextInt();
	 distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    System.out.println("The length of the line is:"+String.format("%.4f",distance));
  }
}
