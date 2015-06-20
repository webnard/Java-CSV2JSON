import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

class RandomLine {
  public static void main(String args[]) throws FileNotFoundException, IOException {
    String filename = args[0];
    RandomAccessFile file = new RandomAccessFile(filename, "r");
    long length = file.length();
  }
}
