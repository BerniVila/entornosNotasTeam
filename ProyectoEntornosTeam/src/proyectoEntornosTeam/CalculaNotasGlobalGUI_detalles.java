package proyectoEntornosTeam;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

public class CalculaNotasGlobalGUI_detalles {

	private JFrame frmCalculanotas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculaNotasGlobalGUI_detalles window = new CalculaNotasGlobalGUI_detalles();
					window.frmCalculanotas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws notaInvalidoExamenTestExcepcion
	 * @throws notaInvalidoExamenClasicoExcepcion
	 */
	public CalculaNotasGlobalGUI_detalles() throws notaInvalidoExamenClasicoExcepcion, notaInvalidoExamenTestExcepcion {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
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
		frmCalculanotas.setBounds(100, 100, 600, 540);
		frmCalculanotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {150, 150, 150, 150};
		gridBagLayout.rowHeights = new int[] { 170, 50, 60, 120, 120 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		frmCalculanotas.getContentPane().setLayout(gridBagLayout);

		JLabel lbl_HeaderPic = new JLabel("");
		lbl_HeaderPic.setToolTipText("Web del I.E.S Juan de Garay");
		lbl_HeaderPic.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_HeaderPic.setIconTextGap(0);
		lbl_HeaderPic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_HeaderPic.setBackground(Color.LIGHT_GRAY);
		lbl_HeaderPic.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl_HeaderPic.setIcon(
				new ImageIcon(CalculaNotasGlobalGUI_detalles.class.getResource("/images/juandegarayLogo.jpg")));
		GridBagConstraints gbc_lbl_HeaderPic = new GridBagConstraints();
		gbc_lbl_HeaderPic.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl_HeaderPic.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_HeaderPic.gridwidth = 5;
		gbc_lbl_HeaderPic.gridx = 0;
		gbc_lbl_HeaderPic.gridy = 0;
		frmCalculanotas.getContentPane().add(lbl_HeaderPic, gbc_lbl_HeaderPic);

		JLabel lblNewLabel_1 = new JLabel("Selecciona tu NIA y pulsa Buscar");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		frmCalculanotas.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBorder(new TitledBorder(null, "NIA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		comboBox.setMaximumRowCount(10);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setName("NIA");
		// auto filling comboBox
		for (Alumno alumno : daw.listaAlumnos) {
			comboBox.addItem(alumno.getNia());
		}
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		frmCalculanotas.getContentPane().add(comboBox, gbc_comboBox);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAreaNotas.setMargin(new Insets(0, 5, 5, 0));
		txtAreaNotas.setOpaque(false);
		GridBagConstraints gbc_txtAreaNotas = new GridBagConstraints();
		gbc_txtAreaNotas.ipadx = 5;
		gbc_txtAreaNotas.gridheight = 3;
		gbc_txtAreaNotas.anchor = GridBagConstraints.WEST;
		gbc_txtAreaNotas.fill = GridBagConstraints.BOTH;
		gbc_txtAreaNotas.gridwidth = 5;
		gbc_txtAreaNotas.gridx = 0;
		gbc_txtAreaNotas.gridy = 3;
		frmCalculanotas.getContentPane().add(txtAreaNotas, gbc_txtAreaNotas);

//		btnBuscar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (txtNia.getText().isEmpty() ||Integer.valueOf(txtNia.getText()) < 1 || Integer.valueOf(txtNia.getText()) > daw.getListaAlumnos().size()) {
//					txtAreaNotas.setText("Ese NIA no existe en nuestra base de datos, prueba otra vez con un valor del 1 al 10");
//					txtAreaNotas.setForeground(Color.RED);
//
//				} else {
//					for (Alumno alumno : daw.getListaAlumnos()) {
//						if (alumno.getNia().compareTo(txtNia.getText().toString()) == 0) {
//							try {
//								txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal());
//								
//								btnDetalles.addActionListener(new ActionListener() {
//									public void actionPerformed(ActionEvent e) {
//										try {
//											txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal() + "\n\n" + alumno.toString());
//										} catch (SinPorcentajeExcepcion e1) {
//											// TODO Auto-generated catch block
//											e1.printStackTrace();
//										}
//										
//									}
//								});
//							} catch (SinPorcentajeExcepcion e1) {
//								// TODO Auto-generated catch block
//								e1.printStackTrace();
//							}
//							txtAreaNotas.setForeground(Color.BLACK);
//						}
//					}
//
//				}
//			}
//		});

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Alumno alumno = daw.getListaAlumnos().get(Integer.valueOf(comboBox.getSelectedIndex()));

					txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 40));
					txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal());
					btnDetalles.setVisible(true);

				} catch (SinPorcentajeExcepcion e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		btnDetalles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Alumno alumno = daw.getListaAlumnos().get(Integer.valueOf(comboBox.getSelectedIndex()));
					txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 14));
					txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal() + "\n\n" + alumno.toString());
					// btnDetalles.setText("Ocultar detalles");

				} catch (SinPorcentajeExcepcion e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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