package jp.suzutt.learn_java8.sample2;

class Foo2_5{
	public void method(int a){
		System.out.println("method(int a)");
	}
	
	public void method(long a){
		System.out.println("method(long a)");
	}
	
	public void method(Integer a){
		System.out.println("method(Integer a)");
	}
	
	public void method(int... a){
		System.out.println("method(int... a)");
	}
	
//	public void method(int[] a){
//		System.out.println("method(int[] a)");
//	}
}

public class Sample2_5 {
	public static void main(String[] args) {
		Foo2_5 obj = new Foo2_5();
		obj.method(100);
	}
}
