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
//		
//		//4-11 個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
//		Scanner sc7 = new Scanner(System.in);
//		System.out.println("好きな数字を入力してください");
//		int count2 = sc7.nextInt();
//		for (int i = 0; i < count2; i++) {
//			System.out.print(i % 10 + ","); //%10で0,1,2,3になる
//		}
//		
//		System.out.println();
//		
//		//4-12 数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
//		Scanner sc8 = new Scanner(System.in);
//		int total = 0;
//		System.out.println("100を超えるまで数字を入力してください");
//		while (total <= 100) {
//			total += sc8.nextInt();
//		}
//		System.out.println(total);
//		
//		//4-13 ストライク・カウントを数えるプログラムを作成しなさい。
//		/*１球ごとにストライクかボールかを入力する。
//		３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
//		※ストライクの場合は1、ボールの場合は2を入力する。*/
//		int strike = 0;
//		int ball = 0;
//		Scanner sc9 = new Scanner(System.in);
//		while (strike < 3 && ball < 4) { //strikeが3以下かつballが4以下ならブロック内を評価
//			System.out.println("strike or ball");
//			int count3 = sc9.nextInt();
//			if (count3 == 1) {
//				strike++;
//			} else if (count3 == 2) {
//				ball++;
//			}
//		}
//		System.out.println("strike = " + strike + "," + "ball = " + ball);
//		
//		//4-14 前の問題に次の修正を加えなさい。
//		/*１球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
//		ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
//		３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。*/
//		int strike2 = 0;
//		int ball2 = 0;
//		Scanner sc10 = new Scanner(System.in);
//		while (strike2 < 3 && ball2 < 4) {
//			System.out.println("strike or ball or foul");
//			int count4 = sc10.nextInt();
//			if (count4 == 1) {
//				strike2++;
//			} else if (count4 == 2) {
//				ball2++;
//			} else if (count4 == 3 && strike2 < 2) { //入力された数字が3かつstrikeが2以下なら
//				strike2++;
//			}
//		}
//		System.out.println("strike = " + strike2 + " , " + "ball = " + ball2);
//		
//		//4-15 入力された数が素数かどうかを判定するプログラムを作成しなさい。
//		//※判定する数は 4 以上としてよい。
//		//素数かどうか判断　→　2からn-1までの整数で割り切れるかどうか割ればよい。
//		Scanner sc11 = new Scanner(System.in);
//		System.out.println("数字を入力");
//		int prime = sc11.nextInt();
//		for (int i = 2; i < prime; i++) { //2からprime-1まで繰り返す
//			if (prime % i == 0) { //primeがprime-1までの数字で割り切れた場合
//				System.out.println(prime + "は素数ではありません1");
//				return;
//			}
//		}
//		System.out.println(prime + "は素数です2");
//		
//		//4-16 2 以上の数値を入力し、素因数分解した結果を表示しなさい。
//		System.out.println("2以上の数字を入力");
//		Scanner sc12 = new Scanner(System.in);
//		int prime2 = sc12.nextInt();
//		//i=2は2から割るため、1<prime2は割っていったら最終的に1になるから1より大きい数字なら行う。
//		for (int i = 2; 1 < prime2; i++) {
//			//primeをiで割って0になるなら
//			while (prime2 % i == 0) {
//				System.out.print(i + " ");
//				prime2 /= i;
//			}
//		}
//		
//		//4-17 九九表（一の段～九の段）を表示するプログラムを作成しなさい。
//		//※System.out.printfを使用する。System.out.printf(" %2d", x );のように、%2dと記述すると表示が2桁に揃う。
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf(" %d", i * j); //%dは10進数表記になる i*jの結果が
//			}
//			System.out.println();
//		}
//		
//		//4-18 数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。
//		int total = 0;
//		Scanner sc13 = new Scanner(System.in);
//		for ( ; ; ) { //無限ループ
//			int num = sc13.nextInt();
//			if (num == 0) {
//				break; //0が入力されたら終了
//			}
//			total += num;
//		}
//		System.out.println("total = " + total);
//		
//		//4-19 数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
//		//※最後に入力された 0 は平均に含めない。
//		//※少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
//		int total2 = 0;
//		int count = 0;
//		Scanner sc14 = new Scanner(System.in);
//		for ( ; ; ) {
//			int num = sc14.nextInt();
//			if (num == 0) {
//				break;
//			}
//			total2 += num;
//			count++; //if分のbreakの後に記述することで最後に入力した0は平均に含まれなくなる
//		}
//		System.out.println("AVE = " + total2 / count);
//		
//		//4-20 サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
//		Scanner sc15 = new Scanner(System.in);
//		int size = sc15.nextInt();
//		for (int i = 0; i < size; i++) { //入力された数分繰り返す
//			for (int j = 0; j <= i; j++) { //繰り返し数に応じて$の出力を増やす
//				System.out.print("$");
//			}
//			System.out.println();
//		}
		
		//4-21 サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
		Scanner sc16 = new Scanner(System.in);
		int size2 = sc16.nextInt();
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
		while (n1 <= 1000) {
			System.out.print(n1 + ",");
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
		

	}
}