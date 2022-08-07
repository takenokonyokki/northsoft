import java.nio.file.FileSystemNotFoundException;
import java.util.*;
public class Pra3 {
	public static void main(String[] args) {
//		//1 “SPAM”という単語を 10 回表示するプログラムを作成しなさい。
//		for (int i = 0; i < 10; i++) {
//			System.out.println("SPAM");
//		}
//		
//		//2 九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("3" + "*" + i + "=" + (3 * i));
//		}
//		
//		//3 2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
//		int num3 = 1;
//		for (int i = 1; i <= 8; i++) {
//			num3 *= 2;
//			System.out.println("2の" + i + "乗 = " + num3);
//		}
//		
//		//4 7 の階乗を計算し、表示するプログラムを作成しなさい。 7!= 1*2*3*4*5*6*7=
//		int num4 = 1;
//		for (int i = 2; i <= 7; i++) {
//			num4 *= i;
//			System.out.println(num4);
//		}
//		
//		//5 整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
//		int ave = 0;
//		Scanner sc5 = new Scanner(System.in);
//		for (int i = 0; i < 10; i++) {
//			int num5 = sc5.nextInt();
//			ave += num5;
//		}
//		System.out.println("AVE = " + (ave / 10));
//		
//		//6 整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
//		Scanner sc6 = new Scanner(System.in);
//		int win = 0;
//		int lose = 0;
//		for (int i = 0; i < 10; i++) {
//			int num6 = sc6.nextInt();
//			if (num6 == 0) {
//				lose++;
//			} else if (num6 == 1) {
//				win++;
//			}
//		}
//		System.out.println("win=" + win + " " + "lose=" + lose);
//		
//		//7 次のプログラムを作成しなさい。
//		//巨人、阪神戦で毎回の得点を入力する。（１回～９回）
//		//入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
//		Scanner sc7 = new Scanner(System.in);
//		int giants = 0;
//		int tigers = 0;
//		for (int i = 1; i <= 9; i++) {
//			System.out.print(i + "回の表" + "giantsの得点は　");
//			giants += sc7.nextInt();
//			System.out.println();
//			System.out.print(i + "回の裏" + "tigersの得点は ");
//			tigers += sc7.nextInt();
//			System.out.println();
//		}
//		System.out.println("giants:" + giants + " " + "tigers:" + tigers);
//		if (giants < tigers) {
//			System.out.println("tigersの勝ち");
//		} else if (giants > tigers) {
//			System.out.println("giantsの勝ち");
//		} else if (giants == tigers) {
//			System.out.println("引き分け");
//		}
//		
//		//8 自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
//		int max = 0;
//		Scanner sc8 = new Scanner(System.in);
//		for (int i = 0; i < 10; i++) {
//			int num8 = sc8.nextInt();
//			max = Math.max(max, num8);
//		}
//		System.out.println("max = " + max);
//		
//		//9 整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
//		int max = 0;
//		int min = 0;
//		Scanner sc9 = new Scanner(System.in);
//		for (int i = 0; i < 10; i++) {
//			int num9 = sc9.nextInt();
//			max = Math.max(max, num9);
//			min = Math.min(min, num9);
//		}
//		System.out.println("max=" + max + " " + "min=" + min);
//		
//		//10 個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
//		Scanner sc10 = new Scanner(System.in);
//		int num10 = sc10.nextInt();
//		for (int i = 1; i <= num10; i++) {
//			System.out.print("*");
//		}
//		
//		//11 個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
//		Scanner sc11 = new Scanner(System.in);
//		int num11 = sc11.nextInt();
//		for (int i = 0; i < num11; i++) {
//			System.out.print(i % 10 + ",");
//		}
//		
//		//12 数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
//		int num12 = 0;
//		Scanner sc12 = new Scanner(System.in);
//		for ( ; ; ) {
//			num12 += sc12.nextInt();
//			if (num12 >= 100) {
//				break;
//			}
//		}
//		System.out.println("num12 = " + num12);
//		
//		//13 ストライク・カウントを数えるプログラムを作成しなさい。
//		//１球ごとにストライクかボールかを入力する。
//		//３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
//		//ストライクの場合は1、ボールの場合は2を入力する。
//		Scanner sc13 = new Scanner(System.in);
//		int strike = 0;
//		int ball = 0;
//		while (strike < 3 && ball < 4) {
//			int count = sc13.nextInt();
//			if (count == 1) {
//				strike++;
//			} else if (count == 2) {
//				ball++;
//			}
//		}
//		System.out.println("strike=" + strike + " " + "ball=" + ball);
//		
//		//14 前の問題に次の修正を加えなさい。
//		//１球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
//		//ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
//		//３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
//		Scanner sc14 = new Scanner(System.in);
//		int strike = 0;
//		int ball = 0;
//		while (strike < 3 && ball < 4) {
//			int count = sc14.nextInt();
//			if (strike == 1) {
//				strike++;
//			} else if (count == 2) {
//				ball++;
//			} else if (count == 3 && strike < 2) {
//				strike++;
//			}
//		}
//		System.out.println("strike=" + strike + " " + "ball=" + ball);
//		
//		//15 入力された数が素数かどうかを判定するプログラムを作成しなさい。
//		//2からn-1までで割り切れるかどうか
//		Scanner sc15 = new Scanner(System.in);
//		int num15 = sc15.nextInt();
//		for (int i = 2; i < num15; i++) {
//			if (num15 % i == 0) {
//				System.out.println(num15 + "は素数ではありません1");
//				return;
//			}
//		}
//		System.out.println(num15 + "は素数です2");
//		
//		//16 2 以上の数値を入力し、素因数分解した結果を表示しなさい。
//		Scanner sc16 = new Scanner(System.in);
//		int num16 = sc16.nextInt();
//		for (int i = 2; 1 < num16; i++) {
//			while (num16 % i == 0) { //2で割れたら次はまた2で割る、2で割れなくなったら次は3で割るを繰り返す
//				System.out.print(i + " ");
//				num16 /= i;
//			}
//		}
//		
//		//17 九九表（一の段～九の段）を表示するプログラムを作成しなさい。
//		//System.out.printfを使用する。System.out.printf(" %2d", x );のように、%2dと記述すると表示が2桁に揃う。
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf(" %2d", j * i);
//			}
//			System.out.println();
//		}
//		
//		//18 数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。
//		Scanner sc18 = new Scanner(System.in);
//		int total = 0;
//		for ( ; ; ) {
//			int num18 = sc18.nextInt();
//			if (num18 == 0) {
//				break;
//			}
//			total += num18;
//		}
//		System.out.println("total = " + total);
//		
//		//19 数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
//		//最後に入力された 0 は平均に含めない。
//		//少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
//		Scanner sc19 = new Scanner(System.in);
//		int ave = 0;
//		int count = 0;
//		for ( ; ; ) {
//			int num19 = sc19.nextInt();
//			if (num19 == 0) {
//				break;
//			}
//			ave += num19;
//			count++;	
//		}
//		System.out.println("AVE = " + (ave / count));
//		
//		//20 サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
//		Scanner sc20 = new Scanner(System.in);
//		int num20 = sc20.nextInt();
//		for (int i = 0; i < num20; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}
//		
//		//21 サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
//		Scanner sc21 = new Scanner(System.in);
//		int num21 = sc21.nextInt();
//		for (int i = 0; i < num21; i++) {
//			for (int j = 0; j < num21; j++) {
//				if (j == i || j == num21 - i - 1) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		//22 フィボナッチ数列を表示するプログラムを作成しなさい。
//		//最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
//		//フィボナッチ数列：それぞれの項がその直前の 2 つの項の和になっている数列のこと。例：0, 1, 1, 2, 3, 5, 8, 13, 21, ...
//		int n1 = 0;
//		int n2 = 1;
//		int n3 = n1 + n2;
//		while (n1 < 1000) {
//			System.out.print(n1 + ",");
//			n1 = n2;
//			n2 = n3;
//			n3 = n1 + n2;
//		}
		
		//FizzBuzz
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
				System.out.println(i) ;
			}
		} while (i < 100);
		
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