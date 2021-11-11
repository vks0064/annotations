
public class Annotation1 {
	
	@interface test{
		int test_case();
	}
	
	@test(test_case=1)
	public static void meth1() {
		System.out.println("this is method 1");
	}
	
	@test(test_case=2)
	public void meth2() {
		System.out.println("this is method 2");
	}
	public static void main(String[]args) {
		meth1();
	}
	

}
