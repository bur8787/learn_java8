package jp.suzutt.learn_java8;

public class Sample1_9 {
	int instanceVal;
	static int staticVal;
	
	int methodA() { return instanceVal;}
	int methodB() { return staticVal; }
//	static int methodC() { return instanceVal;}
	static int methodD() { return staticVal;}
}
