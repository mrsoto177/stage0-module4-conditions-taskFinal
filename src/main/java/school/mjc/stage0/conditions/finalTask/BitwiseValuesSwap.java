package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
    
    	first = first ^ second;
    	second = first ^ second;
    	first = first ^ second;
    	
    	//second = second ^ first;
    	System.out.println(first + " " + second);
    	
    	
    }
    public static void main(String[] args) {
    	BitwiseValuesSwap swapT = new BitwiseValuesSwap();
    	swapT.swap(	6,7);
    }
}
