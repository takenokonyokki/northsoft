public class FizzBuzz {
	public static void main(String[] args) {
		//FizzBuzz
		/*「1から100までの数字を画面に表示する。ただし、3の倍数のときは数字の代わりにFizzと表示し、5の倍数のときは数字の代わりにBuzzと表示し、
		  15の倍数のときは数字の代わりにFizzBuzzと表示する」 */
		
		//while
		int i = 0;
		while (i < 100) {
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
		}
		
		
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
		
		
		//for
		for (int k = 1; k <= 100; k++) {
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