import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class MainFrame extends Frame {
  DirectoryNavigator currentDir;
  Button[] buttonlist ;
  MainFrame() {
    setLayout(new FlowLayout(FlowLayout.LEFT));
    currentDir = new DirectoryNavigator();
    buttonlist = new Button[currentDir.getLength()];
    formButtons();

  }

  void formButtons() {
    buttonlist = new Button[currentDir.getLength()];
    final int count;
    for (count = 0; count < currentDir.getLength();  count++ ) {
      buttonlist[count] = new Button(currentDir.getName(count));
      add(buttonlist[count]);

      buttonlist[count].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          System.out.println("xx");
          currentDir.innerDirectory(count);
          repaint();
        }
      });

    }

  }

  public void paint(Graphics g) {
    formButtons();
  }

  public static void main(String[] args) {
    MainFrame appMainFrame = new MainFrame();
    appMainFrame.setSize(300,400);
    appMainFrame.setVisible(true);
  }
}

// class FileClicker implements ActionListener {
//   DirectoryNavigator currentDir;
//   int count;
//   FileClicker(DirectoryNavigator currentDir, int count) {
//     this.currentDir = currentDir;
//     this.count = count;
//   }
//   public void actionPerformed(ActionEvent ae){
//     innerDirectory(currentDir[count]);
//   }
// }
