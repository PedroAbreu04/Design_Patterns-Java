package behavioural.state;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UI {
	private Player player;
	private static JTextField textField = new JTextField();
	
	public UI(Player player) {
		this.player = player;
	}
	
	public void init() {
		JFrame frame = new JFrame("Test player");
		frame.setSize(300,100);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		frame.getContentPane().add(panel);
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(textField);
		panel.add(buttons);
		
		JButton play = new JButton("Play");
		play.addActionListener(c -> textField.setText(player.getState().onPlay()));
		buttons.add(play);
		
		JButton stop = new JButton("Stop");
		stop.addActionListener(c -> textField.setText(player.getState().onLock()));
		buttons.add(stop);
		
		JButton next = new JButton("Next");
		next.addActionListener(c -> textField.setText(player.getState().onNext()));
		buttons.add(next);
		
		JButton prev = new JButton("Prev");
		prev.addActionListener(c -> textField.setText(player.getState().onPrevious()));
		buttons.add(prev);
		
		
		frame.setVisible(true);
	}
}
