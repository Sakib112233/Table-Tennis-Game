import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
public class Bat1 {
	
int x=0,y=600,a=0,b=0;
	

	public void paintBat(Graphics g){
		ImageIcon bat1Icon=new ImageIcon("bat11.png");
		Image bat1Image=bat1Icon.getImage();
		if(x>300){
		g.drawImage(bat1Image,x,y,null);
		}
		ImageIcon batIcon=new ImageIcon("bat22.png");
		Image batImage=batIcon.getImage();
		if(x<300){
		g.drawImage(batImage,x,y,null);
		}
	
	}
	public void act(ActionEvent e){
	
		if(x<0){
			a=0;
			x=0;
		}
		if(x>550){
			a=0;
			x=550;
		}

		x=x+a;
		
	}
	public void keyPressed(KeyEvent e){
		int c=e.getKeyCode();
		if(c==e.VK_LEFT){
			a=-10;
			
		}
		if(c==e.VK_RIGHT){
			a=10;
		
		}
		
	
	
	}
	
	public void keyReleased(KeyEvent e){

a=0;

	}
	public Rectangle getBoundsonbord() {
		return new Rectangle(0,420,550,10);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,75,10);
	}
	

}

