

//@FunctionalInterface
//interface FunctionalInterfaceExample {
//	abstract void method1();
//}

class ClassA {
	int i=10;
}


public class LambdaExpressions extends ClassA {
	public static void main(String [] arg) {
		int i=100;
		
		ClassA classA = new LambdaExpressions();
		
		System.out.println(classA.i);
		
	}

}
