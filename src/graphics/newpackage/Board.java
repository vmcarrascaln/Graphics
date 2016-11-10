/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics.newpackage;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Estudiante
 */
public class Board extends JPanel implements ActionListener {
    private Timer timer;
    private int x;
    private int y;
    
    public Board(){
        this.x=10;
        this.y=10;
        timer = new Timer (80, (ActionListener) this);
        timer.start();
        
    } 
    public void actionPerformed (ActionEvent e){
        this.x+=5;
        
        repaint();
        
    }
    
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent (g);
        g.drawOval (50,50,50,50);
        g.drawRect(75, 100, 1, 100);
        g.drawOval(50, 50, 50, 50);
        g.drawRect(50, 50, 55, 55);
        
    }
    
}
