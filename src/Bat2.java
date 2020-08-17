import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
public class Bat2 {

	
	int x=60,y=20,a=0,b=0;

	public void paintBat(Graphics g){
		ImageIcon bat2Icon=new ImageIcon("bat11.png");
		Image bat2Image=bat2Icon.getImage();
		if(x<300){
		g.drawImage(bat2Image,x,y,null);
		}
		ImageIcon bat22Icon=new ImageIcon("bat22.png");
		Image bat22Image=bat22Icon.getImage();
		if(x>300){
		g.drawImage(bat22Image,x,y,null);
		}
	}
	public void act(ActionEvent e){
	
		if(x<60){
			a=0;
			x=60;
		}
		if(x>550){
			a=0;
			x=550;
		}
	
		x=x+a;

		
	
	}
	public void keyPressed(KeyEvent e){
	
		int r=e.getKeyCode();
		if(r==e.VK_A){
			a=-10;
			
		}
		if(r==e.VK_D){
			a=10;
			
		}
	
	}

	public void keyReleased(KeyEvent e){
    a=0;

	}
	public Rectangle getBoundsonbord() {
		return new Rectangle(0,120,550,10);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,61,20);
	}

}
