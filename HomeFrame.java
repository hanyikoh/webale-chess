package OurAssignment;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.*;
import java.io.File;

public class HomeFrame {
    JFrame frame =new JFrame("Webale Chess");
    JPanel panel = new JPanel();
   
    JButton startGame = new JButton ("Start Game");
    JButton loadGame = new JButton ("Load Game");
    JButton instruction = new JButton ("Instruction");
    JButton quitGame = new JButton ("Quit");
    private BufferedImage imageIcon;
    
    
    public HomeFrame(){
        // startGame.addActionListener(this);
        // loadGame.addActionListener(this);
        // instruction.addActionListener(this);
        // quitGame.addActionListener(this);
        panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(2, 3, 2, 3));
        JPanel layout = new JPanel(new GridBagLayout());
        layout.setBorder(new EmptyBorder(5, 5, 5, 5));
        JPanel btnPanel = new JPanel(new GridLayout(10, 1, 10, 5));
      
    //     try {                
    //       imageIcon = ImageIO.read(getClass().getResource(("logo.png")));
    //    } catch (IOException ex) {
    //         System.out.print("cant load image");
    //    }
       
        btnPanel.add(startGame);
        btnPanel.add(loadGame);
        btnPanel.add(instruction);
        btnPanel.add(quitGame);
        layout.add(btnPanel);
        panel.add(layout, BorderLayout.CENTER);
        
        frame.add(panel);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("WEBALE CHESS");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
    }
    
    public static void main (String[] args){
        new HomeFrame();
    }

}
