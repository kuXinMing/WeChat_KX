package test;


import org.junit.jupiter.api.Test;

public class Test02 {

	
	@Test
	public void test01() {
		Demo d1  = new Demo();
		d1.setAge(123);
		d1.setName(new String("小明"));
		Demo d2  = new Demo();
		d2.setAge(123);
		d2.setName("小明");
		System.out.println(d1.equals(d2));
		Demo d3  = new Demo();
		d3.setAge(123);
		d3.setName(new String("小明"));
		System.out.println(d1.equals(d3));
		
	}
	@Test
	public void test02() {
		String a=new String("foo");
		String b=new String("foo");
		System.out.println(a!=b);
		
	}
	
	@Test
    public void test03()
        throws Exception
    {
        System.out.println(10 & 2);
        System.out.println(10 | 2);
        System.out.println(10 ^ 2);
        System.out.println(~2);
    }
	
}



class Demo{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Test
    public void test04()
        throws Exception
    {
	    //子类引用指向父类引用的对象
	    Father f = new Son();
	    Son s = (Son)f;
    }
	
}



class Father{}
class Son extends Father{}
