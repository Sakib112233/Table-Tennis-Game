import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameWindow extends JPanel{

	public GameWindow(){
	Game s=new Game();
	JFrame f=new JFrame();
	f.add(s);
	f.setTitle("Game");
	f.setSize(650,720);
	f.setVisible(true);
	f.setLocation(400,0);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}