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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.Component;

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
		
		listaAlumnos.add(new Alumno("1", 10, 10, 10, new ExamenTest(30, 0, 0), new ExamenTest(30, 0, 0), new TrabajoClase( 0), new TrabajoClase( 0), new TrabajoClase( 0)));
		listaAlumnos.add(new Alumno("2", 5.5, 4, 6.2, new ExamenTest(15, 10, 5), new ExamenTest(20, 3, 7), new TrabajoClase( 1), new TrabajoClase( 0), new TrabajoClase( 2)));
		listaAlumnos.add(new Alumno("3", 7.6, 8, 8.5, new ExamenTest(25, 4, 1), new ExamenTest(26, 4, 0), new TrabajoClase( 0), new TrabajoClase( 1), new TrabajoClase( 0)));
		listaAlumnos.add(new Alumno("4", 4.5, 5, 5.6, new ExamenTest(17, 3, 10), new ExamenTest(12, 8, 10), new TrabajoClase( 4), new TrabajoClase( 1), new TrabajoClase( 3)));
		listaAlumnos.add(new Alumno("5", 9, 8.75, 9.25, new ExamenTest(27, 1, 2), new ExamenTest(29, 1, 0), new TrabajoClase( 0), new TrabajoClase( 0), new TrabajoClase( 0)));
		listaAlumnos.add(new Alumno("6", 6, 5.5, 5, new ExamenTest(20, 10, 0), new ExamenTest(19, 8, 3), new TrabajoClase( 2), new TrabajoClase( 1), new TrabajoClase( 7)));
		listaAlumnos.add(new Alumno("7", 8, 7.5, 8.5, new ExamenTest(28, 0, 2), new ExamenTest(26, 2, 2), new TrabajoClase( 0), new TrabajoClase( 0), new TrabajoClase( 1)));
		listaAlumnos.add(new Alumno("8", 7.8, 7, 8.9, new ExamenTest(25, 1, 4), new ExamenTest(27, 3, 0), new TrabajoClase( 1), new TrabajoClase( 1), new TrabajoClase( 0)));
		listaAlumnos.add(new Alumno("9", 2.5, 4, 5.5, new ExamenTest(10, 15, 5), new ExamenTest(20, 8, 2), new TrabajoClase( 4), new TrabajoClase( 2), new TrabajoClase( 3)));
		listaAlumnos.add(new Alumno("10", 9.5, 10, 8.9, new ExamenTest(28, 2, 0), new ExamenTest(30, 0, 0), new TrabajoClase( 0), new TrabajoClase( 0), new TrabajoClase( 0)));
		
		frmCalculanotas = new JFrame();
		frmCalculanotas.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmCalculanotas.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmCalculanotas.setTitle("Bienvenido/a al calculador de notas del Juan de Garay");
		frmCalculanotas.setBounds(100, 100, 600, 530);
		frmCalculanotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {160, 160, 160, 160};
		gridBagLayout.rowHeights = new int[] {170, 20, 60, 120, 120};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		frmCalculanotas.getContentPane().setLayout(gridBagLayout);
		
		JLabel lbl_HeaderPic = new JLabel("");
		lbl_HeaderPic.setIconTextGap(0);
		lbl_HeaderPic.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lbl_HeaderPic.setBackground(Color.LIGHT_GRAY);
		lbl_HeaderPic.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl_HeaderPic.setIcon(new ImageIcon(CalculaNotasGlobalGUI.class.getResource("/images/juandegarayLogo.jpg")));
		GridBagConstraints gbc_lbl_HeaderPic = new GridBagConstraints();
		gbc_lbl_HeaderPic.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_HeaderPic.gridwidth = 4;
		gbc_lbl_HeaderPic.gridx = 0;
		gbc_lbl_HeaderPic.gridy = 0;
		frmCalculanotas.getContentPane().add(lbl_HeaderPic, gbc_lbl_HeaderPic);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce tu NIA y pulsa Buscar por favor");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		frmCalculanotas.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtNia = new JTextField();
		txtNia.setBackground(Color.LIGHT_GRAY);
		txtNia.setName("nia");
		txtNia.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 20));
		txtNia.setOpaque(true);
		txtNia.setBorder(new TitledBorder(null, "NIA", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, null));
		txtNia.setForeground(Color.BLACK);
		GridBagConstraints gbc_txtNia = new GridBagConstraints();
		gbc_txtNia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNia.insets = new Insets(0, 0, 5, 5);
		gbc_txtNia.gridx = 1;
		gbc_txtNia.gridy = 2;
		frmCalculanotas.getContentPane().add(txtNia, gbc_txtNia);
		txtNia.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setOpaque(true);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBackground(new Color(102, 153, 102));
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.fill = GridBagConstraints.BOTH;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 2;
		gbc_btnBuscar.gridy = 2;
		frmCalculanotas.getContentPane().add(btnBuscar, gbc_btnBuscar);
		
		
		
		JEditorPane txtAreaNotas = new JEditorPane();
		txtAreaNotas.setMargin(new Insets(0, 5, 5, 0));
		txtAreaNotas.setOpaque(false);
		GridBagConstraints gbc_txtAreaNotas = new GridBagConstraints();
		gbc_txtAreaNotas.ipadx = 5;
		gbc_txtAreaNotas.gridheight = 3;
		gbc_txtAreaNotas.anchor = GridBagConstraints.WEST;
		gbc_txtAreaNotas.fill = GridBagConstraints.BOTH;
		gbc_txtAreaNotas.gridwidth = 6;
		gbc_txtAreaNotas.gridx = 0;
		gbc_txtAreaNotas.gridy = 3;
		frmCalculanotas.getContentPane().add(txtAreaNotas, gbc_txtAreaNotas);
		
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (Alumno alumno: listaAlumnos) {
					if (alumno.getNia().compareTo(txtNia.getText()) == 0) {
						txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal() + "\n\n" + alumno.toString());
					}else {
						txtAreaNotas.setText("Ese NIA no existe en nuestra base de datos, prueba otra vez con un valor del 1 al 10");
						txtAreaNotas.setForeground(Color.RED);
					}
				}
			}
		});
	}
}
