import java.io.*;
import java.util.Scanner;

public class Main {
  public static void writeToFile(String filename){
    Scanner scanner = new Scanner(System.in);
    File file = new File(filename);
    try {
      if(file.createNewFile()){
        System.out.println("file created!");
      }
      else{
        System.out.println("file already exists!");
      }

      System.out.print("enter content: ");
      String content = scanner.nextLine();

      try (FileWriter writer = new FileWriter(filename)){
        writer.write(content);
        System.out.println("written to file! "+content);
      }

    } catch (IOException e) {
      System.out.println("IO Exception!");
    }
  }

  public static void readFromFile(String filename){
    try(FileReader reader = new FileReader(filename)){
      System.out.println("reading...");
      int c;
      while((c = reader.read()) != -1){
        System.out.print((char)c);
      }
    }catch(IOException e){
      System.out.println("error!");
    }
  }

  public static void main(String[] args){
    String filename = "file.txt";
    writeToFile(filename);
    readFromFile(filename);
  }
}
