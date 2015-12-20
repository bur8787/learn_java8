package jp.suzutt.learn_java8.sample1;

public class Sample1_13_1 implements Cloneable {

	public Sample1_13_1(int a) {
		this.a = a;
	}

	public int a;

	public int getA() {
		return a;
	}
	
	public static void main(String[] args) throws Throwable {
		// clone
		Sample1_13_1 sample1_13_1 = new Sample1_13_1(1);
		System.out.println(sample1_13_1.clone() == sample1_13_1);
		System.out
				.println(((Sample1_13_1) sample1_13_1.clone()).getA() == sample1_13_1
						.getA());
		System.out.println(sample1_13_1.clone().getClass() == sample1_13_1
				.getClass());
		// equals
		System.out.println(sample1_13_1.clone().equals(sample1_13_1));
		System.out.println(sample1_13_1);
		// toString
		System.out.println(sample1_13_1.toString());
		// hashCode
		System.out.println(sample1_13_1.hashCode());
		// wait
		synchronized (sample1_13_1) {
			sample1_13_1.wait(5000);
		}
		System.out.println("finished");
	}
}
