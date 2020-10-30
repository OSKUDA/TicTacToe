package MainPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BoardPanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = -3619605875902942246L;

	private static ImageIcon Oicon = new ImageIcon("o.png");
	private static ImageIcon Xicon = new ImageIcon("x.png");
	
	//make 9 buttons 
	static JButton button1, button2, button3, button4, button5,
			button6, button7, button8, button9;
	
	
	
	//game environment variables
	public static boolean GameFinished = false;
	public static boolean player1Turn = true;
	public static boolean player1Won = true;
	public final static String player1Marker = "X";
	public final static String player2Marker = "O";
	public static int player1Score = 0;
	public static int player2Score = 0;
	public static int turnCounter=0;
	
	
	

	public BoardPanel() {
		
		this.setLayout(new GridLayout(3,3,5,5));
		this.setBounds(5,105,450,450);
		//this.setSize(400,400);
		this.setBackground(Color.pink);

		//instantiate 9 buttons
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		button4.setFocusable(false);
		button5.setFocusable(false);
		button6.setFocusable(false);
		button7.setFocusable(false);
		button8.setFocusable(false);
		button9.setFocusable(false);
		
		//add action listener to buttons
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
				
		
		
		
		
		
	
		//add button to panel
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		
		//setActionCommand default to player1
		setActionCommand(player1Turn);
		
	}
	private void addIconX(JButton targetButton) {	
		if(targetButton.getIcon()==null) {
			targetButton.setIcon(Xicon);
			turnCounter++;
		}
		
	}
	private void addIconO(JButton targetButton) {
		if(targetButton.getIcon()==null) {
			targetButton.setIcon(Oicon);
			turnCounter++;
		}
	}
	public static void setActionCommand(boolean player1Turn) {
		
		if(player1Turn) {
			button1.setActionCommand(player1Marker);
			button2.setActionCommand(player1Marker);
			button3.setActionCommand(player1Marker);
			button4.setActionCommand(player1Marker);
			button5.setActionCommand(player1Marker);
			button6.setActionCommand(player1Marker);
			button7.setActionCommand(player1Marker);
			button8.setActionCommand(player1Marker);
			button9.setActionCommand(player1Marker);
		}else {
			button1.setActionCommand(player2Marker);
			button2.setActionCommand(player2Marker);
			button3.setActionCommand(player2Marker);
			button4.setActionCommand(player2Marker);
			button5.setActionCommand(player2Marker);
			button6.setActionCommand(player2Marker);
			button7.setActionCommand(player2Marker);
			button8.setActionCommand(player2Marker);
			button9.setActionCommand(player2Marker);
		}
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
			
		
		if(evt.getActionCommand().equals("X")) {
			if(evt.getSource()==button1) {
				addIconX(button1);
			}else if(evt.getSource()==button2) {
				addIconX(button2);
			}else if(evt.getSource()==button3) {
				addIconX(button3);
			}else if(evt.getSource()==button4) {
				addIconX(button4);
			}else if(evt.getSource()==button5) {
				addIconX(button5);
			}else if(evt.getSource()==button6) {
				addIconX(button6);
			}else if(evt.getSource()==button7) {
				addIconX(button7);
			}else if(evt.getSource()==button8) {
				addIconX(button8);
			}else if(evt.getSource()==button9) {
				addIconX(button9);
			}
		}
		if(evt.getActionCommand().equals("O")) {
			if(evt.getSource()==button1) {
				addIconO(button1);
			}else if(evt.getSource()==button2) {
				addIconO(button2);
			}else if(evt.getSource()==button3) {
				addIconO(button3);
			}else if(evt.getSource()==button4) {
				addIconO(button4);
			}else if(evt.getSource()==button5) {
				addIconO(button5);
			}else if(evt.getSource()==button6) {
				addIconO(button6);
			}else if(evt.getSource()==button7) {
				addIconO(button7);
			}else if(evt.getSource()==button8) {
				addIconO(button8);
			}else if(evt.getSource()==button9) {
				addIconO(button9);
			}
		}
		
		checkWin();
		if(turnCounter==9) {	//game is TIE
			GameFinished=true;
		}
		if(GameFinished) {
			
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			button4.setEnabled(false);
			button5.setEnabled(false);
			button6.setEnabled(false);
			button7.setEnabled(false);
			button8.setEnabled(false);
			button9.setEnabled(false);
			ScorePanel.updateScore();
			
			
		}
		player1Turn = !player1Turn;
		setActionCommand(player1Turn);
		
	}
	public void checkWin() {
		//assume X is player1
		//assume O is player2
		/*-----------------------------horizontal matching---------------------*/
		if(button1.getIcon()==Xicon && button2.getIcon()==Xicon && button3.getIcon()==Xicon) {
			player1Score++;
			player1Won = true;
			GameFinished = true;
		}else if(button4.getIcon()==Xicon && button5.getIcon()==Xicon && button6.getIcon()==Xicon) {
			player1Score++;
			player1Won = true;
			GameFinished = true;
		}else if(button7.getIcon()==Xicon && button8.getIcon()==Xicon && button9.getIcon()==Xicon) {
			player1Score++;
			player1Won = true;
			GameFinished = true;
		}
		if(button1.getIcon()==Oicon && button2.getIcon()==Oicon && button3.getIcon()==Oicon) {
			player2Score++;
			player1Won = false;
			GameFinished = true;
		}else if(button4.getIcon()==Oicon && button5.getIcon()==Oicon && button6.getIcon()==Oicon) {
			player2Score++;
			player1Won = false;
			GameFinished = true;
		}else if(button7.getIcon()==Oicon && button8.getIcon()==Oicon && button9.getIcon()==Oicon) {
			player2Score++;
			player1Won = false;
			GameFinished = true;
		}
		/*-----------------------------vertical matching---------------------*/
		if(button1.getIcon()==Xicon && button4.getIcon()==Xicon && button7.getIcon()==Xicon) {
			player1Score++;
			player1Won = true;
			GameFinished = true;
		}else if(button2.getIcon()==Xicon && button5.getIcon()==Xicon && button8.getIcon()==Xicon) {
			player1Score++;
			player1Won = true;
			GameFinished = true;
		}else if(button3.getIcon()==Xicon && button6.getIcon()==Xicon && button9.getIcon()==Xicon) {
			player1Score++;
			player1Won = true;
			GameFinished = true;
		}
		if(button1.getIcon()==Oicon && button4.getIcon()==Oicon && button7.getIcon()==Oicon) {
			player2Score++;
			player1Won = false;
			GameFinished = true;
		}else if(button2.getIcon()==Oicon && button5.getIcon()==Oicon && button8.getIcon()==Oicon) {
			player2Score++;
			player1Won = false;
			GameFinished = true;
		}else if(button3.getIcon()==Oicon && button6.getIcon()==Oicon && button9.getIcon()==Oicon) {
			player2Score++;
			player1Won = false;
			GameFinished = true;
		}
		/*-----------------------------diagonal matching---------------------*/
		if(button1.getIcon()==Xicon && button5.getIcon()==Xicon && button9.getIcon()==Xicon) {
			player1Score++;
			player1Won = true;
			GameFinished = true;
		}else if(button3.getIcon()==Xicon && button5.getIcon()==Xicon && button7.getIcon()==Xicon) {
			player1Score++;
			player1Won = true;
			GameFinished = true;
		}
		if(button1.getIcon()==Oicon && button5.getIcon()==Oicon && button9.getIcon()==Oicon) {
			player2Score++;
			player1Won = false;
			GameFinished = true;
		}else if(button3.getIcon()==Oicon && button5.getIcon()==Oicon && button7.getIcon()==Oicon) {
			player2Score++;
			player1Won = false;
			GameFinished = true;
		}
		
		
		
		
	}
	public static void boardInit() {
		GameFinished = false;
		player1Turn = true;
		setActionCommand(player1Turn);
		turnCounter = 0;
		button1.setIcon(null);
		button2.setIcon(null);
		button3.setIcon(null);
		button4.setIcon(null);
		button5.setIcon(null);
		button6.setIcon(null);
		button7.setIcon(null);
		button8.setIcon(null);
		button9.setIcon(null);
		
		
		//enable buttons
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		button5.setEnabled(true);
		button6.setEnabled(true);
		button7.setEnabled(true);
		button8.setEnabled(true);
		button9.setEnabled(true);

		
		
		
		
	}
	public static void gameInit() {
		boardInit();
		player1Score = 0;
		player2Score = 0;
		ScorePanel.updateScore();
	}
	
}
