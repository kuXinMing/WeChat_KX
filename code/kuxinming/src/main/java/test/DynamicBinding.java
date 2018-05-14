package test;


import org.junit.jupiter.api.Test;

public class DynamicBinding {

	@Test
	public void test01() {
		//对象多态
		Cat cat2 = new Cat();
		cat2.sleep();
		Animal am3 = new Cat();
		Animal am4 = new Cat();
	}
}


class Animal{
	int num = 10;
	static int age = 20;
	public void eat() {
		System.out.println("动物在吃饭");
	}
	public final static void sleep() {
		System.out.println("动物在睡觉");
	}
	public void run() {
		System.out.println("动物在奔跑");
	}
}

class Cat extends Animal{
	int num = 80;
	static int age = 90;
	String name = "tomCat";
	public void eat() {
		System.out.println("猫在吃鱼");
	}

	public void catchMouse() {
		System.out.println("猫在抓老鼠");
	}
}