package MainPackage;

import javax.swing.*;
import java.awt.*;
public class PlayerInfoPanel extends JPanel {
	
	private static final long serialVersionUID = -812236526971932765L;
	
	JLabel player1MarkerInfoLabel, player2MarkerInfoLabel, player1IndicatorLabel, player2IndicatorLabel;
	
	private static ImageIcon Xlowres;
	private static ImageIcon Olowres;
	
	
	public PlayerInfoPanel() {
		
		Xlowres = new ImageIcon(getClass().getClassLoader().getResource("xlowres.png"));
		Olowres = new ImageIcon(getClass().getClassLoader().getResource("olowres.png"));
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT,15,0));
		this.setBounds(7,5,446,96);
		this.setBackground(new Color(121, 131, 148));
		
		
		
		player1MarkerInfoLabel = new JLabel(Xlowres,JLabel.CENTER);
		player2MarkerInfoLabel = new JLabel(Olowres,JLabel.CENTER);
		player1IndicatorLabel = new JLabel("Player 1");
		player2IndicatorLabel = new JLabel("Player 2");

		player1IndicatorLabel.setPreferredSize(new Dimension(98,98));;
		player1IndicatorLabel.setFont(new Font("Courier",Font.BOLD,20));
		player1IndicatorLabel.setForeground(Color.YELLOW);
		
		
		player2IndicatorLabel.setPreferredSize(new Dimension(98,98));
		player2IndicatorLabel.setFont(new Font("Courier",Font.BOLD,20));
		player2IndicatorLabel.setForeground(Color.green);
		
		
		this.add(player1IndicatorLabel);
		this.add(player1MarkerInfoLabel);
		this.add(player2IndicatorLabel);
		this.add(player2MarkerInfoLabel);
		
		
		
		
		
		
		
		
		
	}
	
}
