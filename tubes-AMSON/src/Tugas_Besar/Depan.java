package Tugas_Besar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Depan extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton BT_start, BT_quit;
	JPanel centerPanel;
	JLabel LBL_Judul, background;

	/*-------------- fungsi selluruh tampilan halaman depan --------------*/
	public void initLabels() {
		LBL_Judul = new JLabel("ANIMAL'S SOUND");
		LBL_Judul.setFont(new Font("Agency", Font.BOLD, 45));
		LBL_Judul.setForeground(Color.ORANGE);
		LBL_Judul.setHorizontalAlignment(JLabel.CENTER);
		background = new JLabel(new ImageIcon("img\\bg.png"));

	}

	public void initButtons() {
		BT_start = new JButton("MAIN");
		BT_start.setFont(new Font("Agency", Font.BOLD, 23));
		BT_start.setOpaque(false);
		BT_start.setContentAreaFilled(false);
		BT_start.setBorderPainted(false);
		BT_start.setForeground(Color.white);
		BT_start.addActionListener(this);

		BT_quit = new JButton("KELUAR");
		BT_quit.setFont(new Font("Agency fb", Font.BOLD, 24));
		BT_quit.setForeground(Color.RED);
		BT_quit.setOpaque(false);
		BT_quit.setContentAreaFilled(false);
		BT_quit.setBorderPainted(false);
		BT_quit.addActionListener(this);

	}

	public void initPanels() {
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(2, 1, 0, 1));
		centerPanel.setBorder(new EmptyBorder(190, 180, 74, 180));
		centerPanel.setOpaque(false);
		centerPanel.add(BT_start);
		centerPanel.add(BT_quit);

	}

	public Depan(String depan) {
		this.setSize(490, 380);
		this.setTitle(depan);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		initLabels();
		initButtons();
		initPanels();
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(LBL_Judul, BorderLayout.NORTH);
		this.getContentPane().add(centerPanel, BorderLayout.SOUTH);
		this.setVisible(true);
		setLayout(new BorderLayout());
		this.add(background);
		background.setLayout(new FlowLayout());

	}

	public static void main(String[] args) {
		new Depan("AMSON");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BT_start) {
			new Belakang(2);
		}

		if (e.getSource() == BT_quit) {
			System.exit(0);
		}

	}

}