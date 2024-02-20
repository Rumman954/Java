package Fileio;
import java.lang.*;
import java.util.*;
import java.io.*;


public class FileReadWriteDemo
{
  private File file;        //to create a File
  private FileWriter writer;    //to write in a file
  private FileReader reader;    //to read from a file
  private BufferedReader bfr;   //to read file content  
  
   public void writeInFile(String a,String string,String c)
  {
    /*
      creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
      So, we need to write the whole thing in try-catch.
    */
    try
    {
      file = new File("Customer Info.txt");  //Declaring a file named named File.txt for creating.
      file.createNewFile();         //If the file does not exists, creates and opens the file. else, just opens the file
      writer = new FileWriter(file, true);  //creating the writer object to write in the file.
      writer.write("Customer Name- "+a+"\nCustomer NID Number- "+string+"\nCustomer Phone Number- "+c+"\r"+"\n"+"\n");   //writing string a,c & int b in the file. the "\r" and "\n" has been concat to go to a newline.
      writer.flush();             //After writing, we need to flush to indicate that we have completed writing.
      writer.close();             //After flushing, we need to close the file to save our writing.
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
  }
  
  public void readFromFile()
  {
    /*
      reading from a file genarates compile time exceptions (Checked Exceptions).
      So, we need to write the whole thing in try-catch.
    */
    
    try
    {
      reader = new FileReader(file);      //creating the reader object to read from a file.
      bfr = new BufferedReader(reader);   //creating the BufferedReader object using the reader object to read the file content.
      String text="", temp;         //declaring two string variables to read the file content and storing them.
      
      while((temp=bfr.readLine())!=null)    //reading one line from the file, storing it in the variable temp and checking whether it is null or not. It will be null at the end of reading from the file.
      {
        text=text+temp+"\n"+"\r";     //storing the temp string in text by concating it with text and "\n" and "\r" is used to go to a newline.
      }
      
      System.out.println(text);       //printing the whole string in console.
      reader.close();             //closing the file.
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
  }
  
}


