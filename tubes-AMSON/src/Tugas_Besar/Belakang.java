package Tugas_Besar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Belakang extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JPanel westPanel, felinPanel, caninPanel, f1, f2, f3, c1, c2, buttonfPanel, buttoncPanel;
	JButton BT_home, BT_cat, BT_dog, BT_soundcat, BT_soundlion, BT_soundwolf, BT_sounddog, BT_soundtiger;
	JButton BT_catnext, BT_catprev, BT_dogprev, BT_dognext;
	JLabel background, img_tiger, img_lion, img_cat, img_wolf, img_dog;
	CardLayout felinLayout, caninLayout;

	/*-------------- fungsi memutar suara --------------*/
	public void playSound(String soundName) {

		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			// System.out.println("Error ... Suara tidak ditemukan !!!");

		}

	}

	// public void Stopsound(String soundName) {

	// try {
	// AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new
	// File(soundName).getAbsoluteFile());
	// Clip clip = AudioSystem.getClip();
	// clip.open(audioInputStream);
	// clip.stop();
	// } catch (Exception ex) {

	// }

	// }

	/*-------------- fungsi gambar hewan --------------*/
	public Image initPics(String urlPic) {
		ImageIcon icon = new ImageIcon(urlPic);
		Image image = icon.getImage();
		Image newimg = image.getScaledInstance(145, 145, java.awt.Image.SCALE_SMOOTH);
		return newimg;

	}

	/*-------------- fungsi ukuran pda hewan --------------*/
	public void initLabels() {

		background = new JLabel(new ImageIcon("img\\bg.png"));

		img_cat = new JLabel(new ImageIcon(initPics("img\\cat.png")));
		img_cat.setBorder(new EmptyBorder(50, 10, 0, 100));

		img_tiger = new JLabel(new ImageIcon(initPics("img\\tiger.png")));
		img_tiger.setBorder(new EmptyBorder(55, 10, 0, 100));

		img_lion = new JLabel(new ImageIcon(initPics("img\\lion.png")));
		img_lion.setBorder(new EmptyBorder(55, 10, 0, 100));

		img_dog = new JLabel(new ImageIcon(initPics("img\\dog.png")));
		img_dog.setBorder(new EmptyBorder(55, 10, 0, 100));

		img_wolf = new JLabel(new ImageIcon(initPics("img\\wolf.png")));
		img_wolf.setBorder(new EmptyBorder(55, 10, 0, 100));

	}

	/*-------------- button container/halaman awal --------------*/
	public void initButtons() {

		BT_home = new JButton("<- KEMBALI");
		BT_home.setFont(new Font("Agency FB", Font.BOLD, 21));
		BT_home.setOpaque(false);
		BT_home.setContentAreaFilled(false);
		BT_home.setBorderPainted(false);
		BT_home.setForeground(Color.WHITE);
		BT_home.addActionListener(this);

		/*-------------- button jenis hewan --------------*/
		BT_cat = new JButton("JENIS KUCING");
		BT_cat.setFont(new Font("Agency FB", Font.BOLD, 21));
		BT_cat.setOpaque(false);
		BT_cat.setContentAreaFilled(false);
		BT_cat.setBorderPainted(false);
		BT_cat.setForeground(Color.BLACK);
		BT_cat.addActionListener(this);

		BT_dog = new JButton("JENIS ANJING");
		BT_dog.setFont(new Font("Agency FB", Font.BOLD, 21));
		BT_dog.setOpaque(false);
		BT_dog.setContentAreaFilled(false);
		BT_dog.setBorderPainted(false);
		BT_dog.setForeground(Color.BLACK);
		BT_dog.addActionListener(this);

		/*-------------- button pindah --------------*/
		BT_catnext = new JButton("SELANJUTNYA ->");
		BT_catnext.setFont(new Font("Agency FB", Font.BOLD, 21));
		BT_catnext.setOpaque(false);
		BT_catnext.setContentAreaFilled(false);
		BT_catnext.setBorderPainted(false);
		BT_catnext.setForeground(Color.white);
		BT_catnext.addActionListener(this);

		BT_catprev = new JButton("<- SEBELUMNYA");
		BT_catprev.setFont(new Font("Agency FB", Font.BOLD, 21));
		BT_catprev.setOpaque(false);
		BT_catprev.setContentAreaFilled(false);
		BT_catprev.setBorderPainted(false);
		BT_catprev.setForeground(Color.white);
		BT_catprev.addActionListener(this);

		BT_dognext = new JButton("SELANJUTNYA ->");
		BT_dognext.setFont(new Font("Agency FB", Font.BOLD, 21));
		BT_dognext.setOpaque(false);
		BT_dognext.setContentAreaFilled(false);
		BT_dognext.setBorderPainted(false);
		BT_dognext.setForeground(Color.white);
		BT_dognext.addActionListener(this);

		BT_dogprev = new JButton("<- SEBELUMNYA");
		BT_dogprev.setFont(new Font("Agency FB", Font.BOLD, 21));
		BT_dogprev.setOpaque(false);
		BT_dogprev.setContentAreaFilled(false);
		BT_dogprev.setBorderPainted(false);
		BT_dogprev.setForeground(Color.white);
		BT_dogprev.addActionListener(this);

		/*-------------- button nama hewan + suara --------------*/
		BT_soundcat = new JButton("KUCING");
		BT_soundcat.setFont(new Font("Agency FB", Font.BOLD, 20));
		BT_soundcat.setOpaque(false);
		BT_soundcat.setContentAreaFilled(false);
		BT_soundcat.setBorderPainted(false);
		BT_soundcat.setForeground(Color.white);
		BT_soundcat.setBorder(new EmptyBorder(10, 0, 0, 110));
		BT_soundcat.addActionListener(this);

		BT_soundlion = new JButton("SINGA");
		BT_soundlion.setFont(new Font("Agency FB", Font.BOLD, 20));
		BT_soundlion.setOpaque(false);
		BT_soundlion.setContentAreaFilled(false);
		BT_soundlion.setBorderPainted(false);
		BT_soundlion.setForeground(Color.white);
		BT_soundlion.setBorder(new EmptyBorder(10, 0, 0, 110));
		BT_soundlion.addActionListener(this);

		BT_soundtiger = new JButton("HARIMAU");
		BT_soundtiger.setFont(new Font("Agency FB", Font.BOLD, 20));
		BT_soundtiger.setOpaque(false);
		BT_soundtiger.setContentAreaFilled(false);
		BT_soundtiger.setBorderPainted(false);
		BT_soundtiger.setForeground(Color.white);
		BT_soundtiger.setBorder(new EmptyBorder(10, 0, 0, 110));
		BT_soundtiger.addActionListener(this);

		BT_soundwolf = new JButton("SERIGALA");
		BT_soundwolf.setFont(new Font("Agency FB", Font.BOLD, 20));
		BT_soundwolf.setOpaque(false);
		BT_soundwolf.setContentAreaFilled(false);
		BT_soundwolf.setBorderPainted(false);
		BT_soundwolf.setForeground(Color.white);
		BT_soundwolf.setBorder(new EmptyBorder(10, 0, 10, 110));
		BT_soundwolf.addActionListener(this);

		BT_sounddog = new JButton("ANJING");
		BT_sounddog.setFont(new Font("Agency FB", Font.BOLD, 20));
		BT_sounddog.setOpaque(false);
		BT_sounddog.setContentAreaFilled(false);
		BT_sounddog.setBorderPainted(false);
		BT_sounddog.setForeground(Color.white);
		BT_sounddog.setBorder(new EmptyBorder(10, 0, 0, 110));
		BT_sounddog.addActionListener(this);

	}

	public void initPanels() {

		/*------------------ setting tombol pindah -----------------------*/
		westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(3, 1, 1, 5));
		westPanel.setBorder(new EmptyBorder(35, 10, 200, 100));
		westPanel.setOpaque(false);
		westPanel.add(BT_home);
		westPanel.add(BT_cat);
		westPanel.add(BT_dog);

		/*------------------ setting kotakan kucing -----------------------*/
		felinPanel = new JPanel();

		f1 = new JPanel();
		f1.setLayout(new GridLayout(2, 1, 1, 1));
		f1.setBorder(new EmptyBorder(2, 0, 0, 0));
		f1.setOpaque(false);
		f1.add(img_cat);
		f1.add(BT_soundcat);

		f2 = new JPanel();
		f2.setLayout(new GridLayout(2, 1, 1, 1));
		f2.setOpaque(false);
		f2.add(img_lion);
		f2.add(BT_soundlion);

		f3 = new JPanel();
		f3.setOpaque(false);
		f3.setLayout(new GridLayout(2, 1, 1, 1));
		f3.add(img_tiger);
		f3.add(BT_soundtiger);

		buttonfPanel = new JPanel();
		buttonfPanel.setOpaque(false);
		buttonfPanel.add(BT_catprev);
		buttonfPanel.add(BT_catnext);

		felinLayout = new CardLayout();
		felinPanel.setLayout(felinLayout);
		felinPanel.setOpaque(false);
		felinPanel.add(f1);
		felinPanel.add(f2);
		felinPanel.add(f3);

		/*--------------------------- setting kotakan anjing -----------------------*/
		caninPanel = new JPanel();

		c1 = new JPanel();
		c1.setLayout(new GridLayout(2, 1, 1, 1));
		c1.setBorder(new EmptyBorder(10, 0, 0, 0));
		c1.setOpaque(false);
		c1.add(img_dog);
		c1.add(BT_sounddog);

		c2 = new JPanel();
		c2.setLayout(new GridLayout(2, 1, 1, 1));
		c2.setOpaque(false);
		c2.add(img_wolf);
		c2.add(BT_soundwolf);

		buttoncPanel = new JPanel();
		buttoncPanel.setOpaque(false);
		buttoncPanel.add(BT_dogprev);
		buttoncPanel.add(BT_dognext);

		caninLayout = new CardLayout();
		caninPanel.setLayout(caninLayout);
		caninPanel.setOpaque(false);
		caninPanel.add(c1);
		caninPanel.add(c2);

	}

	public Belakang(int testFrame) {
		if (testFrame == 1) {
			this.setSize(490, 380);
			this.setTitle("AMSON");
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setAlwaysOnTop(true);
			this.setResizable(false);
			initLabels();
			initButtons();
			initPanels();
			this.getContentPane().setLayout(new BorderLayout());
			this.getContentPane().add(westPanel, BorderLayout.WEST);
			this.getContentPane().add(buttonfPanel, BorderLayout.PAGE_END);
			this.getContentPane().add(felinPanel, BorderLayout.CENTER);
			this.setVisible(true);
			setLayout(new BorderLayout());
			this.add(background);
			background.setLayout(new FlowLayout());

		} else if (testFrame == 2) {
			this.setSize(490, 380);
			this.setTitle("AMSON");
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setAlwaysOnTop(true);
			this.setResizable(false);
			initLabels();
			initButtons();
			initPanels();
			this.getContentPane().setLayout(new BorderLayout());
			this.getContentPane().add(westPanel, BorderLayout.WEST);
			this.getContentPane().add(buttoncPanel, BorderLayout.PAGE_END);
			this.getContentPane().add(caninPanel, BorderLayout.CENTER);
			this.setVisible(true);
			setLayout(new BorderLayout());
			this.add(background);
			background.setLayout(new FlowLayout());
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/*----------------------------button pindah jenis hewan ----------------------------*/
		if (e.getSource() == BT_dognext) {
			caninLayout.next(caninPanel);
		}
		if (e.getSource() == BT_dogprev) {
			caninLayout.previous(caninPanel);
		}

		if (e.getSource() == BT_catnext) {
			felinLayout.next(felinPanel);
		}
		if (e.getSource() == BT_catprev) {
			felinLayout.previous(felinPanel);
		}

		/*----------------------------suara----------------------------*/
		if (e.getSource() == BT_soundcat) {
			this.playSound("sounds\\cat.wav");
		}

		if (e.getSource() == BT_soundlion) {
			this.playSound("sounds\\lion.wav");
		}
		if (e.getSource() == BT_soundwolf) {
			this.playSound("sounds\\wolf.wav");
		}
		if (e.getSource() == BT_sounddog) {
			this.playSound("sounds\\dog.wav");
		}
		if (e.getSource() == BT_soundtiger) {
			this.playSound("sounds\\tiger.wav");
		}

		/*---------------------------- mengubah container/halaman ----------------------------*/

		if (e.getSource() == BT_dog) {
			Belakang caninframe = new Belakang(2);
			caninframe.setVisible(true);
			dispose();
		}

		if (e.getSource() == BT_cat) {
			Belakang felinframe = new Belakang(1);
			felinframe.setVisible(true);
			dispose();
		}

		/*--------------------------------- perintah kembali/keluar ------------------------------------*/
		if (e.getSource() == BT_home) {
			dispose();
		}

	}

}