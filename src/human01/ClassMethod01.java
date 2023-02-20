package human01;

public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 nakamura = new Human01(); // Human01クラスのインスタンスを生成
		System.out.println("名前は" + nakamura.name + "で、年齢は" + nakamura.age + "です。");

		Human01 sato = new Human01("佐藤", 25); // Human01クラスのインスタンスを生成
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}