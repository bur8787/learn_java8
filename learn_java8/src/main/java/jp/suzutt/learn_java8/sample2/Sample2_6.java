package jp.suzutt.learn_java8.sample2;

class Super2_6{
	int num;
	public void methodA(){ num += 100;}
	public void print(){System.out.println("num値：" + num);}
}

class Sub2_6 extends Super2_6{
	public void methodA() {num += 500;}
	public void methodB(int num){
		methodA();
		print();
		super.methodA();
		print();
	}
}

public class Sample2_6 {
	public static void main(String[] args) {
		Sub2_6 s = new Sub2_6();
		s.methodB(0);
	}
}
