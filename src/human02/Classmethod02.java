package human02;

public class Classmethod02 {
	public static void main(String[] args) {
		Human02 nakamura = new Human02();

		System.out.println("名前は" + nakamura.name + "で、年齢は" + nakamura.age + "です。");

		Human02 sato = new Human02("佐藤", 30);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}