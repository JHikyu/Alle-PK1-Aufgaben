package VL05;

import java.io.File;
import java.io.RandomAccessFile;

public class main {
  public static void main(String[] args) {
    try {
      copy(new File("./VL05/myFile"), new File("./VL05/myFile_copy"));
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  private static void copy(File from, File to) throws Exception {
    // * Throw exceptions
    if (!from.exists())
      throw new Exception("File not found");
    if (to.exists())
      throw new Exception("New file already exists");
    if (!from.canRead())
      throw new Exception("File is busy!");

    RandomAccessFile fromR = new RandomAccessFile(from, "r");
    RandomAccessFile toRW = new RandomAccessFile(to, "rw");
    for (int i = 0; i < fromR.length(); i++) {
      int c = (char) fromR.read();
      toRW.write(c);
    }

    try {
      fromR.close();
    } catch (Exception e) {
      // TODO: handle exception
    }

    try {
      toRW.close();
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
