package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import beanCopy.BoundedType;

public class Test01 {
	
	@Test
	public void boundedTypeTest() {
		BoundedType bt = new BoundedType();
		bt.checkBoundedType(1);
		bt.checkBoundedType(1.2);
//		bt.checkBoundedType(false);
	}
	@Test
	public void test01(){
		//Test01.println("123");
		List<Object> ls = new ArrayList<>();
		ls.add("小米");
		ls.add("小草");
		ls.add("小花");
		ls.add("小明");
		println(ls);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		List<String> ls2 = new ArrayList<>();
		ls.add("小米");
		ls.add("小草");
		ls.add("小花");
		ls.add("小明");
		println2(ls2);
	}
	public static <T> void println(T t) {
		System.out.println(t);
	}
	public  <T> void println(List<T> li) {
		for (T t : li) {
			li.remove("小草");
			System.out.println(t);
		}
	}
	public   void println2(List<?> li) {
		for (Object t : li) {
			li.remove("小草");
			System.out.println(t);
		}
	}
}
