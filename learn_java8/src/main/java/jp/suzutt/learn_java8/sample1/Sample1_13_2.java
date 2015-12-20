package jp.suzutt.learn_java8.sample1;

public class Sample1_13_2 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getClass());
		A a = new B();
		System.out.println(a.getClass());
		D d = new D();
		System.out.println(d.getClass());
		C c = new D();
		System.out.println(c.getClass());
	}
}

class A{
	
}

class B extends A{
	
}

interface C{
	
}

class D implements C{
	
}
