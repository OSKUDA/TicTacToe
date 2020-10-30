package MainPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RestartResetPanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = -1017508512183350989L;

	JButton restartButton,resetButton;
	
	public RestartResetPanel() {
		this.setVisible(true);
		this.setLayout(new GridLayout(1,2,0,0));
		this.setBounds(460,4,200,100);
		
		
		restartButton = new JButton("RESTART!!");
		resetButton = new JButton("RESET!!");
		restartButton.setFocusable(false);
		resetButton.setFocusable(false);
		
		restartButton.addActionListener(this);
		resetButton.addActionListener(this);
		
		
		this.add(restartButton);
		this.add(resetButton);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==restartButton) {
			BoardPanel.boardInit();
		}else if(evt.getSource()==resetButton) {
			BoardPanel.gameInit();
		}
	}
}
