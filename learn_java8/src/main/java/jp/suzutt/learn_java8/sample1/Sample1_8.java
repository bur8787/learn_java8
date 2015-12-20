package jp.suzutt.learn_java8.sample1;

class Foo1_8 {
	final int num1 = 10;
	final int num2;
	Foo1_8(int i ){ num2 = i; }
}

class Sample1_8 {
	public static void main(String[] args) {
		final Foo1_8 obj1 = new Foo1_8(100);
//		obj1.num1 = 20;
//		obj1 = new Foo(300);
		Foo1_8 obj2 = new Foo1_8(300);
		System.out.println("obj1.num1 : " + obj1.num1);
		System.out.println("obj2.num1 : " + obj2.num2);
	}
}
