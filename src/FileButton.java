import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class FileButton extends Button {
  File inherentFile;
  FileButton(File fl) {
    super(fl.getName());
    this.inherentFile = fl;
  }
  File getFile() {
    return inherentFile;
  }
}
