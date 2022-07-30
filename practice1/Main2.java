import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
//		//4-8 自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
//		int max = 0; //maxを初期化
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("自然数を10回入力してください");
//		for (int i = 0; i < 10; i++) {
//			int num = scanner.nextInt(); //入力された整数を受け取る
//			max = Math.max(max, num); //maxメソッドで2つの引数(maxとnum)を比較し大きいほうをmaxに代入
//		}
//		System.out.println("max = " + max);
//		
//		//4-9 整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
//		int max2 = 0;
//		int min = 0;
//		Scanner scanner2 = new Scanner(System.in);
//		System.out.println("整数を10回入力してください");
//		for (int i = 0; i < 10; i++) {
//			int num = scanner2.nextInt();
//			max2 = Math.max(max2, num);
//			min = Math.min(min, num);
//		}
//		System.out.println("max = " + max2 + " " + "min = " + min);
//		
//		//4-10 個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
//		System.out.println("数字を入力してください");
//		Scanner scanner3 = new Scanner(System.in);
//		int num = scanner3.nextInt(); //入力
//		for (int i = 0; i < num; i++) { //入力された数値だけ繰り返す
//			System.out.print("*");
//		}
//		
//		System.out.println();
//		
//		//4-11 個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
//		//2重for文ではない
//		System.out.println("数字を入力してください");
//		Scanner scanner4 = new Scanner(System.in);
//		int num2 = scanner4.nextInt();
//		for (int i = 0; i < num2; i++) { //入力された数字だけ繰り返す
//			for (int j = 0; j < 10; j++) {
//				System.out.print(j);
//			}
//		}
//		System.out.println();
//		//正しくは
//		for (int i = 0; i < num2; i++) { //入力された数字だけ繰り返す
//			System.out.print(i % 10); //
//		}
//		
//		System.out.println();
//		
//		//4-12 数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
//		System.out.println("数値を入力してください");
//		Scanner scanner5 = new Scanner(System.in);
//		int num3 = 0;
//		while (num3 <= 100) { //100を超えたら終了
//			num3 += scanner5.nextInt(); //入力した数値をnum3に足し続ける
//		}
//		System.out.println("num = " + num3);
//		
//		//4-13 ストライク・カウントを数えるプログラムを作成しなさい。
//		/* １球ごとにストライクかボールかを入力する。
//		　　３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。　
//		  ※ストライクの場合は1、ボールの場合は2を入力する。 */
//		System.out.println("ストライクなら1、ボールなら2を入力してください");
//		int strike = 0;
//		int ball = 0;
//		Scanner scanner6 = new Scanner(System.in);
//		while (strike < 3 && ball < 4) { //strikeが3以下かつballが4以下であればブロック内を評価する
//			int judge = scanner6.nextInt(); //入力した数値をjudgeに代入
//			if (judge == 1) { //条件分岐
//				strike++;
//			} else if (judge == 2) {
//				ball++;
//			}
//		}
//		System.out.println("strike=" + strike + " " + "ball=" + ball);
//		
//		//4-14 前の問題に次の修正を加えなさい。
//		/* １球ごとにストライク、ボール、ファウルの何らかを入力する。（残念ながらヒットにはなりません）
//			ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
//			３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。 */
//		System.out.println("ストライクなら1、ボールなら2、ファウルなら3を入力してください");
//		int strike2 = 0;
//		int ball2 = 0;
//		Scanner scanner7 = new Scanner(System.in);
//		while (strike2 < 3 && ball2 < 4) {
//			int judge = scanner7.nextInt();
//			if (judge == 1) {
//				strike2++;
//			} else if (judge == 2) {
//				ball2++;
//			} else if (judge == 3 && strike2 < 2) { //入力された数字が3かつストライクが2以下の時
//				strike2++;
//			}
//		}
//		System.out.println("strike=" + strike2 + " " + "ball=" + ball2);
//		
//		//4-15 入力された数が素数かどうかを判定するプログラムを作成しなさい。
//		//※判定する数は 4 以上としてよい。
//		//素数かどうか判断　→　2からn-1までの整数で割り切れるかどうか割ればよい。
//		//例)39が素数かどうか
//		//2から38までの整数で割り切れるかどうか調べてみて1つでも割り切れるものがあれば素数ではないと言える
//		System.out.println("整数を入力してください");
//		Scanner scanner8 = new Scanner(System.in);
//		int prime = scanner8.nextInt();
//		if (prime < 2) { //素数とは1より大きい整数の為、2より小さいければ素数ではないので、処理を終了させる
//			System.out.println(prime + "は素数ではありません");
//			return; //処理を終了
//		}
//		for (int i = 2; i < prime; i++) { //2からprime-1までの数で1つずつ割っていき、
//			if (prime % i == 0) { //割り切れる数があれば処理を終了させる
//				System.out.println(prime + "は素数ではありません1");
//				return; //処理を終了
//			}
//		}
//		System.out.println(prime + "は素数です2"); //割り切れる数無ければ素数となる
//		
//		
//		//4-16 2 以上の数値を入力し、素因数分解した結果を表示しなさい。
//		System.out.println("整数入力");
//		Scanner sc = new Scanner(System.in);
//		int num4 = sc.nextInt();
//		for (int i = 2; 1 < num4; i++) {
//			while (num4 % i == 0) {
//				System.out.println(num4);
//				num4 /= i;
//			}
//		}
//		
//		//4-17 九九表（一の段～九の段）を表示するプログラムを作成しなさい。
//		//※System.out.printfを使用する。System.out.printf(" %2d", x );のように、%2dと記述すると表示が2桁に揃う。
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf(" %d", j * i);
//			}
//			System.out.println();
//		}
//		
//		//4-18 数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。
//		Scanner sc2 = new Scanner(System.in);
//		int sum = 0;
//		for ( ; ; ) { //条件が何もないので、無限ループとなる
//			int value = sc2.nextInt();
//			if (value == 0) {
//				break; //強制終了、次の処理へ
//			}
//			sum += value;
//		}
//		System.out.println("sum = " + sum);
//		
//		//4-19 数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
//		Scanner sc3 = new Scanner(System.in);
//		int sum2 = 0; //合計値
//		int count = 0; //入力された回数
//		for ( ; ; ) { //無限ループ
//			int value = sc3.nextInt();
//			if (value == 0) {
//				break; //0が入力されたら強制終了
//			}
//			sum2 += value;
//			count++;
//		}
//		System.out.println("AVE = " + sum2 / count);
//		
//		//4-20 サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
//		Scanner sc4 = new Scanner(System.in);
//		int size = sc4.nextInt(); 
//		for (int i = 0; i < size; i++) { //入力された数分繰り返し
//			for (int j = 0; j <= i; j++) { //入力された数になるまでSを出力
//				System.out.print("$");
//			}
//			System.out.println(); //改行
//		}
//		
		//4-21 サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
		Scanner sc5 = new Scanner(System.in);
		int size2 = sc5.nextInt();
		for (int i = 0; i < size2; i++) {
			for (int j = 0; j < size2; j++) {
				if (i == j || size2 - i - 1 == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//4-22 フィボナッチ数列を表示するプログラムを作成しなさい。最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
		//フィボナッチ数列とは　→　最初の2項が1で、3項以降の項がすべて直前の2項の和になっている数列のこと。例)1,1,2,3,5,8,13,21,……
		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;
		while (n1 <= 1000) { //1000の項まで
			System.out.print(n1 + ","); //最初に0,次に1,
			n1 = n2; //1 →　1 → 
			n2 = n3; //2 → 3
			n3 = n1 + n2; //3 → 4
		}
	}
}