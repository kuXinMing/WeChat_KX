package beanCopy;
/**
 * 有界类型
 * @author wanghao
 *
 */
public class BoundedType {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public <T extends Number> void checkBoundedType(T t) {
		System.out.println("你输入的的2倍是："+ t.intValue()*2);
	}
	
}

interface S1{};
interface S2{};
interface S3{};
