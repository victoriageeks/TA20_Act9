package equipo6.juego9;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App9 extends JFrame {

	private JPanel contentPane;
	private int contador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App9 frame = new App9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		//Boton columna 1 fila 1
		JToggleButton btn_c1_f1 = new JToggleButton("");
		btn_c1_f1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c1_f1.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/lupa.png")));
			}
			
		});
		btn_c1_f1.setBounds(10, 11, 88, 89);
		contentPane.add(btn_c1_f1);
		
		
		//Boton columna 2 fila 1
		JToggleButton btn_c2_f1 = new JToggleButton("");
		btn_c2_f1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c2_f1.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/charla.png")));
			}
			
		});
		btn_c2_f1.setBounds(118, 11, 88, 89);
		contentPane.add(btn_c2_f1);
		
		
		//Boton columna 3 fila 1
		JToggleButton btn_c3_f1 = new JToggleButton("");
		btn_c3_f1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c3_f1.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/discos-compactos.png")));
			}
			
		});
		btn_c3_f1.setBounds(227, 11, 88, 89);
		contentPane.add(btn_c3_f1);
		
		
		//Boton columna 4 fila 1
		JToggleButton btn_c4_f1 = new JToggleButton("");
		btn_c4_f1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c4_f1.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/disquete.png")));
			}
			
		});
		
		btn_c4_f1.setBounds(336, 11, 88, 89);
		contentPane.add(btn_c4_f1);
		
		//Boton columna 1 fila 2
		JToggleButton btn_c1_f2 = new JToggleButton("");
		btn_c1_f2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c1_f2.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/imagen.png")));
			}
			
		});
		
		
		btn_c1_f2.setBounds(10, 112, 88, 89);
		contentPane.add(btn_c1_f2);
		
		//Boton columna 2 fila 2
		JToggleButton btn_c2_f2 = new JToggleButton("");
		
		btn_c2_f2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c2_f2.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/raton-de-computadora.png")));
			}
			
		});
		
		btn_c2_f2.setBounds(118, 111, 88, 89);
		contentPane.add(btn_c2_f2);
		
		
		//Boton columna 3 fila 2
		JToggleButton btn_c3_f2 = new JToggleButton("");
		
		btn_c3_f2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c3_f2.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/telefono-inteligente.png")));
			}
			
		});
		
		
		btn_c3_f2.setBounds(227, 111, 88, 89);
		contentPane.add(btn_c3_f2);
		
		
		//Boton columna 4 fila 2
		JToggleButton btn_c4_f2 = new JToggleButton("");
		
		btn_c4_f2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c4_f2.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/upc.png")));
			}
			
		});
		
		btn_c4_f2.setBounds(336, 112, 88, 89);
		contentPane.add(btn_c4_f2);
		
		
		//Boton columna 1 fila 3
		JToggleButton btn_c1_f3 = new JToggleButton("");
		
		btn_c1_f3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c1_f3.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/telefono-inteligente.png")));
			}
			
		});
		
		
		btn_c1_f3.setBounds(10, 213, 88, 89);
		contentPane.add(btn_c1_f3);
		
		
		//Boton columna 2 fila 3
		JToggleButton btn_c2_f3 = new JToggleButton("");
		
		btn_c2_f3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c2_f3.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/charla.png")));
			}
			
		});
		
		
		btn_c2_f3.setBounds(118, 213, 88, 89);
		contentPane.add(btn_c2_f3);
		
		
		//Boton columna 3 fila 3
		JToggleButton btn_c3_f3 = new JToggleButton("");
		
		btn_c3_f3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c3_f3.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/disquete.png")));
			}
			
		});

		btn_c3_f3.setBounds(227, 213, 88, 89);
		contentPane.add(btn_c3_f3);
		
		
		//Boton columna 4 fila 3
		JToggleButton btn_c4_f3 = new JToggleButton("");
		
		btn_c4_f3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c4_f3.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/imagen.png")));
			}
			
		});
		

		btn_c4_f3.setBounds(336, 212, 88, 89);
		contentPane.add(btn_c4_f3);
		
		
		//Boton columna 1 fila 4
		JToggleButton btn_c1_f4 = new JToggleButton("");
		btn_c1_f4.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/raton-de-computadora.png")));
		
		btn_c4_f3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btn_c4_f3.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/imagen.png")));
			}
			
		});
		
		btn_c1_f4.setBounds(10, 313, 88, 89);
		contentPane.add(btn_c1_f4);
		
		
		//Boton columna 2 fila 4
		JToggleButton btn_c2_f4 = new JToggleButton("");
		btn_c2_f4.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/lupa.png")));
		btn_c2_f4.setBounds(118, 313, 88, 89);
		contentPane.add(btn_c2_f4);
		
		
		//Boton columna 3 fila 4
		JToggleButton btn_c3_f4 = new JToggleButton("");
		btn_c3_f4.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/upc.png")));
		btn_c3_f4.setBounds(227, 313, 88, 89);
		contentPane.add(btn_c3_f4);
		
		
		//Boton columna 4 fila 4
		JToggleButton btn_c4_f4 = new JToggleButton("");
		btn_c4_f4.setIcon(new ImageIcon(App9.class.getResource("/equipo6/juego9/imagenes/discos-compactos.png")));
		btn_c4_f4.setBounds(336, 313, 88, 89);
		contentPane.add(btn_c4_f4);
		
		
		
		
	}
}
