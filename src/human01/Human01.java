package human01;

public class Human01 {
	// メンバー変数
	public String name;
	public int age;

	// 引数なしのコンストラクタ
	public Human01() {
		name = "仲村";
		age = 24;
	}

	// 引数2つのコンストラクタ
	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}
}