import java.util.*;
import java.lang.Math;

public class LineComparison{
  public static void main(String args[])
  {
    int x11,y11,x12,y12,x21,y21,x22,y22;
    double distance1,distance2;
    Scanner reader=new Scanner(System.in);
    System.out.println("Welcome to line comaprison computation");
    System.out.println("Enter the coordinates of line 1");
    x11=reader.nextInt();
    y11=reader.nextInt();
    x12=reader.nextInt();
    y12=reader.nextInt();
	 distance1=Math.sqrt((x12-x11)*(x12-x11)+(y12-y11)*(y12-y11));
    System.out.println("Enter the coordinates of line 2");
    x21=reader.nextInt();
    y21=reader.nextInt();
    x22=reader.nextInt();
    y22=reader.nextInt();
    distance2=Math.sqrt((x22-x21)*(x22-x21)+(y22-y21)*(y22-y21));
    
    if((String.valueOf(distance1)).compareTo(String.valueOf(distance2))==0)
		{
			System.out.println("Two lines are equal");
		}
    else if((String.valueOf(distance1)).compareTo(String.valueOf(distance2))>0) {
         System.out.println("Line1 is greater than Line2");
      }
	else{
			System.out.println("Line1 is lesser than Line2");
	}

    System.out.println("The length of the line1 is:"+String.format("%.4f",distance1));
    System.out.println("The length of the line2 is:"+String.format("%.4f",distance2));
  }
}
