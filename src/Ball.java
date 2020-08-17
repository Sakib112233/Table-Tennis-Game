import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ball{



	int x=100,y=100,velQ=0,velW=0;
	int n=0;
	int v=0;
	
	private Game game;

	public Ball(Game game) {
		this.game= game;
	}
	public void paintBall(Graphics g){
		ImageIcon bat1Icon=new ImageIcon("ball.png");
		Image bat1Image=bat1Icon.getImage();
		g.drawImage(bat1Image,x,y,null);
	
	}
	public void act(ActionEvent e){
	
		
	
		if (y + velW < -20){
	
			game.gameOver1();
		n++;
		}
		if (y + velW>700){
		
			game.gameOver2();
		v++;
		}
		
		if (x>300&&collisionDown()){
			velQ = -1;
			velW=-5;
			Sound.hit();
			
			}

		if (x<300&&collisionDown()){
			velQ = 1;
			velW=-5;
			Sound.hit();
			
			
			}
		if (x<300&&collisionUp()){
			velQ = 2;
			velW=6;
			Sound.hit();
			
			
			}

		if (x>300&&collisionUp()){
			velQ = -2;
			velW=6;
			Sound.hit();
			
			}
		if (velW>0&&x<310&&collision3()){
			velQ=-3;
			
			
			}
		if (velW>0&&x>310&&collision3()){
			velQ=4;
			
			
			}
		if (velW<0&&x<240&&collision4()){
			velQ=3;
			
			
			}
		if (velW<0&&x>250&&x<300&&collision4()){
			velQ=-3;
			
			
			}
		if (velW<0&&x>320&&x<400&&collision4()){
			velQ=3;
			
			
			}
	
		if (velW<0&&x>400&&collision4()){
			velQ=-2;
			
			
			}
	
		x+=velQ;
		y+=velW;
		if(n==3){
			game.result1();
		}
		if(v==3){
			game.result2();
		}
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, 20, 20);
	}
	private boolean collisionDown() {
		return game.bat1.getBounds().intersects(getBounds());
		
	}
	private boolean collisionUp() {
		return game.bat2.getBounds().intersects(getBounds());
	}
	private boolean collision3() {
		return game.bat1.getBoundsonbord().intersects(getBounds());
	}
	private boolean collision4() {
		return game.bat2.getBoundsonbord().intersects(getBounds());
	}
}
