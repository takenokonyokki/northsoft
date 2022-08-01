import java.util.*;
public class Pra2 {
	public static void main(String[] args) {
		//4-1 “SPAM”という単語を 10 回表示するプログラムを作成しなさい。
		for (int i = 0; i < 10; i++) {
			System.out.println("SPAM");
		}
		
		//4-2 九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "*" + "3 = " + i * 3);
		}
		
		//4-3 2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
		int x = 1; //xを1で初期化
		for (int i = 1; i <= 8; i++) { //1から8まで繰り返す
			x *= 2; //x = x * 2 →　1*2=2　→ 2*2=4　→　4*2=8……
			System.out.println("2の" + i + "乗 = " + x);
		}
		
		//4-4 7 の階乗を計算し、表示するプログラムを作成しなさい。
		//7の階乗は、7!=1*2*3*4*5*6*7
		int y = 1; //yを1で初期化
		for (int i = 2; i <= 7; i++) { //2から7まで
			y *= i; //1*2=2　→　2*3=6　→　6*4=24 → 24*5 →　120*6=720 →　720*7=5040
			System.out.println(y);
		}
		
		//4-5 整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("AVE = " + sum / 10);
		
	}
}