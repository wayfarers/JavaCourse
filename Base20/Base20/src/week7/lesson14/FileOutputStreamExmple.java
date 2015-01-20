package week7.lesson14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExmple {
 public static void main(String[] args) throws IOException {
  OutputStream os = new FileOutputStream("file2.txt");
  byte[] buf = {100,101,102};
  os.write(97);
  os.write(buf);
  os.close();  
 }
}
