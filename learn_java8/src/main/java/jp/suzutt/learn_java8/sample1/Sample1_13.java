package jp.suzutt.learn_java8.sample1;

class  Foo1_13{}

class Sample1_13 {
	public static void main(String[] args) {
		int[] ary = {1, 2, 3};
		Class obj1 = ary.getClass();
		System.out.println(obj1.getName());
		Foo1_13 foo = new Foo1_13();
		Class obj2 = foo.getClass();
		System.out.println(obj2.getName());
	}
}
