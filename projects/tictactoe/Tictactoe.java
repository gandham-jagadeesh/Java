package tictactoe;

import javax.swing.*;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tictactoe{
    public static void main(String args[]){
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,600);
        jf.setLayout(null);
        ImageIcon picx = new ImageIcon("J:/java/projects/tictactoe/X.png");
        ImageIcon pic0 = new ImageIcon("J:/java/projects/tictactoe/0.png");
        int height=50;
        int width=50;
        Image scaledImage = pic0.getImage().getScaledInstance(height, width, Image.SCALE_SMOOTH);
        ImageIcon scaleimage = new ImageIcon(scaledImage);
        JButton but0 = new JButton(scaleimage);
        //JButton but0 = new JButton();
        // b.addMouseListener(new MouseAdapter(){
        //     @Override
        //     public void mouseClicked(MouseEvent e){
        //         b.setText("you clicked");
        //     }
        // });
       // butx.setBounds(200,200,200,200);
        but0.setBounds(50,50,100,100);
      // butx.setBackground(Color.green);
       but0.setBackground(Color.green);
        jf.add(but0);
        //jf.add(but0);
        jf.setLayout(null);
        jf.setVisible(true);

    }
}