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
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Desktop;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.event.KeyEvent;

public class CalculaNotasGlobalGUI {

	private JFrame frmCalculanotas;

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
	 * @throws notaInvalidoExamenTestExcepcion 
	 * @throws notaInvalidoExamenClasicoExcepcion 
	 */
	public CalculaNotasGlobalGUI() throws notaInvalidoExamenClasicoExcepcion, notaInvalidoExamenTestExcepcion {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws notaInvalidoExamenTestExcepcion 
	 * @throws notaInvalidoExamenClasicoExcepcion 
	 */
	private void initialize() throws notaInvalidoExamenClasicoExcepcion, notaInvalidoExamenTestExcepcion {
		// Datos de los alumnos
		Grupo daw = new Grupo();
		daw.getListaAlumnos()
				.add(new Alumno("1", new ExamenClasico(0.1, 10), new ExamenClasico(0.2, 10), new ExamenClasico(0.2, 10),
						new ExamenTest(0.25, 30, 0), new ExamenTest(0.25, 30, 0), new TrabajoClase(0),
						new TrabajoClase(0), new TrabajoClase(0)));
		daw.getListaAlumnos()
				.add(new Alumno("2", new ExamenClasico(0.1, 5.5), new ExamenClasico(0.2, 4),
						new ExamenClasico(0.2, 6.2), new ExamenTest(0.25, 15, 10), new ExamenTest(0.25, 20, 3),
						new TrabajoClase(1), new TrabajoClase(0), new TrabajoClase(2)));
		daw.getListaAlumnos()
				.add(new Alumno("3", new ExamenClasico(0.1, 7.6), new ExamenClasico(0.2, 8),
						new ExamenClasico(0.2, 8.5), new ExamenTest(0.25, 25, 4), new ExamenTest(0.25, 26, 4),
						new TrabajoClase(0), new TrabajoClase(1), new TrabajoClase(0)));
		daw.getListaAlumnos()
				.add(new Alumno("4", new ExamenClasico(0.1, 4.5), new ExamenClasico(0.2, 5),
						new ExamenClasico(0.2, 5.6), new ExamenTest(0.25, 17, 3), new ExamenTest(0.25, 12, 8),
						new TrabajoClase(4), new TrabajoClase(1), new TrabajoClase(3)));
		daw.getListaAlumnos()
				.add(new Alumno("5", new ExamenClasico(0.1, 9), new ExamenClasico(0.2, 8.75),
						new ExamenClasico(0.2, 9.25), new ExamenTest(0.25, 27, 1), new ExamenTest(0.25, 29, 1),
						new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)));
		daw.getListaAlumnos()
				.add(new Alumno("6", new ExamenClasico(0.1, 6), new ExamenClasico(0.2, 5.5), new ExamenClasico(0.2, 5),
						new ExamenTest(0.25, 20, 10), new ExamenTest(0.25, 19, 8), new TrabajoClase(2),
						new TrabajoClase(1), new TrabajoClase(7)));
		daw.getListaAlumnos()
				.add(new Alumno("7", new ExamenClasico(0.1, 8), new ExamenClasico(0.2, 7.5),
						new ExamenClasico(0.2, 8.5), new ExamenTest(0.25, 28, 0), new ExamenTest(0.25, 26, 2),
						new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(1)));
		daw.getListaAlumnos()
				.add(new Alumno("8", new ExamenClasico(0.1, 7.8), new ExamenClasico(0.2, 7),
						new ExamenClasico(0.2, 8.9), new ExamenTest(0.25, 25, 1), new ExamenTest(0.25, 27, 3),
						new TrabajoClase(1), new TrabajoClase(1), new TrabajoClase(0)));
		daw.getListaAlumnos()
				.add(new Alumno("9", new ExamenClasico(0.1, 2.5), new ExamenClasico(0.2, 4),
						new ExamenClasico(0.2, 5.5), new ExamenTest(0.25, 10, 15), new ExamenTest(0.25, 20, 8),
						new TrabajoClase(4), new TrabajoClase(2), new TrabajoClase(3)));
		daw.getListaAlumnos()
				.add(new Alumno("10", new ExamenClasico(0.1, 9.5), new ExamenClasico(0.2, 10),
						new ExamenClasico(0.2, 8.9), new ExamenTest(0.25, 28, 2), new ExamenTest(0.25, 30, 0),
						new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)));

		frmCalculanotas = new JFrame();
		frmCalculanotas.getContentPane().setBackground(Color.WHITE);
		frmCalculanotas.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmCalculanotas.setTitle("Bienvenido/a al calculador de notas del Juan de Garay");
		frmCalculanotas.setBounds(100, 100, 600, 510);
		frmCalculanotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 160, 160, 160, 160 };
		gridBagLayout.rowHeights = new int[] { 170, 20, 60, 120, 120 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		frmCalculanotas.getContentPane().setLayout(gridBagLayout);

		JLabel lbl_HeaderPic = new JLabel("");
		lbl_HeaderPic.setToolTipText("Web del I.E.S Juan de Garay");
		lbl_HeaderPic.setIconTextGap(0);
		lbl_HeaderPic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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

		JTextField txtNia = new JTextField();
		txtNia.setText("0");
		txtNia.setBackground(Color.WHITE);
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
		btnBuscar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnBuscar.setOpaque(true);
		btnBuscar.setBackground(new Color(102, 153, 102));
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.fill = GridBagConstraints.BOTH;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 2;
		gbc_btnBuscar.gridy = 2;
		frmCalculanotas.getContentPane().add(btnBuscar, gbc_btnBuscar);
		
		JButton btnDetalles = new JButton("Ver detalles");
		btnDetalles.setVisible(false);
		GridBagConstraints gbc_btnDetalles = new GridBagConstraints();
		gbc_btnDetalles.insets = new Insets(0, 0, 5, 5);
		gbc_btnDetalles.gridx = 3;
		gbc_btnDetalles.gridy = 2;
		frmCalculanotas.getContentPane().add(btnDetalles, gbc_btnDetalles);
		

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
		
		
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNia.getText().isEmpty() || !Character.isDigit(txtNia.getText().charAt(0)) ||Integer.valueOf(txtNia.getText()) < 1 || Integer.valueOf(txtNia.getText()) > daw.getListaAlumnos().size()) {
					txtAreaNotas.setText("Ese NIA no existe en nuestra base de datos, prueba otra vez con un valor del 1 al 10");
					txtAreaNotas.setForeground(Color.RED);

				} else {
					for (Alumno alumno : daw.getListaAlumnos()) {
						if (alumno.getNia().compareTo(txtNia.getText().toString()) == 0) {
							try {
								txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 40));
								txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal());
								btnDetalles.setVisible(true);
							} catch (SinPorcentajeExcepcion e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							txtAreaNotas.setForeground(Color.BLACK);
						}
					}

				}
			}
		});
		
		btnDetalles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Alumno alumno : daw.getListaAlumnos()) {
					if (alumno.getNia().compareTo(txtNia.getText().toString()) == 0) {
						try {
							txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 14));
							txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal() + "\n\n" + alumno.toString());
						} catch (SinPorcentajeExcepcion e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						txtAreaNotas.setForeground(Color.BLACK);
					}
				}

			}
		});
		
		lbl_HeaderPic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
			         
			        Desktop.getDesktop().browse(new URI("http://juandegaray.es"));
			         
			    } catch (IOException | URISyntaxException e1) {
			        e1.printStackTrace();
			    }
			}
		});
		
	}
}
