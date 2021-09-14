import java.io.*;
import java.nio.file.*;
public class hello {
	public static void main(String[] args) throws IOException {
		try(InputStream file=new FileInputStream(".\\lsm.c");
				CountInputStream in=new CountInputStream(file);){
			int n;
			while((n=in.read())!=-1) {
				System.out.print((char)n);
			}
			System.out.println(in.getBytesRead());
		}
		
		
	}
}
class CountInputStream extends FilterInputStream{
	private int count=0;
	CountInputStream(InputStream in){
		super(in);
	}
	public int getBytesRead() {
		return count;
	}
	public int read() throws IOException{
		int n=in.read();
		if(n!=-1) {
			this.count++;
		}
		return n;
	}
	public int read(byte[] b,int off,int len) throws IOException{
		int n=in.read(b, off, len);
		if(n!=-1) {
			this.count++;
		}
		return n;
	}
}