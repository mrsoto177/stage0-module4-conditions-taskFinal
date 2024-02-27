package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
    	if(monthNumber <= 2 && monthNumber >0 || monthNumber ==12 ) {
    		System.out.println("Winter");
    	} else if (monthNumber >= 3 && monthNumber <= 5 ) {
    		System.out.println("Spring");
    	} else if (monthNumber >= 6 && monthNumber <= 8 ) {
    		System.out.println("Summer");
    	} else if (monthNumber >= 9 && monthNumber <= 11 ) {
    		System.out.println("Fall");
    	} else if (monthNumber <= 0 || monthNumber > 12)  {
    		System.out.println("Wrong month number");
    	}
    }
    
    public static void main(String[] args) {
    	SeasonDeterminer determiner = new SeasonDeterminer();
    	determiner.tellTheSeason(9);
    }
}
