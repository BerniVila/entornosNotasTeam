package proyectoEntornosTeam;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
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
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JSeparator;

public class PantallaInicioGUIPRUEBASLOCAS {

	private JFrame frmCalculanotas;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	ArrayList<Grupo> listaGrupos = new ArrayList<Grupo>();
	ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicioGUIPRUEBASLOCAS window = new PantallaInicioGUIPRUEBASLOCAS();
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
	public PantallaInicioGUIPRUEBASLOCAS()
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
		Grupo daw = new Grupo("DAW");
		listaGrupos.add(daw);
		try {
			daw.addAlumno(new Alumno(
					"1", "nombre1", "apellido1", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 10,"Primer examen clasico."),new ExamenClasico(0.2, 10,"Segundo examen clasico."),new ExamenClasico(0.2, 10,"Tercer examen clasico."), new ExamenTest(0.25, 30, 0, "Primer examen test"), new ExamenTest(0.25, 30, 0,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)))
					));
			daw.addAlumno(new Alumno(
					"2", "nombre2", "apellido2", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 5.5,"Primer examen clasico."), new ExamenClasico(0.2, 4,"Segundo examen clasico."),new ExamenClasico(0.2, 6.2,"Tercer examen clasico."), new ExamenTest(0.25, 15, 10, "Primer examen test"), new ExamenTest(0.25, 20, 3,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(1), new TrabajoClase(0), new TrabajoClase(2)))
					));
			daw.addAlumno(new Alumno(
					"3", "nombre3", "apellido3", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 7.6,"Primer examen clasico."), new ExamenClasico(0.2, 8,"Segundo examen clasico."),new ExamenClasico(0.2, 8.5,"Tercer examen clasico."), new ExamenTest(0.25, 25, 4, "Primer examen test"), new ExamenTest(0.25, 26, 4,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(0), new TrabajoClase(1), new TrabajoClase(0)))
					));
			daw.addAlumno(new Alumno(
					"4", "nombre4", "apellido4", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 4.5,"Primer examen clasico."), new ExamenClasico(0.2, 5,"Segundo examen clasico."),new ExamenClasico(0.2, 5.6,"Tercer examen clasico."), new ExamenTest(0.25, 17, 3, "Primer examen test"), new ExamenTest(0.25, 12, 8,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(4), new TrabajoClase(1), new TrabajoClase(3)))
					));
			daw.addAlumno(new Alumno(
					"5", "nombre5", "apellido5", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 9,"Primer examen clasico."), new ExamenClasico(0.2, 8.75,"Segundo examen clasico."),new ExamenClasico(0.2, 9.25,"Tercer examen clasico."), new ExamenTest(0.25, 27, 1, "Primer examen test"), new ExamenTest(0.25, 29, 1,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)))
					));
			daw.addAlumno(new Alumno(
					"6", "nombre6", "apellido6", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 6,"Primer examen clasico."), new ExamenClasico(0.2, 5.5,"Segundo examen clasico."),new ExamenClasico(0.2, 5,"Tercer examen clasico."), new ExamenTest(0.25, 20, 10, "Primer examen test"), new ExamenTest(0.25, 19, 8,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(2), new TrabajoClase(1), new TrabajoClase(7)))
					));
			daw.addAlumno(new Alumno(
					"7", "nombre7", "apellido7", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 8,"Primer examen clasico."), new ExamenClasico(0.2, 7.5,"Segundo examen clasico."),new ExamenClasico(0.2, 8.5,"Tercer examen clasico."), new ExamenTest(0.25, 28, 0, "Primer examen test"), new ExamenTest(0.25, 26, 2,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(1)))
					));
			daw.addAlumno(new Alumno(
					"8", "nombre8", "apellido8", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 7.8,"Primer examen clasico."), new ExamenClasico(0.2, 7,"Segundo examen clasico."),new ExamenClasico(0.2, 8.9,"Tercer examen clasico."), new ExamenTest(0.25, 25, 1, "Primer examen test"), new ExamenTest(0.25, 27, 3,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(1), new TrabajoClase(1), new TrabajoClase(0)))
					));
			daw.addAlumno(new Alumno(
					"9", "nombre9", "apellido9", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 2.5,"Primer examen clasico."), new ExamenClasico(0.2, 4,"Segundo examen clasico."),new ExamenClasico(0.2, 5.5,"Tercer examen clasico."), new ExamenTest(0.25, 10, 15, "Primer examen test"), new ExamenTest(0.25, 20, 8,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(4), new TrabajoClase(2), new TrabajoClase(3)))
					));
			daw.addAlumno(new Alumno(
					"10", "nombre10", "apellido10", 
					new ArrayList<Examen>(
							Arrays.asList(new ExamenClasico(0.1, 9.5,"Primer examen clasico."), new ExamenClasico(0.2, 10,"Segundo examen clasico."),new ExamenClasico(0.2, 8.9,"Tercer examen clasico."), new ExamenTest(0.25, 28, 2, "Primer examen test"), new ExamenTest(0.25, 30, 0,"Segundo examen test"))),
					new ArrayList<TrabajoClase>(
							Arrays.asList(new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)))
					));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		
		frmCalculanotas = new JFrame();
		frmCalculanotas.getContentPane().setBackground(Color.WHITE);
		frmCalculanotas.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmCalculanotas.setTitle("Bienvenido/a al calculador de notas del Juan de Garay");
		frmCalculanotas.setBounds(100, 100, 900, 900);
		frmCalculanotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
		gridBagLayout.rowHeights = new int[] { 170, 30, 40, 100, 100, 30 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		frmCalculanotas.getContentPane().setLayout(gridBagLayout);

		JLabel lbl_HeaderPic = new JLabel("");
		lbl_HeaderPic.setToolTipText("Web del I.E.S Juan de Garay");
		lbl_HeaderPic.setIconTextGap(0);
		lbl_HeaderPic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_HeaderPic.setBackground(Color.LIGHT_GRAY);
		lbl_HeaderPic.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl_HeaderPic
				.setIcon(new ImageIcon(PantallaInicioGUIPRUEBASLOCAS.class.getResource("/images/juandegarayLogo.jpg")));
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
		gbl_panelGrupo.columnWidths = new int[] {90, 90, 90, 90, 90, 90, 90, 90, 90, 90};
		gbl_panelGrupo.rowHeights = new int[] { 62, 62, 62, 62, 62, 62, 62, 62 };
		gbl_panelGrupo.columnWeights = new double[] { 1.0 };
		gbl_panelGrupo.rowWeights = new double[] { Double.MIN_VALUE };
		panelGrupo.setLayout(gbl_panelGrupo);
		
		JLabel lblGrupo = new JLabel("Introduce el nombre del nuevo grupo");
		GridBagConstraints gbc_lblGrupo = new GridBagConstraints();
		gbc_lblGrupo.gridwidth = 4;
		gbc_lblGrupo.insets = new Insets(0, 0, 5, 0);
		gbc_lblGrupo.gridx = 3;
		gbc_lblGrupo.gridy = 0;
		panelGrupo.add(lblGrupo, gbc_lblGrupo);

		JTextField textNombreGrupo = new JTextField();
		GridBagConstraints gbc_textNombreGrupo = new GridBagConstraints();
		gbc_textNombreGrupo.fill = GridBagConstraints.BOTH;
		gbc_textNombreGrupo.gridwidth = 4;
		gbc_textNombreGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreGrupo.gridx = 3;
		gbc_textNombreGrupo.gridy = 1;
		panelGrupo.add(textNombreGrupo, gbc_textNombreGrupo);
		textNombreGrupo.setColumns(10);

		JButton btnCrearGrupo = new JButton("Crear Grupo");
		btnCrearGrupo.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnCrearGrupo.setBorderPainted(false);
		btnCrearGrupo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearGrupo.setOpaque(true);
		btnCrearGrupo.setBackground(new Color(0, 153, 102));
		GridBagConstraints gbc_btnCrearGrupo = new GridBagConstraints();
		gbc_btnCrearGrupo.fill = GridBagConstraints.BOTH;
		gbc_btnCrearGrupo.gridwidth = 2;
		gbc_btnCrearGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearGrupo.gridx = 4;
		gbc_btnCrearGrupo.gridy = 3;
		panelGrupo.add(btnCrearGrupo, gbc_btnCrearGrupo);

		

		// PANEL
		// ALUMNO///////////////////////////////////////////////////////////////////////////////////////////

		JPanel panelAlumno = new JPanel();
		panelAlumno.setBackground(Color.WHITE);
		tabbedPane.addTab("Agregar Alumno", null, panelAlumno, null);
		GridBagLayout gbl_panelAlumno = new GridBagLayout();
		gbl_panelAlumno.columnWidths = new int[] {30, 38, 38, 38, 38, 38, 38, 38, 38};
		gbl_panelAlumno.rowHeights = new int[] {20, 10, 0, 10, 31, 31, 31, 31, 31, 31, 30, 31, 31, 31, 31, 31, 31};
		gbl_panelAlumno.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0 };
		gbl_panelAlumno.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		panelAlumno.setLayout(gbl_panelAlumno);
			
		
		JComboBox<String> comboBoxGrupo = new JComboBox<String>();
		comboBoxGrupo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Grupo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxGrupo = new GridBagConstraints();
		gbc_comboBoxGrupo.gridwidth = 2;
		gbc_comboBoxGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxGrupo.gridx = 2;
		gbc_comboBoxGrupo.gridy = 0;
		panelAlumno.add(comboBoxGrupo, gbc_comboBoxGrupo);
		
		for (Grupo grupo : listaGrupos) {
			comboBoxGrupo.addItem(grupo.getNombreGrupo());
		}
		
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Nombre", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
		gbc_textFieldNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNombre.gridx = 5;
		gbc_textFieldNombre.gridy = 0;
		panelAlumno.add(textFieldNombre, gbc_textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Apellido", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textFieldApellido.setColumns(10);
		GridBagConstraints gbc_textFieldApellido = new GridBagConstraints();
		gbc_textFieldApellido.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldApellido.gridx = 7;
		gbc_textFieldApellido.gridy = 0;
		panelAlumno.add(textFieldApellido, gbc_textFieldApellido);
		
		JPanel panelExamen1 = new JPanel();
		panelExamen1.setOpaque(false);
		panelExamen1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Examen Clasico 1", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panelExamen1 = new GridBagConstraints();
		gbc_panelExamen1.gridheight = 2;
		gbc_panelExamen1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelExamen1.gridwidth = 2;
		gbc_panelExamen1.insets = new Insets(0, 0, 5, 5);
		gbc_panelExamen1.gridx = 2;
		gbc_panelExamen1.gridy = 2;
		panelAlumno.add(panelExamen1, gbc_panelExamen1);
		GridBagLayout gbl_panelExamen1 = new GridBagLayout();
		gbl_panelExamen1.columnWidths = new int[]{38, 38, 38, 0, 0, 0, 38, 0};
		gbl_panelExamen1.rowHeights = new int[]{31, 0};
		gbl_panelExamen1.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelExamen1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelExamen1.setLayout(gbl_panelExamen1);
		
		JComboBox<Double> comboBoxNotaExamen1 = new JComboBox<Double>();
		GridBagConstraints gbc_comboBoxNotaExamen1 = new GridBagConstraints();
		gbc_comboBoxNotaExamen1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxNotaExamen1.gridwidth = 3;
		gbc_comboBoxNotaExamen1.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxNotaExamen1.gridx = 0;
		gbc_comboBoxNotaExamen1.gridy = 0;
		panelExamen1.add(comboBoxNotaExamen1, gbc_comboBoxNotaExamen1);
		comboBoxNotaExamen1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Nota", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		addComboBoxNotas(comboBoxNotaExamen1);

		
		
		JComboBox<Double> comboBoxExamen1Percent = new JComboBox<Double>();
		GridBagConstraints gbc_comboBoxExamen1Percent = new GridBagConstraints();
		gbc_comboBoxExamen1Percent.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxExamen1Percent.gridwidth = 3;
		gbc_comboBoxExamen1Percent.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxExamen1Percent.gridx = 4;
		gbc_comboBoxExamen1Percent.gridy = 0;
		panelExamen1.add(comboBoxExamen1Percent, gbc_comboBoxExamen1Percent);
		comboBoxExamen1Percent.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "%", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		addComboBoxPercent(comboBoxExamen1Percent);
		
		
		JPanel panelExamen2 = new JPanel();
		panelExamen2.setOpaque(false);
		panelExamen2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Examen Clasico 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panelExamen2 = new GridBagConstraints();
		gbc_panelExamen2.gridheight = 2;
		gbc_panelExamen2.insets = new Insets(0, 0, 5, 5);
		gbc_panelExamen2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelExamen2.gridx = 5;
		gbc_panelExamen2.gridy = 2;
		panelAlumno.add(panelExamen2, gbc_panelExamen2);
		GridBagLayout gbl_panelExamen2 = new GridBagLayout();
		gbl_panelExamen2.columnWidths = new int[]{38, 38, 38, 0, 0, 0, 38, 0};
		gbl_panelExamen2.rowHeights = new int[]{31, 0};
		gbl_panelExamen2.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelExamen2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelExamen2.setLayout(gbl_panelExamen2);
		
		JComboBox<Double> comboBoxNotaExamen2 = new JComboBox<Double>();
		comboBoxNotaExamen2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Nota", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxNotaExamen2 = new GridBagConstraints();
		gbc_comboBoxNotaExamen2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxNotaExamen2.gridwidth = 3;
		gbc_comboBoxNotaExamen2.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxNotaExamen2.gridx = 0;
		gbc_comboBoxNotaExamen2.gridy = 0;
		panelExamen2.add(comboBoxNotaExamen2, gbc_comboBoxNotaExamen2);
		addComboBoxNotas(comboBoxNotaExamen2);
		
		JComboBox<Double> comboBoxExamen2Percent = new JComboBox<Double>();
		comboBoxExamen2Percent.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "%", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxExamen2Percent = new GridBagConstraints();
		gbc_comboBoxExamen2Percent.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxExamen2Percent.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxExamen2Percent.gridwidth = 3;
		gbc_comboBoxExamen2Percent.gridx = 4;
		gbc_comboBoxExamen2Percent.gridy = 0;
		panelExamen2.add(comboBoxExamen2Percent, gbc_comboBoxExamen2Percent);
		addComboBoxPercent(comboBoxExamen2Percent);
		
		
		JPanel panelExamen3 = new JPanel();
		panelExamen3.setOpaque(false);
		panelExamen3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Examen Clasico 3", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panelExamen3 = new GridBagConstraints();
		gbc_panelExamen3.gridheight = 2;
		gbc_panelExamen3.insets = new Insets(0, 0, 5, 5);
		gbc_panelExamen3.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelExamen3.gridx = 7;
		gbc_panelExamen3.gridy = 2;
		panelAlumno.add(panelExamen3, gbc_panelExamen3);
		GridBagLayout gbl_panelExamen3 = new GridBagLayout();
		gbl_panelExamen3.columnWidths = new int[]{38, 38, 38, 0, 0, 0, 38, 0};
		gbl_panelExamen3.rowHeights = new int[]{31, 0};
		gbl_panelExamen3.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelExamen3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelExamen3.setLayout(gbl_panelExamen3);
		
		JComboBox<Double> comboBoxNotaExamen3 = new JComboBox<Double>();
		comboBoxNotaExamen3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Nota", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxNotaExamen3 = new GridBagConstraints();
		gbc_comboBoxNotaExamen3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxNotaExamen3.gridwidth = 3;
		gbc_comboBoxNotaExamen3.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxNotaExamen3.gridx = 0;
		gbc_comboBoxNotaExamen3.gridy = 0;
		panelExamen3.add(comboBoxNotaExamen3, gbc_comboBoxNotaExamen3);
		addComboBoxNotas(comboBoxNotaExamen3);
		
		JComboBox<Double> comboBoxExamen3Percent = new JComboBox<Double>();
		comboBoxExamen3Percent.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "%", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxExamen3Percent = new GridBagConstraints();
		gbc_comboBoxExamen3Percent.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxExamen3Percent.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxExamen3Percent.gridwidth = 3;
		gbc_comboBoxExamen3Percent.gridx = 4;
		gbc_comboBoxExamen3Percent.gridy = 0;
		panelExamen3.add(comboBoxExamen3Percent, gbc_comboBoxExamen3Percent);
		addComboBoxPercent(comboBoxExamen3Percent);
		
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOpaque(true);
		separator_2.setBorder(null);
		separator_2.setBackground(new Color(0, 0, 153));
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.fill = GridBagConstraints.BOTH;
		gbc_separator_2.gridwidth = 7;
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 4;
		panelAlumno.add(separator_2, gbc_separator_2);
		
		JPanel panelTest1 = new JPanel();
		panelTest1.setOpaque(false);
		panelTest1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Examen Tipo Test 1", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panelTest1 = new GridBagConstraints();
		gbc_panelTest1.fill = GridBagConstraints.BOTH;
		gbc_panelTest1.gridwidth = 6;
		gbc_panelTest1.insets = new Insets(0, 0, 5, 5);
		gbc_panelTest1.gridx = 2;
		gbc_panelTest1.gridy = 5;
		panelAlumno.add(panelTest1, gbc_panelTest1);
		GridBagLayout gbl_panelTest1 = new GridBagLayout();
		gbl_panelTest1.columnWidths = new int[]{38, 38, 0, 38, 38, 38, 0};
		gbl_panelTest1.rowHeights = new int[]{31, 0};
		gbl_panelTest1.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelTest1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTest1.setLayout(gbl_panelTest1);
		
		JComboBox<Double> comboBoxTest1Percent = new JComboBox<Double>();
		GridBagConstraints gbc_comboBoxTest1Percent = new GridBagConstraints();
		gbc_comboBoxTest1Percent.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest1Percent.gridwidth = 3;
		gbc_comboBoxTest1Percent.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxTest1Percent.gridx = 0;
		gbc_comboBoxTest1Percent.gridy = 0;
		panelTest1.add(comboBoxTest1Percent, gbc_comboBoxTest1Percent);
		comboBoxTest1Percent.setName("Preguntas");
		comboBoxTest1Percent.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "% Test 1", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		addComboBoxPercent(comboBoxTest1Percent);
		
		
		JComboBox comboBoxTest1Aciertos = new JComboBox();
		GridBagConstraints gbc_comboBoxTest1Aciertos = new GridBagConstraints();
		gbc_comboBoxTest1Aciertos.gridwidth = 2;
		gbc_comboBoxTest1Aciertos.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest1Aciertos.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxTest1Aciertos.gridx = 3;
		gbc_comboBoxTest1Aciertos.gridy = 0;
		panelTest1.add(comboBoxTest1Aciertos, gbc_comboBoxTest1Aciertos);
		comboBoxTest1Aciertos.setName("Aciertos");
		comboBoxTest1Aciertos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Aciertos Test 1", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JComboBox comboBoxTest1Fallos = new JComboBox();
		GridBagConstraints gbc_comboBoxTest1Fallos = new GridBagConstraints();
		gbc_comboBoxTest1Fallos.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest1Fallos.gridx = 5;
		gbc_comboBoxTest1Fallos.gridy = 0;
		panelTest1.add(comboBoxTest1Fallos, gbc_comboBoxTest1Fallos);
		comboBoxTest1Fallos.setName("Fallos");
		comboBoxTest1Fallos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Fallos Test 1", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelTest2 = new JPanel();
		panelTest2.setOpaque(false);
		panelTest2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Examen Tipo Test 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panelTest2 = new GridBagConstraints();
		gbc_panelTest2.fill = GridBagConstraints.BOTH;
		gbc_panelTest2.gridwidth = 6;
		gbc_panelTest2.insets = new Insets(0, 0, 5, 5);
		gbc_panelTest2.gridx = 2;
		gbc_panelTest2.gridy = 7;
		panelAlumno.add(panelTest2, gbc_panelTest2);
		GridBagLayout gbl_panelTest2 = new GridBagLayout();
		gbl_panelTest2.columnWidths = new int[]{38, 38, 0, 38, 38, 38, 0};
		gbl_panelTest2.rowHeights = new int[]{31, 0};
		gbl_panelTest2.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelTest2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTest2.setLayout(gbl_panelTest2);
		
		JComboBox<Double> comboBoxTest2Percent = new JComboBox<Double>();
		GridBagConstraints gbc_comboBoxTest2Percent = new GridBagConstraints();
		gbc_comboBoxTest2Percent.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest2Percent.gridwidth = 3;
		gbc_comboBoxTest2Percent.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxTest2Percent.gridx = 0;
		gbc_comboBoxTest2Percent.gridy = 0;
		panelTest2.add(comboBoxTest2Percent, gbc_comboBoxTest2Percent);
		comboBoxTest2Percent.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "% Test 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		addComboBoxPercent(comboBoxTest2Percent);
		
		
		
		JComboBox comboBoxTest2Aciertos = new JComboBox();
		GridBagConstraints gbc_comboBoxTest2Aciertos = new GridBagConstraints();
		gbc_comboBoxTest2Aciertos.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest2Aciertos.gridwidth = 2;
		gbc_comboBoxTest2Aciertos.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxTest2Aciertos.gridx = 3;
		gbc_comboBoxTest2Aciertos.gridy = 0;
		panelTest2.add(comboBoxTest2Aciertos, gbc_comboBoxTest2Aciertos);
		comboBoxTest2Aciertos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Aciertos Test 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JComboBox comboBoxTest2Fallos = new JComboBox();
		GridBagConstraints gbc_comboBoxTest2Fallos = new GridBagConstraints();
		gbc_comboBoxTest2Fallos.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest2Fallos.gridx = 5;
		gbc_comboBoxTest2Fallos.gridy = 0;
		panelTest2.add(comboBoxTest2Fallos, gbc_comboBoxTest2Fallos);
		comboBoxTest2Fallos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Fallos Test 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JSeparator separator = new JSeparator();
		separator.setBorder(null);
		separator.setOpaque(true);
		separator.setBackground(new Color(0, 0, 153));
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridwidth = 7;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 8;
		panelAlumno.add(separator, gbc_separator);
		
		JPanel panelTrabajos = new JPanel();
		panelTrabajos.setOpaque(false);
		panelTrabajos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Trabajos - Dias de retraso", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panelTrabajos = new GridBagConstraints();
		gbc_panelTrabajos.gridheight = 3;
		gbc_panelTrabajos.gridwidth = 6;
		gbc_panelTrabajos.insets = new Insets(0, 0, 5, 5);
		gbc_panelTrabajos.fill = GridBagConstraints.BOTH;
		gbc_panelTrabajos.gridx = 2;
		gbc_panelTrabajos.gridy = 9;
		panelAlumno.add(panelTrabajos, gbc_panelTrabajos);
		GridBagLayout gbl_panelTrabajos = new GridBagLayout();
		gbl_panelTrabajos.columnWidths = new int[]{38, 38, 0, 38, 38, 38, 0};
		gbl_panelTrabajos.rowHeights = new int[]{31, 0};
		gbl_panelTrabajos.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelTrabajos.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTrabajos.setLayout(gbl_panelTrabajos);
		
		JComboBox comboBoxTRetrasoTrabajo1 = new JComboBox();
		comboBoxTRetrasoTrabajo1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Trabajo 1", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxTRetrasoTrabajo1 = new GridBagConstraints();
		gbc_comboBoxTRetrasoTrabajo1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTRetrasoTrabajo1.gridwidth = 3;
		gbc_comboBoxTRetrasoTrabajo1.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxTRetrasoTrabajo1.gridx = 0;
		gbc_comboBoxTRetrasoTrabajo1.gridy = 0;
		panelTrabajos.add(comboBoxTRetrasoTrabajo1, gbc_comboBoxTRetrasoTrabajo1);
		
		JComboBox comboBoxRetrasoTrabajo2 = new JComboBox();
		comboBoxRetrasoTrabajo2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Trabajo 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxRetrasoTrabajo2 = new GridBagConstraints();
		gbc_comboBoxRetrasoTrabajo2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxRetrasoTrabajo2.gridwidth = 2;
		gbc_comboBoxRetrasoTrabajo2.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxRetrasoTrabajo2.gridx = 3;
		gbc_comboBoxRetrasoTrabajo2.gridy = 0;
		panelTrabajos.add(comboBoxRetrasoTrabajo2, gbc_comboBoxRetrasoTrabajo2);
		
		JComboBox comboBoxRetrasoTrabajo3 = new JComboBox();
		comboBoxRetrasoTrabajo3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Trabajo 3", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxRetrasoTrabajo3 = new GridBagConstraints();
		gbc_comboBoxRetrasoTrabajo3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxRetrasoTrabajo3.gridx = 5;
		gbc_comboBoxRetrasoTrabajo3.gridy = 0;
		panelTrabajos.add(comboBoxRetrasoTrabajo3, gbc_comboBoxRetrasoTrabajo3);
		
		JButton btnCrearAlumno = new JButton("Crear Alumno");
		btnCrearAlumno.setBorderPainted(false);
		btnCrearAlumno.setOpaque(true);
		btnCrearAlumno.setBackground(new Color(0, 153, 102));
		GridBagConstraints gbc_btnCrearAlumno = new GridBagConstraints();
		gbc_btnCrearAlumno.gridheight = 3;
		gbc_btnCrearAlumno.fill = GridBagConstraints.BOTH;
		gbc_btnCrearAlumno.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearAlumno.gridx = 5;
		gbc_btnCrearAlumno.gridy = 13;
		panelAlumno.add(btnCrearAlumno, gbc_btnCrearAlumno);
		
		JLabel lblNotaFinal = new JLabel("Nota Final");
		GridBagConstraints gbc_lblNotaFinal = new GridBagConstraints();
		gbc_lblNotaFinal.gridheight = 3;
		gbc_lblNotaFinal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNotaFinal.gridx = 7;
		gbc_lblNotaFinal.gridy = 13;
		panelAlumno.add(lblNotaFinal, gbc_lblNotaFinal);
		
		JLabel lblNiaAsignado = new JLabel("");
		lblNiaAsignado.setBorder(new TitledBorder(null, "Nia Asignado", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_lblNiaAsignado = new GridBagConstraints();
		gbc_lblNiaAsignado.fill = GridBagConstraints.BOTH;
		gbc_lblNiaAsignado.gridheight = 3;
		gbc_lblNiaAsignado.insets = new Insets(0, 0, 5, 5);
		gbc_lblNiaAsignado.gridx = 3;
		gbc_lblNiaAsignado.gridy = 13;
		panelAlumno.add(lblNiaAsignado, gbc_lblNiaAsignado);

		// PANEL
		// NOTAS///////////////////////////////////////////////////////////////////////////////////////////

		JPanel panelNotas = new JPanel();
		panelNotas.setBackground(Color.WHITE);
		tabbedPane.addTab("Consultar Notas", null, panelNotas, null);
		GridBagLayout gbl_panelNotas = new GridBagLayout();
		gbl_panelNotas.columnWidths = new int[] {90, 90, 90, 90, 90, 90, 90, 90, 90, 90};
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
		gbc_toggleButton.gridwidth = 2;
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
								txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 20));
								txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal() + "\n" + alumno.toString());
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
		
		
		
		btnCrearGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					addGrupo(textNombreGrupo.getText());

					comboBoxGrupo.addItem(textNombreGrupo.getText());		

					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Grupo " + textNombreGrupo.getText() + " creado con éxito", "Greeting", JOptionPane.INFORMATION_MESSAGE);
					
					textNombreGrupo.setText("");

			}
		});
		
		
		btnCrearAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int newNia = 0;
				for (Grupo grupo : listaGrupos) {
					
					newNia += grupo.listaAlumnos.size();
				}
				
				Grupo grupoSeleccionado = listaGrupos.get(comboBoxGrupo.getSelectedIndex());
				
				String newNiaStr = Integer.toString(grupoSeleccionado.listaAlumnos.size() + 1);
				
				try {
					grupoSeleccionado.addAlumno(new Alumno(newNiaStr, textFieldNombre.getText(), textFieldApellido.getText()));
					lblNiaAsignado.setText(newNiaStr);
				} catch (niaRepetidoExcepcion e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
//				
				
//				public Alumno(String nia, String nombre, String apellido, ArrayList<Examen> examenes, ArrayList<TrabajoClase> trabajos) {
//					this(nia, nombre, apellido);
//					setExamenes(examenes);
//					setTrabajos(trabajos);
//				}

				
			}
		});
		
		

	}
	
	
	public void addGrupo(String nombreGrupo) {
		listaGrupos.add(new Grupo(nombreGrupo));
	}
	
	public void addComboBoxNotas(JComboBox<Double> comboBoxNotas) {
		for(double i=0; i <=10; i+=0.25 ) {
			comboBoxNotas.addItem(i);	
			}
	}
	
	public void addComboBoxPercent(JComboBox<Double> comboBoxPercent) {
		for(double i=0; i <=100; i+=5 ) {
			comboBoxPercent.addItem(i);	
			}
	}
	
	
}
