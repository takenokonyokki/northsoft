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
		
		
		//4-6 整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
		int wins = 0; //勝ち負けの総数を初期化
		Scanner scanner2 = new Scanner(System.in);
		for (int i = 0; i < 10; i++) { //10回繰り返し
			System.out.println("整数0か1を入力してください");
			int num5 = scanner2.nextInt(); //入力された整数を受け取る
			if (num5 == 1) { //num5が1ならば
				wins += 1; //winsに+1される
			}
		}
		System.out.println("win = " + wins + "回 、 lose = " + (10 - wins) + "回"); //winはwinsそのままだせばok、loseは、10から勝ちを引けば負けの数になる
		
		
		//4-7 次のプログラムを作成しなさい。
		/*巨人、阪神戦で毎回の得点を入力する。（１回～９回）
		入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
		※ 	試合は巨人の先行とする。 */
		int giants = 0;
		int tigers = 0;
		Scanner scanner3 = new Scanner(System.in);
		Scanner scanner4 = new Scanner(System.in);
		for (int game = 1; game <= 9; game++) {
			System.out.println(game + "回の表、巨人の得点は?");
			giants += scanner3.nextInt();
			System.out.println(giants + "点");
			System.out.println(game + "回の裏、阪神の得点は?");
			tigers += scanner4.nextInt();
			System.out.println(tigers + "点");
			System.out.println("giants : " + giants + " tigers : " + tigers);
		}
		if (giants > tigers) {
			System.out.println("巨人の勝ち");
		} else if (tigers > giants) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}

		
		
		
	}
}