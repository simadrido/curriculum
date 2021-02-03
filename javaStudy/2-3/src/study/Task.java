package study;


//① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator{
/**
 * タスクの実行
 */
public void doTask() {

    // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
    // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
	
	private int a;
    private int b;
    private int c;


    public Task (int a) {
        this.constructor(a, 0, 0);
    }

    public Task(int a, int b) {
        this.constructor(a, b, 0);
    }

    public Task(int a, int b, int c) {
        this.constructor(a, b, c);
    }


    private void constructor(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    
  }

}

