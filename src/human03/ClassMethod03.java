package human03;

public class ClassMethod03 {
	public static void main(String[] args) {
		Human03 komazawa = new Human03();

		System.out.println("大学名は、" + komazawa.name + "です");
		String profile = komazawa.getprofile();
		System.out.println(profile + "です");
		
		komazawa.greet("佐藤");
		komazawa.greet(null);

	}

}
