import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class file{
	public static void main(String ar[]) throws IOException{
		int ch;
		FileReader fr=new FileReader("sample.txt");
		FileWriter fw=new FileWriter("newsample.txt");
		while((ch=fr.read())!=-1){
			System.out.println(ch);
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
	}
}