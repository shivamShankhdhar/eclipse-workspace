package fileStreamPackageForIllustrations;
import java.io.*;
public class WriteToFileWithFileOutputStream {

	public static void main(String[] args){
		try {
		FileOutputStream fout = new FileOutputStream("E:\\testout.txt",true);
		String s = " this is my name again";
		byte[] b = s.getBytes();
		fout.write(b);
//		fout.close();
//		System.out.println("Success");
		FileOutputStream f = new FileOutputStream("E:\\test2.txt");
		FileInputStream fin = new FileInputStream("E:\\testout.txt");
		int r  = fin.read();
		System.out.print((char)r);
		fin.close();
		fout.close();
//		f.write(r);
//		while(r!=-1) {
//			
//			f.write(r);
//		}
		}catch(IOException e) {}
	}
}

