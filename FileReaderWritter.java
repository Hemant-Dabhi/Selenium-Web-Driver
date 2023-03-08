import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWritter {

public static void main(String[] args) throws Exception {
	FileWriter fw=new FileWriter("Tops2.txt");
	String s="This is file writer reader demo.";
	fw.write(s);
	fw.flush();
	fw.close();
	
	FileReader fr=new FileReader("Tops2.txt");
	int i;
	while((i=fr.read())!=-1)
	{
		System.out.print
		((char)i);
	}
	fr.close();
	
	
}
}
