package proyectoEntornosTeam;

import java.awt.EventQueue;
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
import java.awt.Font;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JToggleButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;

public class PantallaInicioGUI {

	private JFrame frmCalculanotas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicioGUI window = new PantallaInicioGUI();
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
	 * @throws niaRepetidoExcepcion
	 */
	public PantallaInicioGUI()
			throws notaInvalidoExamenClasicoExcepcion, notaInvalidoExamenTestExcepcion, niaRepetidoExcepcion {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws notaInvalidoExamenTestExcepcion
	 * @throws notaInvalidoExamenClasicoExcepcion
	 * @throws niaRepetidoExcepcion
	 */
	private void initialize()
			throws notaInvalidoExamenClasicoExcepcion, notaInvalidoExamenTestExcepcion, niaRepetidoExcepcion {
		// Datos de los alumnos, aquí implementaríamos el acceso a una base de datos
		// desde la clase Grupo
		Grupo daw = new Grupo();
		daw.addAlumno(new Alumno("1", new ExamenClasico(0.1, 10), new ExamenClasico(0.2, 10),
				new ExamenClasico(0.2, 10), new ExamenTest(0.25, 30, 0), new ExamenTest(0.25, 30, 0),
				new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)));
		daw.addAlumno(new Alumno("2", new ExamenClasico(0.1, 5.5), new ExamenClasico(0.2, 4),
				new ExamenClasico(0.2, 6.2), new ExamenTest(0.25, 15, 10), new ExamenTest(0.25, 20, 3),
				new TrabajoClase(1), new TrabajoClase(0), new TrabajoClase(2)));
		daw.addAlumno(new Alumno("3", new ExamenClasico(0.1, 7.6), new ExamenClasico(0.2, 8),
				new ExamenClasico(0.2, 8.5), new ExamenTest(0.25, 25, 4), new ExamenTest(0.25, 26, 4),
				new TrabajoClase(0), new TrabajoClase(1), new TrabajoClase(0)));
		daw.addAlumno(new Alumno("4", new ExamenClasico(0.1, 4.5), new ExamenClasico(0.2, 5),
				new ExamenClasico(0.2, 5.6), new ExamenTest(0.25, 17, 3), new ExamenTest(0.25, 12, 8),
				new TrabajoClase(4), new TrabajoClase(1), new TrabajoClase(3)));
		daw.addAlumno(new Alumno("5", new ExamenClasico(0.1, 9), new ExamenClasico(0.2, 8.75),
				new ExamenClasico(0.2, 9.25), new ExamenTest(0.25, 27, 1), new ExamenTest(0.25, 29, 1),
				new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)));
		daw.addAlumno(new Alumno("6", new ExamenClasico(0.1, 6), new ExamenClasico(0.2, 5.5), new ExamenClasico(0.2, 5),
				new ExamenTest(0.25, 20, 10), new ExamenTest(0.25, 19, 8), new TrabajoClase(2), new TrabajoClase(1),
				new TrabajoClase(7)));
		daw.addAlumno(new Alumno("7", new ExamenClasico(0.1, 8), new ExamenClasico(0.2, 7.5),
				new ExamenClasico(0.2, 8.5), new ExamenTest(0.25, 28, 0), new ExamenTest(0.25, 26, 2),
				new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(1)));
		daw.addAlumno(new Alumno("8", new ExamenClasico(0.1, 7.8), new ExamenClasico(0.2, 7),
				new ExamenClasico(0.2, 8.9), new ExamenTest(0.25, 25, 1), new ExamenTest(0.25, 27, 3),
				new TrabajoClase(1), new TrabajoClase(1), new TrabajoClase(0)));
		daw.addAlumno(new Alumno("9", new ExamenClasico(0.1, 2.5), new ExamenClasico(0.2, 4),
				new ExamenClasico(0.2, 5.5), new ExamenTest(0.25, 10, 15), new ExamenTest(0.25, 20, 8),
				new TrabajoClase(4), new TrabajoClase(2), new TrabajoClase(3)));
		daw.addAlumno(new Alumno("10", new ExamenClasico(0.1, 9.5), new ExamenClasico(0.2, 10),
				new ExamenClasico(0.2, 8.9), new ExamenTest(0.25, 28, 2), new ExamenTest(0.25, 30, 0),
				new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)));

		frmCalculanotas = new JFrame();
		frmCalculanotas.getContentPane().setBackground(Color.WHITE);
		frmCalculanotas.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmCalculanotas.setTitle("Bienvenido/a al calculador de notas del Juan de Garay");
		frmCalculanotas.setBounds(100, 100, 620, 750);
		frmCalculanotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
		gridBagLayout.rowHeights = new int[] { 170, 30, 40, 100, 100, 30 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 1.0 };
		frmCalculanotas.getContentPane().setLayout(gridBagLayout);

		JLabel lbl_HeaderPic = new JLabel("");
		lbl_HeaderPic.setToolTipText("Web del I.E.S Juan de Garay");
		lbl_HeaderPic.setIconTextGap(0);
		lbl_HeaderPic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_HeaderPic.setBackground(Color.LIGHT_GRAY);
		lbl_HeaderPic.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl_HeaderPic.setIcon(new ImageIcon(PantallaInicioGUI.class.getResource("/images/juandegarayLogo.jpg")));
		GridBagConstraints gbc_lbl_HeaderPic = new GridBagConstraints();
		gbc_lbl_HeaderPic.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_HeaderPic.gridwidth = 13;
		gbc_lbl_HeaderPic.gridx = 0;
		gbc_lbl_HeaderPic.gridy = 0;
		frmCalculanotas.getContentPane().add(lbl_HeaderPic, gbc_lbl_HeaderPic);

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

		JLabel lblTitulo = new JLabel("Selecciona una opcion");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridwidth = 13;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frmCalculanotas.getContentPane().add(lblTitulo, gbc_lblNewLabel_1);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(Color.WHITE);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridheight = 4;
		gbc_tabbedPane.gridwidth = 13;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 2;
		frmCalculanotas.getContentPane().add(tabbedPane, gbc_tabbedPane);

		// PANEL
		// GRUPO///////////////////////////////////////////////////////////////////////////////////////////

		JPanel panelGrupo = new JPanel();
		panelGrupo.setBackground(Color.WHITE);
		tabbedPane.addTab("Crear Grupo", null, panelGrupo, null);
		GridBagLayout gbl_panelGrupo = new GridBagLayout();
		gbl_panelGrupo.columnWidths = new int[] { 70, 77, 77, 77, 77, 77, 77, 70 };
		gbl_panelGrupo.rowHeights = new int[] { 62, 62, 62, 62, 62, 62, 62, 62 };
		gbl_panelGrupo.columnWeights = new double[] { 1.0 };
		gbl_panelGrupo.rowWeights = new double[] { Double.MIN_VALUE };
		panelGrupo.setLayout(gbl_panelGrupo);

		JTextField textNombreGrupo = new JTextField();
		GridBagConstraints gbc_textNombreGrupo = new GridBagConstraints();
		gbc_textNombreGrupo.gridwidth = 3;
		gbc_textNombreGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreGrupo.gridx = 3;
		gbc_textNombreGrupo.gridy = 2;
		panelGrupo.add(textNombreGrupo, gbc_textNombreGrupo);
		textNombreGrupo.setColumns(10);

		JButton btnCrearGrupo = new JButton("Crear Grupo");
		btnCrearGrupo.setBorderPainted(false);
		btnCrearGrupo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearGrupo.setOpaque(true);
		btnCrearGrupo.setBackground(new Color(0, 153, 102));
		GridBagConstraints gbc_btnCrearGrupo = new GridBagConstraints();
		gbc_btnCrearGrupo.fill = GridBagConstraints.VERTICAL;
		gbc_btnCrearGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearGrupo.gridx = 4;
		gbc_btnCrearGrupo.gridy = 3;
		panelGrupo.add(btnCrearGrupo, gbc_btnCrearGrupo);

		btnCrearGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textNombreGrupo.getText().isEmpty() || !Character.isDigit(textNombreGrupo.getText().charAt(0))
						|| Integer.valueOf(textNombreGrupo.getText()) < 1
						|| Integer.valueOf(textNombreGrupo.getText()) > daw.getListaAlumnos().size()) {

				} else {

				}
			}
		});

		// PANEL
		// ALUMNO///////////////////////////////////////////////////////////////////////////////////////////

		JPanel panelAlumno = new JPanel();
		panelAlumno.setBackground(Color.WHITE);
		tabbedPane.addTab("Agregar Alumno", null, panelAlumno, null);
		GridBagLayout gbl_panelAlumno = new GridBagLayout();
		gbl_panelAlumno.columnWidths = new int[] { 70, 77, 77, 77, 77, 77, 77, 70 };
		gbl_panelAlumno.rowHeights = new int[] { 62, 62, 62, 62, 62, 62, 62, 62 };
		gbl_panelAlumno.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_panelAlumno.rowWeights = new double[] { Double.MIN_VALUE };
		panelAlumno.setLayout(gbl_panelAlumno);

		// PANEL
		// NOTAS///////////////////////////////////////////////////////////////////////////////////////////

		JPanel panelNotas = new JPanel();
		panelNotas.setBackground(Color.WHITE);
		tabbedPane.addTab("Consultar Notas", null, panelNotas, null);
		GridBagLayout gbl_panelNotas = new GridBagLayout();
		gbl_panelNotas.columnWidths = new int[] { 70, 77, 77, 77, 77, 77, 77, 70 };
		gbl_panelNotas.rowHeights = new int[] { 62, 62, 62, 62, 62, 62, 62, 62 };
		gbl_panelNotas.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_panelNotas.rowWeights = new double[] { Double.MIN_VALUE };
		panelNotas.setLayout(gbl_panelNotas);

		JTextField txtNia = new JTextField();
		txtNia.setText("0");
		txtNia.setBackground(Color.WHITE);
		txtNia.setName("nia");
		txtNia.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 20));
		txtNia.setOpaque(true);
		txtNia.setBorder(new TitledBorder(null, "NIA", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, null));
		txtNia.setForeground(Color.BLACK);
		GridBagConstraints gbc_txtNia = new GridBagConstraints();
		gbc_txtNia.gridwidth = 2;
		gbc_txtNia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNia.insets = new Insets(0, 0, 5, 5);
		gbc_txtNia.gridx = 2;
		gbc_txtNia.gridy = 1;
		panelNotas.add(txtNia, gbc_txtNia);
		txtNia.setColumns(10);

		JEditorPane txtAreaNotas = new JEditorPane();
		txtAreaNotas.setMargin(new Insets(0, 5, 5, 0));
		txtAreaNotas.setOpaque(false);
		GridBagConstraints gbc_txtAreaNotas = new GridBagConstraints();
		gbc_txtAreaNotas.insets = new Insets(0, 0, 5, 0);
		gbc_txtAreaNotas.ipadx = 5;
		gbc_txtAreaNotas.gridheight = 6;
		gbc_txtAreaNotas.anchor = GridBagConstraints.WEST;
		gbc_txtAreaNotas.fill = GridBagConstraints.BOTH;
		gbc_txtAreaNotas.gridwidth = 6;
		gbc_txtAreaNotas.gridx = 1;
		gbc_txtAreaNotas.gridy = 2;
		panelNotas.add(txtAreaNotas, gbc_txtAreaNotas);
		gbl_panelNotas.columnWeights = new double[] {};
		gbl_panelNotas.rowWeights = new double[] {};
		panelNotas.setLayout(gbl_panelNotas);

		JButton btnCalcularNota = new JButton("Calcular Nota");
		btnCalcularNota.setBorderPainted(false);
		btnCalcularNota.setOpaque(true);
		btnCalcularNota.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcularNota.setBackground(new Color(51, 153, 102));
		GridBagConstraints gbc_btnCalcularNota = new GridBagConstraints();
		gbc_btnCalcularNota.fill = GridBagConstraints.BOTH;
		gbc_btnCalcularNota.insets = new Insets(0, 0, 5, 5);
		gbc_btnCalcularNota.gridx = 4;
		gbc_btnCalcularNota.gridy = 1;
		panelNotas.add(btnCalcularNota, gbc_btnCalcularNota);

		JToggleButton toggleDetalles = new JToggleButton("Mostrar Detalles");
		GridBagConstraints gbc_toggleButton = new GridBagConstraints();
		gbc_toggleButton.insets = new Insets(0, 0, 5, 5);
		gbc_toggleButton.gridx = 6;
		gbc_toggleButton.gridy = 1;
		toggleDetalles.setVisible(false);
		panelNotas.add(toggleDetalles, gbc_toggleButton);

		btnCalcularNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNia.getText().isEmpty() || !Character.isDigit(txtNia.getText().charAt(0))
						|| Integer.valueOf(txtNia.getText()) < 1
						|| Integer.valueOf(txtNia.getText()) > daw.getListaAlumnos().size()) {
					txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 14));
					txtAreaNotas.setText(
							"Ese NIA no existe en nuestra base de datos, prueba otra vez con un valor del 1 al 10");
					txtAreaNotas.setForeground(Color.RED);

				} else {
					for (Alumno alumno : daw.getListaAlumnos()) {
						if (alumno.getNia().compareTo(txtNia.getText().toString()) == 0) {
							try {
								txtAreaNotas.setMargin(gbc_toggleButton.insets = new Insets(20, 120, 5, 5));
								txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 40));
								txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal());
								toggleDetalles.setVisible(true);
								toggleDetalles.setText("Mostrar detalles");
								toggleDetalles.setSelected(false);
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

		toggleDetalles.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int estado = e.getStateChange();
				if (estado == ItemEvent.SELECTED) {
					for (Alumno alumno : daw.getListaAlumnos()) {
						if (alumno.getNia().compareTo(txtNia.getText().toString()) == 0) {
							try {
								txtAreaNotas.setMargin(gbc_toggleButton.insets = new Insets(20, 60, 5, 5));
								txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 14));
								txtAreaNotas
										.setText("Nota Global: " + alumno.calcNotaGlobal() + "\n" + alumno.toString());
								toggleDetalles.setText("Ocultar detalles");
							} catch (SinPorcentajeExcepcion e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							txtAreaNotas.setForeground(Color.BLACK);
						}
					}

				} else {
					for (Alumno alumno : daw.getListaAlumnos()) {
						if (alumno.getNia().compareTo(txtNia.getText().toString()) == 0) {
							try {
								txtAreaNotas.setMargin(gbc_toggleButton.insets = new Insets(20, 120, 5, 5));
								txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 40));
								txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal());
								toggleDetalles.setText("Mostrar detalles");
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

	}
}
