import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game   extends JPanel implements ActionListener,KeyListener {
	Timer t=new Timer(10,this);
	Ball ball = new Ball(this);
	Bat1 bat1 = new Bat1();
	Bat2 bat2 = new Bat2();
	public Game(){

		super.addKeyListener(this);
		setFocusable(true);
		t.start();
		
	}
	public void paintComponent(Graphics g) {
	
		ImageIcon tableIcon=new ImageIcon("table.jpg");
		Image background=tableIcon.getImage();
		
		g.drawImage(background,0,0,null);
	
		bat2.paintBat(g);
		ball.paintBall(g);
		bat1.paintBat(g);
	}
	public void keyTyped(KeyEvent e){
		
	}
	public void keyReleased(KeyEvent e){
		bat1.keyReleased(e);
		bat2.keyReleased(e);
	}
	public void keyPressed(KeyEvent e){
		int c=e.getKeyCode();
		if(c==e.VK_ENTER){
			ball.x=100;
			ball.y=100;
			ball.velQ=2;
			ball.velW=4;
			t.start();
		}
		bat1.keyPressed(e);
		bat2.keyPressed(e);
	}
	public void actionPerformed(ActionEvent e){
		bat1.act(e);
		bat2.act(e);
		ball.act(e);
		repaint();
	}
	public void gameOver1() {
		t.stop();

	}
	public void gameOver2() {
		t.stop();
	}
	public void result1() {
		Sound.gameover();
		JOptionPane.showMessageDialog(this, "Game Over\n Player1 won", "player 1 won", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}
	

	public void result2() {
		Sound.gameover();
		JOptionPane.showMessageDialog(this, "Game Over\n Player2 won", "player 2 won", JOptionPane.YES_NO_OPTION);
	
		System.exit(ABORT);
		}
	
}
