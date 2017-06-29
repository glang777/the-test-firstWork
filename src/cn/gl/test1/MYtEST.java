package cn.gl.test1;

import java.util.HashMap;
import java.util.Map;

public class MYtEST {

	public static void main(String[] args)   {
	/*	String a ="wo ai ni a !";
		System.out.println(a.substring(a.indexOf("ai")+2));*/
		/*String b = "a";
		System.out.println("abcdwwds".contains(b));*/
		//say(0);
		/*Map<String,Object> map = new HashMap<String,Object>();
		System.out.println(map.get("1"));*/
		String a ="F:/hyjg/w34c6c7dsfd35354zaszxczzs3234sww/report/hy/fpdata/3_12.bin";
		System.out.println(a.length());
	}
	
	public static void say(int i) throws TTTexcetion {
	
			try {
				if(i  == 0){
					throw new TTTexcetion("我自己的错误!");
				}
				//int x = 2 /0 ;
				System.out.println("2222");
			} catch (TTTexcetion e) {
				throw e;
			}
	
	
	}
}
