package Util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class CloneUtil {
	
	/**
	 * 使用流克隆对象
	 * 
	 * @param t 传入对象，必须实现Serializable序列号接口
	 * @return	克隆后的新对象
	 */
	public static <T extends Serializable> T cloneObjectBySerializable(T t) {
		T cloneT = null;
		try { 
	    	  // 将该对象序列化成流,因为写在流里的是对象的一个拷贝，
	    	  //而原对象仍然存在于JVM里面。所以利用这个特性可以实现对象的深拷贝
	          ByteArrayOutputStream baos = new ByteArrayOutputStream();
	          ObjectOutputStream oos = new ObjectOutputStream(baos);
	          oos.writeObject(t);
	          // 将流序列化成对象
	          ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
	          ObjectInputStream ois = new ObjectInputStream(bais);
	          cloneT = (T) ois.readObject();
	      } catch (IOException e) {
	          e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	          e.printStackTrace();
	      }
		return cloneT;
	}
}
