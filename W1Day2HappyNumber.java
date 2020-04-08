package Week1;
import java.util.LinkedHashSet;
import java.util.Set;

public class W1Day2HappyNumber {
	public static void main(String[] args) {

		System.out.println(isHappy(2));

	}

	public static boolean isHappy(int n) {

		Set<Integer> cyscle = new LinkedHashSet<Integer>();
		while (n != 1) {
			n = sumDigitSqr(n);
			if ((n != 1) && !cyscle.add(n)) {
				return false;
			}
		}
		return true;
	}

	public static int sumDigitSqr(int n) {
		int sum = 0;
		while (n > 0) {
			int r = (n % 10);
			sum += r * r;
			n /= 10;
		}
		return sum;
	}
}
