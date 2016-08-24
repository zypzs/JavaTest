package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println(String.class);
		System.out.println("hello".getClass());
		System.out.println(Class.forName("java.lang.String"));
		String str = "hello";
		Method m = str.getClass().getMethod("toUpperCase" );
		System.out.println(m.invoke(str));
	}
}
