package human03;

public class Human03 {
	public String name;
	public int age;
	public String profession;

	public Human03() {
		this.name = "駒澤大学";
		this.age = 431;
		this.profession = "大学";
	}

	public String getprofile() {
		return "創立から" + this.age + "年目の" + "仏教" + this.profession;
	}

	public void greet(String friend) {
		if (friend == null) {
			System.out.println("お金が欲しいです。");
			return;
		}
		System.out.println(friend + "さんの学費のおかげでで、大学が潤っています。");

	}

}