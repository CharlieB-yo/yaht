import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class RollButton extends JPanel implements MouseListener{
  Dice dice;
  JLabel picLabel = new JLabel(new ImageIcon(constructImage()));

  public RollButton (Dice d){
    addMouseListener(this);
    //Dice.addMouseListener(this);
   dice = d;
   add(picLabel);
  }
private Image constructImage() {

  File imageFile = new File(System.getProperty("user.dir") + "/button_roll.png");
  return new ImageIcon(imageFile.toString()).getImage();
}


    public void mouseDragged (MouseEvent event) {
    }
    public void mouseReleased (MouseEvent event) {
    }
    public void mousePressed (MouseEvent event) {

    }
    public void mouseEntered (MouseEvent event) {
    }
    public void mouseExited (MouseEvent event) {
    }
    public void mouseClicked (MouseEvent event) {
      System.out.println("rolling!");
      dice.roll();
    }
}
  
