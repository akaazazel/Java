import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        FileInputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f1 = new FileInputStream("source.txt");
            f2 = new FileOutputStream("target.txt");
            int c;

            while ((c = f1.read()) != -1) {
                f2.write(c);
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("An error occurred during file I/O.");
        } finally {
            try {
                if (f1 != null) f1.close();
                if (f2 != null) f2.close();
            } catch (IOException e) {
                System.out.println("Error closing the file streams.");
            }
        }
    }
}
