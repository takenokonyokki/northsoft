public class FizzBuzz4 {
	public static void main(String[] args) {
		//for
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		//do while
		int j = 0;
		do {
			j++;
			if (j % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (j % 5 == 0) {
				System.out.println("Buzz");
			} else if (j % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(j);
			}
		} while (j < 100);
		
		System.out.println();
		
		//while
		int k = 0;
		while (k < 100) {
			k++;
			if (k % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (k % 5 == 0) {
				System.out.println("Buzz");
			} else if (k % 3== 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(k);
			}
		}
	}
}