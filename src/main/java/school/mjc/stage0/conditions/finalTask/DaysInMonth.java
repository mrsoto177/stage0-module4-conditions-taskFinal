package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
    	
    	if(month > 12 || month <=0) {
    		System.out.println("invalid date");
    	}	
    	else if (month ==2 && year % 4 ==0 && year % 100 !=0 || year % 400 == 0) {
    		System.out.println(29);
    	} else if ( year % 4 > 0 && year % 100 ==0 || year % 400 > 0 && month ==2 ) {
    		System.out.println(28);
    	} else {
    		switch(month) {
    		case 1: 
    			System.out.println(31);
    			break;
    		case 3: 
    			System.out.println(31);
    			break;
    		case 4: 
    			System.out.println(30);
    			break;
    		case 5: 
    			System.out.println(31);
    			break;
    		case 6: 
    			System.out.println(30);
    			break;
    		case 7: 
    			System.out.println(31);
    			break;
    		case 8: 
    			System.out.println(31);
    			break;
    		case 9: 
    			System.out.println(30);
    			break;
    		case 10: 
    			System.out.println(31);
    			break;
    		case 11: 
    			System.out.println(30);
    			break;
    		case 12: 
    			System.out.println(31);
    			break;
    			}
    	}
    	
    	
	
    }
    public static void main(String[] args) {
    	DaysInMonth days = new DaysInMonth();
    	days.printDays(2004, 2);
    }
}
