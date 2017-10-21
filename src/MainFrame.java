import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class MainFrame extends Frame {
  FileButton[] fileButtonList;
  int ListLength;

  MainFrame() {
    setLayout(new FlowLayout(FlowLayout.LEFT));
    setFileList(new FileButton(new File("/")));
    addButtons();
  }
  
  void setFileList(FileButton fb) {
    File fl = fb.getFile();
    File[] files = fl.listFiles();
    ListLength = files.length;
    FileButton[] fileButtonList = new FileButton[ListLength];
    for(int index = 0; index < ListLength; index++) {
      fileButtonList[index] = new FileButton(files[index]);
      System.out.println(index);
    }

  }
  void addButtons() {
    for(int index = 0; index < ListLength; index++) {
      add(fileButtonList[index]);
    }
  }
  void attachListener() {
    for(int index = 0; index < ListLength; index++) {
      FileButton currentFileButton = fileButtonList[index];
      MainFrame mfCaller = this;
      currentFileButton.addActionListener(new FileClicker(currentFileButton,mfCaller));
    }
  }
  public void paint(Graphics g) {
    addButtons();
  }
  public static void main(String[] args) {
    MainFrame appMainFrame = new MainFrame();
    appMainFrame.setSize(300,400);
    appMainFrame.setVisible(true);
  }
}

class FileClicker implements ActionListener {
  FileButton currentFileButton;
  MainFrame mfCaller;
  FileClicker(FileButton currentFileButton, MainFrame mfCaller) {
    this.mfCaller = mfCaller;
    this.currentFileButton = currentFileButton;
  }
  public void actionPerformed(ActionEvent ae) {
    mfCaller.setFileList(currentFileButton);
    mfCaller.repaint();
  }
}
