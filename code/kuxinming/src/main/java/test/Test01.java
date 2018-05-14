package test;

import java.util.ArrayList;
import java.util.List;


import beanCopy.BoundedType;
import org.junit.jupiter.api.Test;

public class Test01 {

	public static void  main (String[] args){
		System.out.println(1);
	}


	@Test
	public void boundedTypeworkspaceest() {
		BoundedType bt = new BoundedType();
		bt.checkBoundedType(1);
		bt.checkBoundedType(1.2);
//		bt.checkBoundedType(false);
	}
	@Test
	public void test01(){
		//Test01.println("123");
		List<Object> ls = new ArrayList<Object>();
		ls.add("小米");
		ls.add("小草");
		ls.add("小花");
		ls.add("小明");
		println(ls);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		List<String> ls2 = new ArrayList<String>();
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


interface I1 { void f();};
interface I2 { int f();};
interface I3 { void f(int i);};

class C1 implements  I1,I3{

    @Override
    public void f() {

    }
    @Override
    public void f(int i) {

    }
}