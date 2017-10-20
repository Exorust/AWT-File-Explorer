import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class MainFrame extends Frame {

  MainFrame() {

    setLayout(new FlowLayout(FlowLayout.LEFT));
    DirectoryNavigator currentDir = new DirectoryNavigator();
    Button[] buttonlist = new Button[currentDir.getLength()];
    for ( int count = 0; count < currentDir.getLength();  count++ ) {
      buttonlist[count] = new Button(currentDir.getName(count));
      add(buttonlist[count]);
      buttonlist[count].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){

        }
      });
    }

  }

  public static void main(String[] args) {
    MainFrame appMainFrame = new MainFrame();
    appMainFrame.setSize(300,400);
    appMainFrame.setVisible(true);
  }
}
