package jp.suzutt.learn_java8;

class Foo {
	final int num1 = 10;
	final int num2;
	Foo(int i ){ num2 = i; }
}

class Sample1_8 {
	public static void main(String[] args) {
		final Foo obj1 = new Foo(100);
//		obj1.num1 = 20;
//		obj1 = new Foo(300);
		Foo obj2 = new Foo(300);
		System.out.println("obj1.num1 : " + obj1.num1);
		System.out.println("obj2.num1 : " + obj2.num2);
	}
}