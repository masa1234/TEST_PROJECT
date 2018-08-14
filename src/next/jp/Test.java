package next.jp;

public class Test {

	public static void main(String[] args) {
		// メッセージを表示します
		System.out.println("hello world");

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
