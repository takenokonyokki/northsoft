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
		
		//4-10 個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
		System.out.println("数字を入力してください");
		Scanner scanner3 = new Scanner(System.in);
		int num = scanner3.nextInt(); //入力
		for (int i = 0; i < num; i++) { //入力された数値だけ繰り返す
			System.out.print("*");
		}
		
		System.out.println();
		
		//4-11 個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
		//2重for文ではない
		System.out.println("数字を入力してください");
		Scanner scanner4 = new Scanner(System.in);
		int num2 = scanner4.nextInt();
		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(j);
			}
		}
		System.out.println();
		//正しくは
		for (int i = 0; i < num2; i++) { //入力された数字だけ繰り返す
			System.out.print(i % 10); //
		}
	}
}