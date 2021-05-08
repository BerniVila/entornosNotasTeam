package proyectoEntornosTeam;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculaNotasGlobalGUI {

	private JFrame frmCalculanotas;
	private JTextField txtNia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculaNotasGlobalGUI window = new CalculaNotasGlobalGUI();
					window.frmCalculanotas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculaNotasGlobalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Datos de los alumnos
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno("1", 10, 10, 10, new ExamenTest(30, 0, 0), new ExamenTest(30, 0, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 0)));
		listaAlumnos.add(new Alumno("2", 5.5, 4, 6.2, new ExamenTest(15, 10, 5), new ExamenTest(20, 3, 7), new TrabajoClase(true, 1), new TrabajoClase(true, 0), new TrabajoClase(true, 2)));
		listaAlumnos.add(new Alumno("3", 7.6, 8, 8.5, new ExamenTest(25, 4, 1), new ExamenTest(26, 4, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 1), new TrabajoClase(true, 0)));
		listaAlumnos.add(new Alumno("4", 4.5, 5, 5.6, new ExamenTest(17, 3, 10), new ExamenTest(12, 8, 10), new TrabajoClase(true, 4), new TrabajoClase(true, 1), new TrabajoClase(true, 3)));
		listaAlumnos.add(new Alumno("5", 9, 8.75, 9.25, new ExamenTest(27, 1, 2), new ExamenTest(29, 1, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 0)));
		listaAlumnos.add(new Alumno("6", 6, 5.5, 5, new ExamenTest(20, 10, 0), new ExamenTest(19, 8, 3), new TrabajoClase(true, 2), new TrabajoClase(true, 1), new TrabajoClase(true, 7)));
		listaAlumnos.add(new Alumno("7", 8, 7.5, 8.5, new ExamenTest(28, 0, 2), new ExamenTest(26, 2, 2), new TrabajoClase(true, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 1)));
		listaAlumnos.add(new Alumno("8", 7.8, 7, 8.9, new ExamenTest(25, 1, 4), new ExamenTest(27, 3, 0), new TrabajoClase(true, 1), new TrabajoClase(true, 1), new TrabajoClase(true, 0)));
		listaAlumnos.add(new Alumno("9", 2.5, 4, 5.5, new ExamenTest(10, 15, 5), new ExamenTest(20, 8, 2), new TrabajoClase(true, 4), new TrabajoClase(true, 2), new TrabajoClase(true, 3)));
		listaAlumnos.add(new Alumno("10", 9.5, 10, 8.9, new ExamenTest(28, 2, 0), new ExamenTest(30, 0, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 0)));
		
		frmCalculanotas = new JFrame();
		frmCalculanotas.setTitle("CalculaNotas");
		frmCalculanotas.setBounds(100, 100, 578, 342);
		frmCalculanotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculanotas.getContentPane().setLayout(null);
		
		txtNia = new JTextField();
		txtNia.setForeground(Color.GRAY);
		txtNia.setText("NIA");
		txtNia.setBounds(10, 53, 86, 20);
		frmCalculanotas.getContentPane().add(txtNia);
		txtNia.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(106, 52, 89, 23);
		frmCalculanotas.getContentPane().add(btnBuscar);
		
		JEditorPane txtAreaNotas = new JEditorPane();
		txtAreaNotas.setBounds(10, 84, 542, 208);
		frmCalculanotas.getContentPane().add(txtAreaNotas);
		
		JLabel lblNewLabel = new JLabel("Bienvenido/a al calculador de notas del Juan de Garay");
		lblNewLabel.setBounds(10, 11, 279, 20);
		frmCalculanotas.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce tu NIA y pulsa Buscar por favor");
		lblNewLabel_1.setBounds(10, 31, 279, 14);
		frmCalculanotas.getContentPane().add(lblNewLabel_1);
		
		
		
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (Alumno alumno: listaAlumnos) {
					if (alumno.getNia().compareTo(txtNia.getText()) == 0) {
						txtAreaNotas.setText("Nota Global:" + alumno.calcNotaGlobal() + "\n\n" + alumno.toString());
					}
				}
			}
		});
	}
}
