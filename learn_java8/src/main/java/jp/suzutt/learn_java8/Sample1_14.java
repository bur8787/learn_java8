package jp.suzutt.learn_java8;

public class Sample1_14 {
	public static void main(String[] args) {
		String obj1 = "tanaka";
		Foo obj2 = new Foo();
		Bar obj3 = new Bar();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}

class Foo{}
class Bar{
	public String toString() {
		return "This is an object made from Bar.";
	}
}
