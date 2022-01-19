
public class Main {
	
	public static void main(String[] args) {
		
		String x = "I'm";
		String y = "David";
		String temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
/*		
  		Output:
			x: David
			y: I'm
*/
	}

}
