package beanCopy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 被拷贝对象
 * 
 * @author wanghao
 *
 */
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;
	private Teacher teacher;
	
	public Student clone() {
		
		Student stu = null;
	      try { 
	    	  // 将该对象序列化成流,因为写在流里的是对象的一个拷贝，
	    	  //而原对象仍然存在于JVM里面。所以利用这个特性可以实现对象的深拷贝
	          ByteArrayOutputStream baos = new ByteArrayOutputStream();
	          ObjectOutputStream oos = new ObjectOutputStream(baos);
	          oos.writeObject(this);
	          // 将流序列化成对象
	          ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
	          ObjectInputStream ois = new ObjectInputStream(bais);
	          stu = (Student) ois.readObject();
	      } catch (IOException e) {
	          e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	          e.printStackTrace();
	      }
		return stu;
	}
	
	
	
	
	
	
	
	
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", teacher=" + teacher + "]";
	}

	public String printAddress() {
		return super.toString();
	}

}
