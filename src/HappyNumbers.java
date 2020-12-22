import java.util.HashSet;

public class HappyNumbers {

	public static boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		if(n>0) {
			while (!set.contains(n)) {
				set.add(n);
				int sum = 0;
				int rem = n%10;
				sum += rem*rem;
				int que = n/10;
				while(que>0) {
					rem = que%10;
					sum += rem*rem;
					que /= 10;
				}
				n=sum;
				if(sum==1)
					return true;
			}
		}
		return false;
    }

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

}
