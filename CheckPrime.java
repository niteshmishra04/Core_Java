class A{
	void show() {
		System.out.println("1");
	}
}

class CheckPrime extends A{
	void show1() {
		System.out.println("2");
	}	
	public static void main(String[] args) {
		CheckPrime b = new CheckPrime();
		b.show();
		b.show1();
	}
}

