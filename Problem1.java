import java.util.*;

public class Problem1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("hello");
		for (int i = 1; i < 1000; i++) {
			if ((i % 3 == 0) || (i % 5 == 0))
				sum+=i;
			
		}
		System.out.println("Sum is "+sum);
	}

}
