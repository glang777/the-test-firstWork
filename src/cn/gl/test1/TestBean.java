package cn.gl.test1;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class TestBean {
	 {
		 
		System.out.println("123");
	}

	public static void main(String args[]) {
		TestBean a = new TestBean();
		/*
		 * BeanInfo beanInfo = Introspector.getBeanInfo(TestBean.class);
		 * PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
		 * for(PropertyDescriptor des: descriptors){ String fieldName =
		 * des.getName(); System.out.println(fieldName); Method getter =
		 * des.getReadMethod(); System.out.println(getter.getName());
		 * 
		 * Method getter = des.getReadMethod(); Object fieldValue =
		 * getter.invoke(bean, new Object[]{});
		 * if(!fieldName.equalsIgnoreCase("class")){ result.put(fieldName,
		 * fieldValue); }
		 */
	}
	
	
}
