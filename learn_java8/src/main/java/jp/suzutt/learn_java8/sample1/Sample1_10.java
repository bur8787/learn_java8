package jp.suzutt.learn_java8.sample1;

class Foo110 {
	static {
		System.out.println("Foo クラス : static{ }");
	}
	{
		System.out.println("Foo クラス : { }");
	}
	Foo110() {
		System.out.println("Foo クラス : Foo()");
	}
	Foo110(int a) {
		System.out.println("Foo クラス : Foo(int a)");
	}
}

class Sample1_10 {
	static {
		System.out.println("Sample1_10 クラス : static{ }");
	}
	public static void main(String[] args) {
		System.out.println("Sample1_10 クラス : main()");
		Foo110 f1 = new Foo110();
		Foo110 f2 = new Foo110(100);
	}
}
