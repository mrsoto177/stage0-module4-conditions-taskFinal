package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
    	if(x >0 && y > 0) {
    		System.out.println("first");
    	} else if (x > 0 && y < 0) {
    		System.out.println("second");
    	} else if( x < 0 && y < 0) {
    		System.out.println("third");
    	} else if (x < 0 && y > 0) {
    		System.out.println("fourth");
    	} else if(x ==0 && y == 0 || x == 0 || y == 0){
    		System.out.println("zero");
    	}
    }
    
    public static void main(String[] args) {
    	CoordinatePane coordinate = new CoordinatePane ();
    	coordinate.printQuadrant(-3, 1);
    }
}
