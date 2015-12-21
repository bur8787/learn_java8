package jp.suzutt.learn_java8.sample2;

class Super2_2{
	void methodA(){System.out.println("Super : methodA()");}

	static void methodB(){System.out.println("Super : methodB()");};
}

class Sub2_2 extends Super2_2{
	void methodA(){System.out.println("Sub : methodA");}
//	static void methodA(){System.out.println("Sub : methodA");}
	static void methodB(){System.out.println("Sub : methodB");}
//	void methodB(){System.out.println("Sub : methodB");}
}

public class Sample2_2 {
	public static void main(String[] args) {
		Sub2_2 obj = new Sub2_2();
		obj.methodA();
		obj.methodB();
	}
}
