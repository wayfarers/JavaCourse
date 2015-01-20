package week7.lesson14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileInputStreamExmple {
 public static void main(String[] args) throws IOException {
  InputStream is = new FileInputStream("file2.txt");
  int example = 1;
  int k;
  
  if(example == 1){
   int codeChar = 10;
   while(codeChar > -1){
    codeChar = is.read();  
    System.out.println(codeChar + " = [" + ((char)codeChar) + "]");
   }
  }
  
  if(example == 2){
   byte[] buf = new byte[20];
   k = is.read(buf);
   System.out.println("k="+k);
   for(byte b : buf) System.out.println("["+b+"]=["+(char)(b)+"]");   
  }
  if(example == 3){
   int len = is.available();
   byte[] buf = new byte[len];
   k = is.read(buf);
   System.out.println("k="+k);
   for(byte b : buf) System.out.println("["+b+"]=["+(char)(b)+"]");
  }
  is.close();
 }
}

