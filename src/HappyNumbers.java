
public class HappyNumbers {

	public static boolean isHappy(int n) {
		if(n>0) {
			int sum = 0;
			while (sum!=1) {
				sum = 0;
				int rem = n%10;
				sum += rem*rem;
				int que = n/10;
				while(que>0) {
					rem = que%10;
					sum += rem*rem;
					que /= 10;
				}
				n=sum;
				System.out.println(sum);
			}
			if(sum==1)
				return true;
			else 
				return false;
		}
		return false;
    }

	public static void main(String[] args) {
		System.out.println(isHappy(2));
	}

}
