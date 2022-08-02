import java.util.*;
public class Pra2 {
	public static void main(String[] args) {
//		//4-1 “SPAM”という単語を 10 回表示するプログラムを作成しなさい。
//		for (int i = 0; i < 10; i++) {
//			System.out.println("SPAM");
//		}
//		
//		//4-2 九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(i + "*" + "3 = " + i * 3);
//		}
//		
//		//4-3 2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
//		int x = 1; //xを1で初期化
//		for (int i = 1; i <= 8; i++) { //1から8まで繰り返す
//			x *= 2; //x = x * 2 →　1*2=2　→ 2*2=4　→　4*2=8……
//			System.out.println("2の" + i + "乗 = " + x);
//		}
//		
//		//4-4 7 の階乗を計算し、表示するプログラムを作成しなさい。
//		//7の階乗は、7!=1*2*3*4*5*6*7
//		int y = 1; //yを1で初期化
//		for (int i = 2; i <= 7; i++) { //2から7まで
//			y *= i; //1*2=2　→　2*3=6　→　6*4=24 → 24*5 →　120*6=720 →　720*7=5040
//			System.out.println(y);
//		}
//		
//		//4-5 整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 10; i++) {
//			int num = sc.nextInt();
//			sum += num;
//		}
//		System.out.println("AVE = " + sum / 10);
//		
//		//4-6 整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
//		int win = 0; //勝ち0で初期化
//		int lose = 0; //負け0で初期化
//		Scanner sc2 = new Scanner(System.in); //Scanner初期化
//		for (int i = 0; i < 10; i++) { //10回繰り返す
//			System.out.println("1か0を入力してください");
//			int num = sc2.nextInt(); //numに入力された数字を代入
//			if (num == 0) { //0なら
//				lose++;
//			} else if (num == 1) { //1なら
//				win++;
//			}
//		}
//		System.out.println("lose = " + lose + " " + "win = " + win);
//		
//		//4-7 次のプログラムを作成しなさい。
//			/*巨人、阪神戦で毎回の得点を入力する。（１回～９回）
//			  入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
//			  ※試合は巨人の先行とする。*/
//		int giants = 0;
//		int tigers = 0;
//		Scanner sc3 = new Scanner(System.in);
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(i + "回の表、giantsの得点は?");
//			giants += sc3.nextInt();
//			System.out.println(i + "回の裏、tigersの得点は?");
//			tigers += sc3.nextInt();
//		}
//		System.out.println(giants + " : " + tigers);
//		if (giants < tigers) {
//			System.out.println("tigers win");
//		} else if (giants > tigers) {
//			System.out.println("giants win");
//		} else {
//			System.out.println("draw");
//		}
//		
//		//4-8 自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
//		int max = 0; //maxを0で初期化
//		Scanner sc4 = new Scanner(System.in);
//		System.out.println("正の整数を10回入力しろ");
//		for (int i = 0; i < 10; i++) { //10回繰り返す
//			int num = sc4.nextInt(); //numに入力された数字を代入
//			max = Math.max(num, max); //maxメソッドで2つの引数を比較し大きいほうを代入
//		}
//		System.out.println("max = " + max);
//		
//		//4-9 整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
//		int max2 = 0;
//		int min = 0;
//		Scanner sc5 = new Scanner(System.in);
//		System.out.println("整数を10回入力しろ");
//		for (int i = 0; i < 10; i++) {
//			int num = sc5.nextInt();
//			max2 = Math.max(max2, num); //2つの引数を比較し大きいほうを代入
//			min = Math.min(min, num); //2つの引数を比較し小さいほうを代入
//		}
//		System.out.println("max = " + max2 + " " + "min = " + min);
//		
//		//4-10 個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
//		Scanner sc6 = new Scanner(System.in);
//		System.out.println("好きな数字を入力してください");
//		int count = sc6.nextInt();
//		for (int i = 0; i < count; i++) { //入力された数字分、繰り返す
//			System.out.print("*");
//		}
		
		//4-11 個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
		Scanner sc7 = new Scanner(System.in);
		System.out.println("好きな数字を入力してください");
		int count2 = sc7.nextInt();
		for (int i = 0; i < count2; i++) {
			System.out.print(i % 10 + ","); //%10で0,1,2,3になる
		}
		
		System.out.println();
		
		//4-12 数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
		Scanner sc8 = new Scanner(System.in);
		int total = 0;
		System.out.println("100を超えるまで数字を入力してください");
		while (total <= 100) {
			total += sc8.nextInt();
		}
		System.out.println(total);

	}
}