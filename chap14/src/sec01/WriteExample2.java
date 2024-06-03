package sec01;

import java.io.*;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./bin/sec01/test1.txt");
		//Writer writer = new FileWriter("./bin/sec01/test2.txt");
		//Writer writer = new FileWriter("./bin/sec01/test3.txt");
		//Writer writer = new FileWriter("./bin/sec01/test4.txt");
		
		//char a = 'A';
		//char b = 'B';
		//char c = 'C';
		writer.write('A');
		//writer.write(' ');
		writer.write('B');
		//writer.write(' ');
		writer.write('C');
		//writer.write(' ');
		
		//char[] array = { 'A', 'B', 'C' };
		//writer.write(array);
		
		//char[] array = { 'A', 'B', 'C', 'D', 'E' };
		//writer.write(array, 1, 3);
		
		//String str = "ABC";
		//writer.write(str);
		
		writer.flush();
		writer.close();
		
		System.out.println("프로그램 종료");
	}
}
