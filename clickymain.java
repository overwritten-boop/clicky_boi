import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;  
import java.util.Random;

public class clickymain {
	
	public static int clicks = 0;
	public static String score = String.valueOf(clicks);
	
	public static void main(String[] args) {

		//declaration
		int y = 800;
		int x = 800; 
		
		//setting up rand obj
		Random rand = new Random();
		
		//naming stuff
		JFrame frame = new JFrame("Clicky Game");
		JLabel scoreboard = new JLabel("Your Score is: " + score);
		
		//button settings
		JButton button = new JButton("+");
		button.setBounds(50, 100, 100, 100);
		button.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		frame.getContentPane().setBackground(Color.BLUE);
		
		//score board stuff
		scoreboard.setBounds(15,15,100,30);
		
		//adds the action listener
		button.addActionListener(new ActionListener(){
	
	public void actionPerformed(ActionEvent e){
	
		//simba, everything in here happens when the button is pressed
		int num = rand.nextInt(11);
		clicks++;
		
		score = String.valueOf(clicks);
		scoreboard.setText("Your score is: " + score);
		
		switch(num){
		
		case 1:
			
			frame.getContentPane().setBackground(Color.red);
			button.setForeground(Color.red);
			button.setBackground(Color.green);
			
			break;
			
		case 2:
			
			frame.getContentPane().setBackground(Color.BLUE);
			button.setForeground(Color.blue);
			button.setBackground(Color.orange);
			
			break;
			
		case 3:
			
			frame.getContentPane().setBackground(Color.black);
			button.setForeground(Color.black);
			button.setBackground(Color.white);
			scoreboard.setForeground(Color.white);
			
			break;
			
		case 4:
			
			frame.getContentPane().setBackground(Color.cyan);
			button.setForeground(Color.cyan);
			button.setBackground(Color.orange);
			
			break;
			
		case 5:
			
			frame.getContentPane().setBackground(Color.green);
			button.setForeground(Color.green);
			button.setBackground(Color.red);
			
			break;
			
		case 6:
			
			frame.getContentPane().setBackground(Color.magenta);
			button.setForeground(Color.magenta);
			button.setBackground(Color.yellow);
			
			break;
			
		case 7:
			
			frame.getContentPane().setBackground(Color.orange);
			button.setForeground(Color.orange);
			button.setBackground(Color.blue);
			
			break;
			
		case 8:
			
			frame.getContentPane().setBackground(Color.pink);
			button.setForeground(Color.pink);
			button.setBackground(Color.green);
			
			break;
			
		case 9:
			
			frame.getContentPane().setBackground(Color.white);
			button.setForeground(Color.white);
			button.setBackground(Color.black);
			scoreboard.setForeground(Color.black);
			
			break;
			
		case 10:
			
			frame.getContentPane().setBackground(Color.yellow);
			button.setForeground(Color.yellow);
			button.setBackground(Color.magenta);
			scoreboard.setForeground(Color.black);
			
			break;
			
		default:
			
			//nothing happens
			
			break;
			
		}
		
		button.setBounds(rand.nextInt(x-200),rand.nextInt(y-200),100,100);
		
	}
	
		});
		
		//window stuff
		button.setForeground(Color.blue);
		button.setBackground(Color.orange);
		frame.add(scoreboard);
		frame.add(button);
		frame.setSize(x,y);	
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
