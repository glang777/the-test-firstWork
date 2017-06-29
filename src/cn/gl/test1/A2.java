package cn.gl.test1;

public class A2 implements A1 {

	public static void main(String[] args) {
		A2 a2 = new A2();
		Class<?>[] interfaces = a2.getClass().getInterfaces();
		
		for(Class<?> c : interfaces  ){
			
		}

	}

}
