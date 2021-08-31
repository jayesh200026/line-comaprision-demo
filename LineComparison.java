
import java.util.*;
import java.lang.Math;

class Line{
	
	int x1,x2,y1,y2;
	double distance;
	
	public void getCoordinates() {
		Scanner r =new Scanner(System.in);
		System.out.println("Enter the coordinates of line");
		x1=r.nextInt();
		y1=r.nextInt();
		x2=r.nextInt();
		y2=r.nextInt();
	}
	
	
	public void computeDistance()
	{
		distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
}

public class LineComparison{
	public static void main(String args[])
	  {
	    
	    Line line1 =new Line();
	    line1.getCoordinates();
	    
	    Line line2 =new Line();
	    line2.getCoordinates();
	    
	    line1.computeDistance();
	    line2.computeDistance();
	    
	    Double distance1 = line1.distance;
	    Double distance2=line2.distance;
	    
	    LineComparison comparison = new LineComparison();
	    
	    comparison.usingEquals(distance1,distance2);
	    comparison.usingCompareTo(distance1,distance2);
	   
	    System.out.println("The length of the line1 is:"+String.format("%.4f",distance1));
	    System.out.println("The length of the line2 is:"+String.format("%.4f",distance2));
	  }
	 public void usingCompareTo(Double distance1,Double distance2)
	    {
	    	
		    if(distance1.compareTo(distance2) > 0) {
		    	System.out.println("Line1 is greater than Line2");
		    }
		    else if(distance1.compareTo(distance2) < 0)  {
		    	System.out.println("Line1 is lesser than Line2");
		    }
	    }
	 
	 public void usingEquals(Double distance1,Double distance2)
	 {
		 if(distance1.equals(distance2))
		 {
			 System.out.println("Two lines are equal");
		 }
		 else
		 {
			 System.out.println("Two lines are not equal");
		 }
	 }
}