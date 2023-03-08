import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.imageio.stream.FileImageInputStream;

/*File Input Stream- For File reading
 *File Output Stream- For File writing.
 *
 * 
 * */
public class FileInputOutputStream {
public static void main(String[] args) throws Exception {
	FileOutputStream fos= new FileOutputStream("Tops1.txt");
	String s="This is file input output stream.";
	byte b[]=s.getBytes();
	fos.write(b);
	fos.flush();
	fos.close();
	System.out.println("File written successfully.");
	
	FileInputStream fis= new FileInputStream("tops1.txt");
	int i;
	while((i=fis.read())!=-1)
	{
		System.out.print((char)i);
	}
	fis.close();
	
}
}
