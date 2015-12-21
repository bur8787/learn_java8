package jp.suzutt.learn_java8.sample2;

class Foo2_4{
	public void method(String... val){
		int ans = val == null ? 0 : val.length;
		System.out.println(val + " : " + ans);
	}
}

public class Sample2_4 {
	public static void main(String[] args) {
		Foo2_4 obj = new Foo2_4();
		obj.method("A", "B");
		obj.method(null);
		obj.method((String[]) null);
		obj.method();
		obj.method((String)null);
	}
}
