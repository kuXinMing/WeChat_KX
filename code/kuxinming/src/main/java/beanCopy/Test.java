package beanCopy;

import Util.CloneUtil;

public class Test {

	@org.junit.jupiter.api.Test
	public void test01() {
		//s1
		Student s1 = new Student();
		s1.setName("小黑");
		s1.setAge(12);
		s1.setId(1);
		Teacher t1 = new Teacher();
		t1.setName("小黑老师");
		s1.setTeacher(t1);
		//s2
		Student s2 = null;
		//= (Student) s1.clone();
		s2.setId(2);
		s2.setName("小白");
		Teacher t2 = new Teacher();
		t2.setName("小白老师");
		s2.setTeacher(t2);
		
		System.out.println("S1:" + s1);
		System.out.println("S2:" + s2);
		System.out.println("S1对象的地址为："+s1.printAddress());
		System.out.println("S2对象的地址为："+s2.printAddress());
	}
	

	public void test02() {
		Student s1 = new Student();
		s1.setName("ming");
		s1.setAge(12);
		s1.setId(1);
		Student s2 = s1;
		s2.setId(2);
		System.out.println("S1:" + s1);
		System.out.println("S2:" + s2);
	}
	

	public void test03() {
		//s1
		Student s1 = new Student();
		s1.setName("小黑");
		s1.setAge(12);
		s1.setId(1);
		Teacher t1 = new Teacher();
		t1.setName("小黑老师");
		s1.setTeacher(t1);
		//s2
		Student s2 = (Student) s1.clone();
		s2.setId(2);
		s2.setName("小白");
		Teacher t2 = new Teacher();
		t2.setName("小白老师");
		s2.setTeacher(t2);
		
		System.out.println("S1:" + s1);
		System.out.println("S2:" + s2);
		System.out.println("S1对象的地址为："+s1.printAddress());
		System.out.println("S2对象的地址为："+s2.printAddress());
	}

	public void test04() {
		//s1
		Student s1 = new Student();
		s1.setName("小黑");
		s1.setAge(12);
		s1.setId(1);
		Teacher t1 = new Teacher();
		t1.setName("小黑老师");
		s1.setTeacher(t1);
		//S2
		Student s2 = CloneUtil.cloneObjectBySerializable(s1);
		s2.setId(2);
		s2.setName("小白");
		Teacher t2 = new Teacher();
		t2.setName("小白老师");
		s2.setTeacher(t2);
		System.out.println("S1:" + s1);
		System.out.println("S2:" + s2);
	}
}
