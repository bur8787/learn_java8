package jp.suzutt.learn_java8.sample2;

class Foo2_6_1{
	public Foo2_6_1() {System.out.println("Foo2_6_1()");}
	public Foo2_6_1(int a){System.out.println("Foo2_6_1(int a)");}
}

class Bar2_6_1 extends Foo2_6_1{
	public Bar2_6_1(){System.out.println("Bar2_6_1()");}
	public Bar2_6_1(int a ) {
		super(a);
		System.out.println("Bar2_6_1(int a)");
	}

}


public class Sample2_6_1 {
	public static void main(String[] args) {
		Bar2_6_1 obj = new Bar2_6_1();
	}
}
