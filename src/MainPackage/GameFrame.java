package MainPackage;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
	
	private static final long serialVersionUID = 2829135623077128299L;

	public GameFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Oskuda's TicTacToe");
		this.setSize(680,600);
		this.getContentPane().setBackground(Color.pink);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		
		
		
		this.add(new BoardPanel());
		this.add(new PlayerInfoPanel());
		this.add(new ScorePanel());
		this.add(new RestartResetPanel());
		
		this.setVisible(true);
		
	}
	
	
	
}
