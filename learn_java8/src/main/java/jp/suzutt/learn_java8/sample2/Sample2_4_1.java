package jp.suzutt.learn_java8.sample2;

public class Sample2_4_1 {
	public static void main(String[] args) {
//		String a = (String)null;
//		String[] b = null;
		String c = "a";
		String[] d = {"a", "b"};
		Integer e = 1;
		int[] f = {1, 2};
		
//		System.out.println(a.getClass());
//		System.out.println(b.getClass());
		System.out.println(c.getClass());
		System.out.println(d.getClass());
		System.out.println(e.getClass());
		System.out.println(f.getClass());
		System.out.println(c.getClass().getTypeName());
		System.out.println(d.getClass().getTypeName());
		System.out.println(e.getClass().getTypeName());
		System.out.println(f.getClass().getTypeName());
	}
}
