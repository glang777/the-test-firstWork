package cn.gl.test1;

import java.util.Arrays;

public class Test2 {
	private String name;
	public static void main(String args[]){
		String an =new String();
		System.out.println(an.hashCode());
	
		Test2  t = new Test2();
		
		System.out.println( t.hashCode());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test2 other = (Test2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


}
