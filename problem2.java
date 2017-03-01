class problem2 {

	public static void main(String args[]) {
		int s = 0;
		long a = 0;
		long b = 1;
		long resultSum = 0;
		long max = 50;
		for (int i = 0; i <= max - 2; i++) {

			long c = a + b;
			if (c % 2 == 0) {
				System.out.println(c);
				resultSum += c;
			}
			if (c > 4000000) {
				break;
			}
			a = b;
			b = c;
		}

		System.out.println("resultSum:" + resultSum);
	}
}
