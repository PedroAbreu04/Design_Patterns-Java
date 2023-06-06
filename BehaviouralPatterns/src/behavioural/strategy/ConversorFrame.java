package behavioural.strategy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ConversorFrame {
	private JFrame frame;
	private File input;
	
	public void init() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(640, 480);
		
		JPanel panel = new JPanel(null);
		JLabel lblInput = new JLabel("File:");
		lblInput.setBounds(10,10,50,20);
		panel.add(lblInput);
		JTextField txtInput = new JTextField();
		txtInput.setBounds(60, 10, 100, 20);
		panel.add(txtInput);
		JButton btnInput = new JButton("Selecione...");
		btnInput.setBounds(170,10,100,20);
		btnInput.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(null);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					input = fc.getSelectedFile();
					txtInput.setText(input.getName());
				}
				
			}
			
		});
		panel.add(btnInput);
		
		JButton btnPNG = new JButton("PNG");
		btnPNG.setBounds(10,40,70,20);
		btnPNG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Context ctx = new Context();
				ctx.setStrategy(new PNGStrategy());
				ctx.convert(input, generateOutput(input, "png"));
				JOptionPane.showMessageDialog(btnPNG, "Image converted!!");
				
			}
		});
		panel.add(btnPNG);
		
		JButton btnWEBP = new JButton("WEBP");
		btnWEBP.setBounds(90,40,70,20);
		btnWEBP.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Context ctx = new Context();
				ctx.setStrategy(new WEBPStrategy());
				ctx.convert(input, generateOutput(input, "webp"));
				JOptionPane.showMessageDialog(btnWEBP, "Image converted!!");
				
			}
		});
		panel.add(btnWEBP);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
	private String generateOutput(File input, String extension) {
		return String.format("%s%s%s.%s", 
				input.getParent(),
				File.separator,
				input.getName().substring(0, input.getName().lastIndexOf("."))
				, extension);
	}
}
