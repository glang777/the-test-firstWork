package cn.gl.test1;

import static net.mindview.util.Print.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import cn.gl.test1.My.You;

public class Test1 {
		static Writer out;
		public Test1(File file){
			FileWriter writer = null;
			double sqrt = Math.sqrt(123d);
		
			try {
				writer = new FileWriter(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			out = new BufferedWriter(writer);
		}
		public static void main(String args[]){
			Thread a = new Thread(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println();
					out.write(null, null, null);
				}
				
			});
			print(a);
		}
	

}
