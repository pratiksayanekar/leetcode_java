package Citadel;

public class ConsecutiveNumbers {

	public static int consecutiveNumbersSum(int num) {
		int count = 0;
		
		for(int i=1; i*(i-1)/2 < num;++i) {
			if((num - i *(i-1)/2)%i==0)
				++count;
		}
		return count-1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(consecutiveNumbersSum(250));
		
	}

}
