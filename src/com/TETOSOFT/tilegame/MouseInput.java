/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TETOSOFT.tilegame;

import com.TETOSOFT.tilegame.GameEngine.STATE;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 *   Rectangle playButton =new Rectangle(width/2+120,150,100,50);
         Rectangle quitButton =new Rectangle(width/2+120,250,100,50);
 * @author yassi
 */
public class MouseInput implements MouseListener{
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
double width = screenSize.getWidth();
double height = screenSize.getHeight();
    @Override
    public void mouseClicked(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        int mx=e.getX(),my=e.getY();
        if(GameEngine.state==STATE.MENU){
        if(mx>=width/2-70 && mx<=width/2-70+150 )
        {
            if(my>=150 && my<=200)
            {GameEngine.state=GameEngine.STATE.GAME;
           }
            
        }
        if(mx>=width/2-70 && mx<=width/2-70+150)
        {
            if(my>=250 && my<=300){
                System.exit(0);}
                 
        }
        }
        
        else   if(GameEngine.state==STATE.GAMEOVER){
        if(mx>=width/2-70 && mx<=width/2-70+150 )
        {
            if(my>=220 && my<=270)
            {GameEngine.state=GameEngine.STATE.GAME;
           }
            
        }
        if(mx>=width/2-70 && mx<=width/2-70+150)
        {
            if(my>=300 && my<=350){
                System.exit(0);}
                 
        }
        }
        
        


//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
