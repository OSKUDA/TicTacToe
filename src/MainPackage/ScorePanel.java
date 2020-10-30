package MainPackage;

import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JPanel {

	private static final long serialVersionUID = -5421580871017729980L;
	
	JLabel player1ScoreLabel, player2ScoreLabel;

	static JLabel player1ScoreValueLabel, player2ScoreValueLabel;

	
	
	
	public ScorePanel() {
		this.setLayout(new GridLayout(4,1,5,5));
		this.setBounds(460,107,200,447);
		this.setBackground(Color.gray);
		
		
		player1ScoreLabel = new JLabel("Player 1 score: ");
		player2ScoreLabel = new JLabel("Player 2 score: ");
		player1ScoreValueLabel = new JLabel(Integer.toString(BoardPanel.player1Score),JLabel.CENTER);
	
		player2ScoreValueLabel = new JLabel(Integer.toString(BoardPanel.player2Score),JLabel.CENTER);
		
		player1ScoreLabel.setFont(new Font("Courier",Font.BOLD,15));
		player2ScoreLabel.setFont(new Font("Courier",Font.BOLD,15));
		player1ScoreValueLabel.setFont(new Font("Courier",Font.BOLD,50));
		player2ScoreValueLabel.setFont(new Font("Courier",Font.BOLD,50));
		
		
		this.add(player1ScoreLabel);
		this.add(player1ScoreValueLabel);
		this.add(player2ScoreLabel);
		this.add(player2ScoreValueLabel);
		
	}
	public static void updateScore() {
		player1ScoreValueLabel.setText(Integer.toString(BoardPanel.player1Score));
		player2ScoreValueLabel.setText(Integer.toString(BoardPanel.player2Score));	
	}
	
	
}
