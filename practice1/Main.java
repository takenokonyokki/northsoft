import java.util.Scanner; //Scannerクラスをインポート
public class Main {
	public static void main(String[] args) {
		//4-1 “SPAM”という単語を 10 回表示するプログラムを作成しなさい。
		String name = "SPAM";
		for (int i = 0; i < 10; i++) {
			System.out.print(name);
		}
		
		System.out.println();
		
		//4-2 九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
		int num = 3;
		for (int i = 1; i < 10; i++) {
			System.out.print(num + "*" + i + "=" + num * i + "  ");
		}
		
		System.out.println();
		
		//4-3 2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
		int num2 = 1;
		for (int i = 1; i < 9; i++) {
			num2 *= 2; //num2 = num2 * 2 , 1回目で1*2=2,2回目で2*2=4,………
			System.out.println("2の" + i + "乗 = " + num2);
		}
		
		//4-4 7 の階乗を計算し、表示するプログラムを作成しなさい。
		//7の階乗は、7! = 1*2*3*4*5*6*7 = 5040
		int num3 = 1;
		for (int i = 2; i <= 7; i++) {
			num3 *= i; //num3 = num3 * i
		}
		System.out.println("7! = " + num3);
		
		//4-5 整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
		int sum = 0; //sumを初期化
		Scanner scanner = new Scanner(System.in); //Scannerクラスを初期化
		for (int i = 0; i < 10; i++) {
			System.out.println("整数を入力してください");
			int num4 = scanner.nextInt(); //入力された整数を受け取る 小数点を含める場合は、scanner.nextDouble();とする
			System.out.println("入力された整数は" + num4);
			sum += num4; //入力された数字を足していく
		}
		System.out.println("AVE = " + (sum / 10)); //平均値
		
		
		
		
	}
}