package equipo6.juego9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class App extends JFrame {

	private JPanel contentPane;
	private int contador;
	private int[] orden = mezclar();
	//coordenadas
	private int[][] cr = coordenadas();
	private String rojo = "/equipo6/juego9/imagenes/rojo.png";
	private JButton button1;
	private JButton button2;
	//auxiliar para comprar el string de imagen de 2 botones
	private String comparar;
	//cuando llega a 8 se gano el juego
	private int count;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		comparar = "";
		count = 0;
		mezclar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("");
		b1.setBounds(cr[orden[0]][0],cr[orden[0]][1], cr[orden[0]][2],cr[orden[0]][3]);
		contentPane.add(b1);
		
		JButton b2 = new JButton("");
		b2.setBounds(cr[orden[1]][0],cr[orden[1]][1], cr[orden[1]][2],cr[orden[1]][3]);
		contentPane.add(b2);
		
		JButton b3 = new JButton("");
		b3.setBounds(cr[orden[2]][0],cr[orden[2]][1], cr[orden[2]][2],cr[orden[2]][3]);
		contentPane.add(b3);
		
		JButton b4 = new JButton("");
		b4.setBounds(cr[orden[3]][0],cr[orden[3]][1], cr[orden[3]][2],cr[orden[3]][3]);
		contentPane.add(b4);
		
		JButton b5 = new JButton("");
		b5.setBounds(cr[orden[4]][0],cr[orden[4]][1], cr[orden[4]][2],cr[orden[4]][3]);
		contentPane.add(b5);
		
		JButton b6 = new JButton("");
		b6.setBounds(cr[orden[5]][0],cr[orden[5]][1], cr[orden[5]][2],cr[orden[5]][3]);
		contentPane.add(b6);
		
		JButton b7 = new JButton("");
		b7.setBounds(cr[orden[6]][0],cr[orden[6]][1], cr[orden[6]][2],cr[orden[6]][3]);
		contentPane.add(b7);
		
		JButton b8 = new JButton("");
		b8.setBounds(cr[orden[7]][0],cr[orden[7]][1], cr[orden[7]][2],cr[orden[7]][3]);
		contentPane.add(b8);
		
		JButton b9 = new JButton("");
		b9.setBounds(cr[orden[8]][0],cr[orden[8]][1], cr[orden[8]][2],cr[orden[8]][3]);
		contentPane.add(b9);
		
		JButton b10 = new JButton("");
		b10.setBounds(cr[orden[9]][0],cr[orden[9]][1], cr[orden[9]][2],cr[orden[9]][3]);
		contentPane.add(b10);
		
		JButton b11 = new JButton("");
		b11.setBounds(cr[orden[10]][0],cr[orden[10]][1], cr[orden[10]][2],cr[orden[10]][3]);
		contentPane.add(b11);
		
		JButton b12 = new JButton("");
		b12.setBounds(cr[orden[11]][0],cr[orden[11]][1], cr[orden[11]][2],cr[orden[11]][3]);
		contentPane.add(b12);
		
		JButton b13 = new JButton("");
		b13.setBounds(cr[orden[12]][0],cr[orden[12]][1], cr[orden[12]][2],cr[orden[12]][3]);
		contentPane.add(b13);
		
		JButton b14 = new JButton("");
		b14.setBounds(cr[orden[13]][0],cr[orden[13]][1], cr[orden[13]][2],cr[orden[13]][3]);
		contentPane.add(b14);
		
		JButton b15 = new JButton("");
		b15.setBounds(cr[orden[14]][0],cr[orden[14]][1], cr[orden[14]][2],cr[orden[14]][3]);
		contentPane.add(b15);
		
		JButton b16 = new JButton("");
		b16.setBounds(cr[orden[15]][0],cr[orden[15]][1], cr[orden[15]][2],cr[orden[15]][3]);
		contentPane.add(b16);
		//colocamos el color base a las cartas
		b1.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b2.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b3.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b4.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b5.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b6.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b7.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b8.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b9.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b10.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b11.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b12.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b13.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b14.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b15.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		b16.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		//botones todos son iguales solo cambian los datos propios
		b1.addActionListener(new ActionListener() {
			//agregamos el evento al boton
			public void actionPerformed(ActionEvent e) {
				b1.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/1.png")));
				//controlamos si el contador es menor a 2
				//si es 2 es porque no paso el anterior control y las cartas se dan vuetla
				if(contador == 2) {
					voltear(button1,button2);
				}
				//aumentamos el contador
				//si es uno asignamos el boton al atributo de la clase button1
				//guardamos el dato de la imagen en comparar
				contador++;
				if(contador ==1 ) {
					button1 = b1;
					comparar = "/equipo6/juego9/imagenes/1.png";
				}else if(contador == 2) {
					//si es dos asignamos el boton al atributo de la clase button2
					button2 = b1;
					String aux = "/equipo6/juego9/imagenes/1.png";
					//control para que evita que si se presiono 2 veces el mismo boton 
					//si no se presiono se compara para ver si las cartas son iguales
					if(button1.equals(b1)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
				}
		});//b1
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/1.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b2;
					comparar = "/equipo6/juego9/imagenes/1.png";
				}else if(contador == 2) {
					button2 = b2;
					String aux = "/equipo6/juego9/imagenes/1.png";
					if(button1.equals(b2)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b2
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/2.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b3;
					comparar = "/equipo6/juego9/imagenes/2.png";
				}else if(contador == 2) {
					button2 = b3;
					String aux = "/equipo6/juego9/imagenes/2.png";
					if(button1.equals(b3)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b3
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/2.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b4;
					comparar = "/equipo6/juego9/imagenes/2.png";
				}else if(contador == 2) {
					button2 = b4;
					String aux = "/equipo6/juego9/imagenes/2.png";
					if(button1.equals(b4)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b4
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/3.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b5;
					comparar = "/equipo6/juego9/imagenes/3.png";
				}else if(contador == 2) {
					button2 = b5;
					String aux = "/equipo6/juego9/imagenes/3.png";
					if(button1.equals(b5)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b5
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/3.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b6;
					comparar = "/equipo6/juego9/imagenes/3.png";
				}else if(contador == 2) {
					button2 = b6;
					String aux = "/equipo6/juego9/imagenes/3.png";
					if(button1.equals(b6)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b6
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/4.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b7;
					comparar = "/equipo6/juego9/imagenes/4.png";
				}else if(contador == 2) {
					button2 = b7;
					String aux = "/equipo6/juego9/imagenes/4.png";
					if(button1.equals(b7)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b7
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/4.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b8;
					comparar = "/equipo6/juego9/imagenes/4.png";
				}else if(contador == 2) {
					button2 = b8;
					String aux = "/equipo6/juego9/imagenes/4.png";
					if(button1.equals(b8)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b8
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/5.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b9;
					comparar = "/equipo6/juego9/imagenes/5.png";
				}else if(contador == 2) {
					button2 = b9;
					String aux = "/equipo6/juego9/imagenes/5.png";
					if(button1.equals(b9)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b9
		
		
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b10.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/5.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b10;
					comparar = "/equipo6/juego9/imagenes/5.png";
				}else if(contador == 2) {
					button2 = b10;
					String aux = "/equipo6/juego9/imagenes/5.png";
					if(button1.equals(b10)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b10
		
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b11.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/6.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b11;
					comparar = "/equipo6/juego9/imagenes/6.png";
				}else if(contador == 2) {
					button2 = b11;
					String aux = "/equipo6/juego9/imagenes/6.png";
					if(button1.equals(b11)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b11
		
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b12.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/6.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b12;
					comparar = "/equipo6/juego9/imagenes/6.png";
				}else if(contador == 2) {
					button2 = b12;
					String aux = "/equipo6/juego9/imagenes/6.png";
					if(button1.equals(b12)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b12
		
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b13.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/7.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b13;
					comparar = "/equipo6/juego9/imagenes/7.png";
				}else if(contador == 2) {
					button2 = b13;
					String aux = "/equipo6/juego9/imagenes/7.png";
					if(button1.equals(b13)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b13
		
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b14.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/7.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b14;
					comparar = "/equipo6/juego9/imagenes/7.png";
				}else if(contador == 2) {
					button2 = b14;
					String aux = "/equipo6/juego9/imagenes/7.png";
					if(button1.equals(b14)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b14
		
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b15.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/8.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b15;
					comparar = "/equipo6/juego9/imagenes/8.png";
				}else if(contador == 2) {
					button2 = b15;
					String aux = "/equipo6/juego9/imagenes/8.png";
					if(button1.equals(b15)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b15
		
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b16.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/8.png")));
				if(contador == 2) {
					voltear(button1,button2);
				}
				contador++;
				if(contador ==1 ) {
					button1 = b16;
					comparar = "/equipo6/juego9/imagenes/8.png";
				}else if(contador == 2) {
					button2 = b16;
					String aux = "/equipo6/juego9/imagenes/8.png";
					if(button1.equals(b16)) {contador = 1;}
					else {comparar(button1,button2,aux);}
				}
			}
		});//b16
		
	}
	
	//guardamos las posiciones de las cartas
	public int[][] coordenadas() {
		int[][] a = {{10, 10, 100, 100},{136, 10, 100, 100},{271, 10, 100, 100},{400, 10, 100, 100},
				{10, 144, 100, 100},{136, 144, 100, 100},{271, 144, 100, 100},{400, 144, 100, 100},
				{10, 256, 100, 100},{136, 256, 100, 100},{271, 256, 100, 100},{400, 254, 100, 100},
				{10, 375, 100, 100},{136, 375, 100, 100},{271, 375, 100, 100},{400, 375, 100, 100}
		};
		return a;
	}
	// mezclamos el orden de las cartas
	public int[] mezclar() {

		ArrayList<Integer> orden1 = new ArrayList<>();
		for (int i = 0; i < 16; i++) {
			orden1.add(i);
		}
		Collections.shuffle(orden1);
		int[] od = new int[16];
		int i=0;
		for (Integer o : orden1) {
			od[i] = o;
			i++;
		}
		return od;
			
	}
	
	//volvea las dos cartas si no eran compatibles cuando el contador va en 2
	// y reinicia el mismo
	public void voltear(JButton button1,JButton button2) {
		button1.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		button2.setIcon(new ImageIcon(App.class.getResource("/equipo6/juego9/imagenes/rojo.png")));
		contador =0;
	}
	
	//compara si la imagen del 2 boton presionado (aux) es igual al anterior (comparar)
	//si son iguales desactiva los dos botones
	//si el count llega a 8 salta el cartel de que ganaste
	public void comparar(JButton button1,JButton button2,String aux) {
		if(aux.equals(comparar)) {
			count++;
			button1.setEnabled(false);
			button2.setEnabled(false);
			if(count == 8) {
				JOptionPane.showMessageDialog(null, "Ganaste");
			}
		}
	}
	
}
