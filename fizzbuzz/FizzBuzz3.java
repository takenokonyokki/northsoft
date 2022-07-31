public class FizzBuzz3 {
	public static void main(String[] args) {
		//do while
		int i = 0;
		do {
			i++;
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		} while (i < 100);
		
		System.out.println();
		
		//for
		for (int j = 1; j <= 100; j++) {
			if (j % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (j % 5 == 0) {
				System.out.println("Buzz");
			} else if (j % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(j);
			}
		}
		
		System.out.println();
		
		//while
		int k = 0;
		while (k < 100) {
			k++;
			if (k % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (k % 5 == 0) {
				System.out.println("Buzz");
			} else if (k % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(k);
			}
		}
	}
}