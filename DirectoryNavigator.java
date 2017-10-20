import java.lang.*;
import java.util.*;
import java.io.*;
import java.awt.*;

public class DirectoryNavigator {
  File[] files;
  DirectoryNavigator() {
    files = (new File("/")).listFiles();

  }
  void InnerDirectory(File newDirectory) {
    files = newDirectory.listFiles();

  }
  public int getLength() {
    return files.length;
  }
  String getName(int index) {
    return (files[index]).getName();
  }
  public static void main(String[] args) {
    DirectoryNavigator dn = new DirectoryNavigator();
    for(int count=0 ; count< dn.getLength(); count++ ) {
      System.out.println(dn.getName(count));
    }
  }
}
