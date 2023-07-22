package java8project;

public class MethodsInOwnClass {

	public static void main(String[] args) {
		System.out.println("creating own class and calling methods");
		MyUtils.junk("101");//classname.methodname()
	    System.out.println(MyUtils.jun("Hello Everyone")); //returning through print 
		MyUtils.sum2num(10,25);//these are arguments
		int myvar=MyUtils.add10(100);//returning a value
		System.out.println(myvar);
		int my=MyUtils.add10(100)+1000-500+200;//calculation
		System.out.println(my);
	}

}
