package next.jp;

public class Test {

	public static void main(String[] args) {
		// メッセージを表示します
		System.out.println("hello world");
		/*
		 * + 2つの数値の和を求める
		 * - 2つの数値の差を求める
		 * * 2つの数値の積を求める
		 * / 2つの数値の商を求める　右辺が０の場合、ArithmetecException例外がスローされる
		 * % 2つの数値の余りを求める
		 * instanceof 左辺のオブジェクトが右辺のクラスのインスタンスであれば真
		 */
		int numberA = 10;
		int numberB = 20;
		int numberC = 0;
		numberC = numberA + numberB;

		System.out.println(numberC);

		System.out.println("numberA++ :" + numberA++);
		System.out.println("numberA++ :" + ++numberA);
		System.out.println("numberB-- :" + numberB--);
		System.out.println("--numberC :" + --numberC);

		boolean result = numberA > numberB;
		System.out.println(result);

		/*
		 * numberDはnumberAが0より大きければ１をそうでなければ-1を返す
		 */
		int numberD = numberA > 0 ? 1 : -1;
		System.out.println(numberD);


	}

}
