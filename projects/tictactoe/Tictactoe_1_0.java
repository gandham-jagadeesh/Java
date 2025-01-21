package tictactoe;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tictactoe_1_0 {

    public static Boolean checkFilled(JButton[] arr){
       for(JButton b:arr){
        if(b.getIcon() == null){
            return false;
        }
       }
       return true;
    }


    public static void checkWinner(JButton[] arr,ImageIcon playerx,ImageIcon player_0,JFrame outer){
        System.out.print("called winner function");
        //check first row or second row or thirdrow for player1
        //[0 1 2]
        //[3 4 5]
        //[6 7 8]
        if(arr[0].getIcon() == playerx && arr[1].getIcon() == playerx && arr[2].getIcon() == playerx || 
        arr[3].getIcon() == playerx && arr[4].getIcon() == playerx && arr[5].getIcon() == playerx    ||
        arr[6].getIcon() == playerx && arr[7].getIcon() == playerx && arr[8].getIcon() == playerx){
            System.out.print("x wins");
           JOptionPane.showMessageDialog(outer, "player_x wins");
        }

        else if(arr[0].getIcon() == playerx && arr[3].getIcon() == playerx && arr[6].getIcon() == playerx || 
        arr[1].getIcon() == playerx && arr[4].getIcon() == playerx && arr[7].getIcon() == playerx    ||
        arr[2].getIcon() == playerx && arr[5].getIcon() == playerx && arr[8].getIcon() == playerx){
            JOptionPane.showMessageDialog(outer, "player_x wins");

        }

        //check first col or second col or third col  //check diagnollay from right to left
        else if(arr[0].getIcon() == playerx && arr[4].getIcon() == playerx && arr[8].getIcon() == playerx || 
                arr[2].getAction() == playerx && arr[4].getIcon() == playerx && arr[6].getIcon() == playerx ){
                    JOptionPane.showMessageDialog(outer, "player_x wins");

                }
        
        //player y 
        else if(arr[0].getIcon() == player_0 && arr[1].getIcon() == player_0 && arr[2].getIcon() == player_0 || 
                arr[3].getIcon() == player_0 && arr[4].getIcon() == player_0 && arr[5].getIcon() == player_0    ||
                arr[6].getIcon() == player_0 && arr[7].getIcon() == player_0 && arr[8].getIcon() == player_0){
                    JOptionPane.showMessageDialog(outer, "player_0 wins");

                }
        
                else if(arr[0].getIcon() == player_0 && arr[3].getIcon() == player_0 && arr[6].getIcon() == player_0 || 
                arr[1].getIcon() == player_0 && arr[4].getIcon() == player_0 && arr[7].getIcon() == player_0    ||
                arr[2].getIcon() == player_0 && arr[5].getIcon() == player_0 && arr[8].getIcon() == player_0){
                    JOptionPane.showMessageDialog(outer, "player_0 wins");

                }
        
                //check first col or second col or third col  //check diagnollay from right to left
                else if(arr[0].getIcon() == player_0 && arr[4].getIcon() == player_0 && arr[8].getIcon() == player_0 || 
                        arr[2].getAction() == player_0 && arr[4].getIcon() == player_0 && arr[6].getIcon() == player_0 ){
                            JOptionPane.showMessageDialog(outer, "player_0 wins");
                        }
        

    }
    public static void main(String args[]){
        JFrame window = new JFrame();
        window.setTitle("TicTacToe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(200,200);
        JOptionPane.showMessageDialog(window, "welcome to j'sTicTacToe");
        ImageIcon player1_x = new ImageIcon("J:/java/projects/tictactoe/X.png");
        ImageIcon player1_0 = new ImageIcon("J:/java/projects/tictactoe/0.png");
        
        int scaledWidth  = 50;
        int scaledHeight = 50;

        Image scaledImagePlayer1_x = player1_x.getImage().getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
        Image scaledImagePlayer1_0 = player1_0.getImage().getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

        ImageIcon player1_x_resized  = new ImageIcon(scaledImagePlayer1_x);
        ImageIcon player2_0_resized  = new ImageIcon(scaledImagePlayer1_0);

        final Boolean isValid[] = {true};

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();

        JButton[] arr={b1,b2,b3,b4,b5,b6,b7,b8,b9};

        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.white);

        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b1.getIcon() != null){
                    return;
                }

                if(!checkFilled(arr)){
                checkWinner(arr, player1_x_resized, player2_0_resized, window);
                }

                if(isValid[0]){
                    b1.setIcon(player1_x_resized);
                }
                else{
                    b1.setIcon(player2_0_resized);
                }
                b1.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });


        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b2.getIcon() != null){
                    return;
                }
                if(!checkFilled(arr)){
                    checkWinner(arr, player1_x_resized, player2_0_resized, window);
                }
                if(isValid[0]){
                    b2.setIcon(player1_x_resized);
                }
                else{
                    b2.setIcon(player2_0_resized);
                }
                b2.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });
        
        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b2.getIcon() != null){
                    return;
                }
                if(!checkFilled(arr)){
                    checkWinner(arr, player1_x_resized, player2_0_resized, window);
                    }
                if(isValid[0]){
                    b2.setIcon(player1_x_resized);
                }
                else{
                    b2.setIcon(player2_0_resized);
                }
                b2.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });
        
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b3.getIcon() != null){
                    return;
                }
                if(!checkFilled(arr)){
                    checkWinner(arr, player1_x_resized, player2_0_resized, window);
                    }
                if(isValid[0]){
                    b3.setIcon(player1_x_resized);
                }
                else{
                    b3.setIcon(player2_0_resized);
                }
                b3.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });
        
        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b4.getIcon() != null){
                    return;
                }
                if(!checkFilled(arr)){
                    checkWinner(arr, player1_x_resized, player2_0_resized, window);
                    }
                if(isValid[0]){
                    b4.setIcon(player1_x_resized);
                }
                else{
                    b4.setIcon(player2_0_resized);
                }
                b4.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });
        
        b5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b5.getIcon() != null){
                    return;
                }

                if(!checkFilled(arr)){
                    checkWinner(arr, player1_x_resized, player2_0_resized, window);
                    }
                
                if(isValid[0]){
                    b5.setIcon(player1_x_resized);
                }
                else{
                    b5.setIcon(player2_0_resized);
                }
                b5.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });

        b6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b6.getIcon() != null){
                    return;
                }
                if(!checkFilled(arr)){
                    checkWinner(arr, player1_x_resized, player2_0_resized, window);
                    }
                if(isValid[0]){
                    b6.setIcon(player1_x_resized);
                }
                else{
                    b6.setIcon(player2_0_resized);
                }
                b6.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });


        b7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b7.getIcon() != null){
                    return;
                }
                if(!checkFilled(arr)){
                    checkWinner(arr, player1_x_resized, player2_0_resized, window);
                    }
                if(isValid[0]){
                    b7.setIcon(player1_x_resized);
                }
                else{
                    b7.setIcon(player2_0_resized);
                }
                b7.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });

        b8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b8.getIcon() != null){
                    return;
                }
                if(!checkFilled(arr)){
                    checkWinner(arr, player1_x_resized, player2_0_resized, window);
                    }
                if(isValid[0]){
                    b8.setIcon(player1_x_resized);
                }
                else{
                    b8.setIcon(player2_0_resized);
                }
                b8.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });

        b9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(b9.getIcon() != null){
                    return;
                }
                if(!checkFilled(arr)){
                    checkWinner(arr, player1_x_resized, player2_0_resized, window);
                    }
                if(isValid[0]){
                    b9.setIcon(player1_x_resized);
                }
                else{
                    b9.setIcon(player2_0_resized);
                }
                b9.setBackground(Color.orange);
                isValid[0]=!isValid[0];
            }
        });

        JPanel gridContainer = new JPanel(new GridLayout(3,3));

        gridContainer.add(b1);
        gridContainer.add(b2);
        gridContainer.add(b3);
        gridContainer.add(b4);
        gridContainer.add(b5);
        gridContainer.add(b6);
        gridContainer.add(b7);
        gridContainer.add(b8);
        gridContainer.add(b9);


        window.add(gridContainer);
        window.setVisible(true);
    }
}
