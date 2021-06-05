/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TETOSOFT.tilegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author yassi
 */
public class MenuStart {
    

    
    public  void render(Graphics g)
    {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int width = (int) screenSize.getWidth();
            int  height = (int) screenSize.getHeight();
            Rectangle playButton =new Rectangle(width/2-70,150,150,50);
            Rectangle quitButton =new Rectangle(width/2-70,250,150,50);
           Graphics2D  gd=(Graphics2D)g;
          
            Font font=new Font("Limelight",Font.BOLD,50);
             g.setFont(font);
             g.setColor(Color.white);
             g.drawString("Super Mario", width/2-140, 100);
              g.setColor(Color.BLUE);
              gd=(Graphics2D)g;
              gd.draw(playButton);

            
             Font font2=new Font("arial",Font.BOLD,30);
             g.setFont(font2);
             //g.setColor(Color.white);
             g.drawString("Play", playButton.x+40, playButton.y+35);
             g.setColor(Color.red);
             gd=(Graphics2D)g;
              gd.draw(quitButton);

            g.drawString("Quit", quitButton.x+40, quitButton.y+35);
            


    }
    
}
