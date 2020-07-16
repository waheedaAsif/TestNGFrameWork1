package dateClass;

public class StaticKeyword {
	int empid;
	String name;
	static String company = "ABD";

	public StaticKeyword(int empid, String name) {

		this.empid = empid;
		this.name = name;
	}

	void show() {
		System.out.println(empid + name + company);

	}

	public static void main(String[] args) {

		StaticKeyword sk = new StaticKeyword(1, "waheeda");
		sk.show();
		sk.show();

	}

}
