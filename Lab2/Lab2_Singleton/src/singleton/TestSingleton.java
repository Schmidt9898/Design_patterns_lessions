package singleton;

public class TestSingleton {
	public static void foo()
	{
	  GlobalClass.global_ptr.set_value(1);
	  System.out.println("foo: global_ptr is " + GlobalClass.global_ptr.get_value() + ", and the instance is: "+GlobalClass.global_ptr + "\n");
	}
	
	public static void bar()
	{
	  GlobalClass.global_ptr.set_value(2);
	  System.out.println("bar: global_ptr is " + GlobalClass.global_ptr.get_value() + ", and the instance is: "+GlobalClass.global_ptr + "\n");
	}
	
	public static void main(String[] args) {
		//GlobalClass a = new GlobalClass();
		GlobalClass.get_instance();
		System.out.println("main: global_ptr is " + GlobalClass.global_ptr.get_value() + ", and the instance is: "+GlobalClass.global_ptr + "\n");
		foo();
		bar();
	}
	
}
