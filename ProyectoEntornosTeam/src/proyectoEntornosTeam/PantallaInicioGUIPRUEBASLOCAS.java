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
		
		System.out.println(daw);

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
		gbl_panelAlumno.columnWidths = new int[] {15, 38, 38, 38, 38, 38, 0, 0, 38, 38};
		gbl_panelAlumno.rowHeights = new int[] {0, 31, 31, 31, 31, 31, 31, 31, 31};
		gbl_panelAlumno.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0 };
		gbl_panelAlumno.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0 };
		panelAlumno.setLayout(gbl_panelAlumno);
			
//		for (Grupo grupo : listaGrupos) {
//			comboBoxGrupo.addItem(grupo.getNombreGrupo());
//		}
		
		JComboBox<String> comboBoxGrupo = new JComboBox<String>();
		comboBoxGrupo.setBorder(new TitledBorder(null, "Grupo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_comboBoxGrupo = new GridBagConstraints();
		gbc_comboBoxGrupo.gridwidth = 2;
		gbc_comboBoxGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxGrupo.gridx = 1;
		gbc_comboBoxGrupo.gridy = 0;
		panelAlumno.add(comboBoxGrupo, gbc_comboBoxGrupo);
		
		
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Nombre", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
		gbc_textFieldNombre.gridwidth = 3;
		gbc_textFieldNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNombre.gridx = 3;
		gbc_textFieldNombre.gridy = 0;
		panelAlumno.add(textFieldNombre, gbc_textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Apellido 1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textFieldApellido.setColumns(10);
		GridBagConstraints gbc_textFieldApellido = new GridBagConstraints();
		gbc_textFieldApellido.gridwidth = 2;
		gbc_textFieldApellido.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldApellido.gridx = 6;
		gbc_textFieldApellido.gridy = 0;
		panelAlumno.add(textFieldApellido, gbc_textFieldApellido);
		
		JLabel lblNotaFinal = new JLabel("Nota Final");
		GridBagConstraints gbc_lblNotaFinal = new GridBagConstraints();
		gbc_lblNotaFinal.insets = new Insets(0, 0, 5, 0);
		gbc_lblNotaFinal.gridx = 9;
		gbc_lblNotaFinal.gridy = 0;
		panelAlumno.add(lblNotaFinal, gbc_lblNotaFinal);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOpaque(true);
		separator_1.setBorder(null);
		separator_1.setBackground(new Color(0, 0, 153));
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.fill = GridBagConstraints.BOTH;
		gbc_separator_1.gridwidth = 10;
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 1;
		panelAlumno.add(separator_1, gbc_separator_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		panelAlumno.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{38, 38, 38, 0, 0, 0, 38, 0};
		gbl_panel.rowHeights = new int[]{31, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JComboBox comboBoxNotaExamen1 = new JComboBox();
		GridBagConstraints gbc_comboBoxNotaExamen1 = new GridBagConstraints();
		gbc_comboBoxNotaExamen1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxNotaExamen1.gridwidth = 3;
		gbc_comboBoxNotaExamen1.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxNotaExamen1.gridx = 0;
		gbc_comboBoxNotaExamen1.gridy = 0;
		panel.add(comboBoxNotaExamen1, gbc_comboBoxNotaExamen1);
		comboBoxNotaExamen1.setBorder(new TitledBorder(null, "Examen 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JComboBox comboBoxExamen1Percent = new JComboBox();
		GridBagConstraints gbc_comboBoxExamen1Percent = new GridBagConstraints();
		gbc_comboBoxExamen1Percent.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxExamen1Percent.gridwidth = 3;
		gbc_comboBoxExamen1Percent.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxExamen1Percent.gridx = 4;
		gbc_comboBoxExamen1Percent.gridy = 0;
		panel.add(comboBoxExamen1Percent, gbc_comboBoxExamen1Percent);
		comboBoxExamen1Percent.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Ex1 - %", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 5;
		gbc_panel_1.gridy = 2;
		panelAlumno.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{38, 38, 38, 0, 0, 0, 38, 0};
		gbl_panel_1.rowHeights = new int[]{31, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JComboBox comboBoxNotaExamen1_1 = new JComboBox();
		comboBoxNotaExamen1_1.setBorder(new TitledBorder(null, "Examen 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_comboBoxNotaExamen1_1 = new GridBagConstraints();
		gbc_comboBoxNotaExamen1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxNotaExamen1_1.gridwidth = 3;
		gbc_comboBoxNotaExamen1_1.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxNotaExamen1_1.gridx = 0;
		gbc_comboBoxNotaExamen1_1.gridy = 0;
		panel_1.add(comboBoxNotaExamen1_1, gbc_comboBoxNotaExamen1_1);
		
		JComboBox comboBoxExamen1Percent_1 = new JComboBox();
		comboBoxExamen1Percent_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Ex1 - %", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxExamen1Percent_1 = new GridBagConstraints();
		gbc_comboBoxExamen1Percent_1.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxExamen1Percent_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxExamen1Percent_1.gridwidth = 3;
		gbc_comboBoxExamen1Percent_1.gridx = 4;
		gbc_comboBoxExamen1Percent_1.gridy = 0;
		panel_1.add(comboBoxExamen1Percent_1, gbc_comboBoxExamen1Percent_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 7;
		gbc_panel_2.gridy = 2;
		panelAlumno.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{38, 38, 38, 0, 0, 0, 38, 0};
		gbl_panel_2.rowHeights = new int[]{31, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JComboBox comboBoxNotaExamen1_2 = new JComboBox();
		comboBoxNotaExamen1_2.setBorder(new TitledBorder(null, "Examen 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_comboBoxNotaExamen1_2 = new GridBagConstraints();
		gbc_comboBoxNotaExamen1_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxNotaExamen1_2.gridwidth = 3;
		gbc_comboBoxNotaExamen1_2.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxNotaExamen1_2.gridx = 0;
		gbc_comboBoxNotaExamen1_2.gridy = 0;
		panel_2.add(comboBoxNotaExamen1_2, gbc_comboBoxNotaExamen1_2);
		
		JComboBox comboBoxExamen1Percent_2 = new JComboBox();
		comboBoxExamen1Percent_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Ex1 - %", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxExamen1Percent_2 = new GridBagConstraints();
		gbc_comboBoxExamen1Percent_2.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxExamen1Percent_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxExamen1Percent_2.gridwidth = 3;
		gbc_comboBoxExamen1Percent_2.gridx = 4;
		gbc_comboBoxExamen1Percent_2.gridy = 0;
		panel_2.add(comboBoxExamen1Percent_2, gbc_comboBoxExamen1Percent_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOpaque(true);
		separator_2.setBorder(null);
		separator_2.setBackground(new Color(0, 0, 153));
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.fill = GridBagConstraints.BOTH;
		gbc_separator_2.gridwidth = 10;
		gbc_separator_2.insets = new Insets(0, 0, 5, 0);
		gbc_separator_2.gridx = 0;
		gbc_separator_2.gridy = 3;
		panelAlumno.add(separator_2, gbc_separator_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridwidth = 5;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 4;
		panelAlumno.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{38, 38, 0, 38, 38, 38, 0};
		gbl_panel_3.rowHeights = new int[]{31, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JComboBox comboBoxTest1Preguntas = new JComboBox();
		GridBagConstraints gbc_comboBoxTest1Preguntas = new GridBagConstraints();
		gbc_comboBoxTest1Preguntas.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest1Preguntas.gridwidth = 2;
		gbc_comboBoxTest1Preguntas.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxTest1Preguntas.gridx = 0;
		gbc_comboBoxTest1Preguntas.gridy = 0;
		panel_3.add(comboBoxTest1Preguntas, gbc_comboBoxTest1Preguntas);
		comboBoxTest1Preguntas.setName("Preguntas");
		comboBoxTest1Preguntas.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Preguntas T1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JComboBox comboBoxTest1Aciertos = new JComboBox();
		GridBagConstraints gbc_comboBoxTest1Aciertos = new GridBagConstraints();
		gbc_comboBoxTest1Aciertos.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest1Aciertos.gridwidth = 2;
		gbc_comboBoxTest1Aciertos.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxTest1Aciertos.gridx = 2;
		gbc_comboBoxTest1Aciertos.gridy = 0;
		panel_3.add(comboBoxTest1Aciertos, gbc_comboBoxTest1Aciertos);
		comboBoxTest1Aciertos.setName("Aciertos");
		comboBoxTest1Aciertos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Aciertos T1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JComboBox comboBoxTest1Fallos = new JComboBox();
		GridBagConstraints gbc_comboBoxTest1Fallos = new GridBagConstraints();
		gbc_comboBoxTest1Fallos.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest1Fallos.gridx = 5;
		gbc_comboBoxTest1Fallos.gridy = 0;
		panel_3.add(comboBoxTest1Fallos, gbc_comboBoxTest1Fallos);
		comboBoxTest1Fallos.setName("Fallos");
		comboBoxTest1Fallos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Fallos T1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridwidth = 5;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 5;
		panelAlumno.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{38, 38, 0, 38, 38, 38, 0};
		gbl_panel_4.rowHeights = new int[]{31, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JComboBox comboBoxTest2Preguntas = new JComboBox();
		GridBagConstraints gbc_comboBoxTest2Preguntas = new GridBagConstraints();
		gbc_comboBoxTest2Preguntas.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest2Preguntas.gridwidth = 2;
		gbc_comboBoxTest2Preguntas.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxTest2Preguntas.gridx = 0;
		gbc_comboBoxTest2Preguntas.gridy = 0;
		panel_4.add(comboBoxTest2Preguntas, gbc_comboBoxTest2Preguntas);
		comboBoxTest2Preguntas.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Preguntas T2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JComboBox comboBoxTest2Aciertos = new JComboBox();
		GridBagConstraints gbc_comboBoxTest2Aciertos = new GridBagConstraints();
		gbc_comboBoxTest2Aciertos.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest2Aciertos.gridwidth = 2;
		gbc_comboBoxTest2Aciertos.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxTest2Aciertos.gridx = 2;
		gbc_comboBoxTest2Aciertos.gridy = 0;
		panel_4.add(comboBoxTest2Aciertos, gbc_comboBoxTest2Aciertos);
		comboBoxTest2Aciertos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Aciertos T2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JComboBox comboBoxTest2Fallos = new JComboBox();
		GridBagConstraints gbc_comboBoxTest2Fallos = new GridBagConstraints();
		gbc_comboBoxTest2Fallos.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTest2Fallos.gridx = 5;
		gbc_comboBoxTest2Fallos.gridy = 0;
		panel_4.add(comboBoxTest2Fallos, gbc_comboBoxTest2Fallos);
		comboBoxTest2Fallos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Fallos T2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JSeparator separator = new JSeparator();
		separator.setBorder(null);
		separator.setOpaque(true);
		separator.setBackground(new Color(0, 0, 153));
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridwidth = 10;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 6;
		panelAlumno.add(separator, gbc_separator);
		
		JComboBox comboBoxTrabajo2Estado = new JComboBox();
		comboBoxTrabajo2Estado.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Estado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxTrabajo2Estado = new GridBagConstraints();
		gbc_comboBoxTrabajo2Estado.gridwidth = 2;
		gbc_comboBoxTrabajo2Estado.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxTrabajo2Estado.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTrabajo2Estado.gridx = 2;
		gbc_comboBoxTrabajo2Estado.gridy = 7;
		panelAlumno.add(comboBoxTrabajo2Estado, gbc_comboBoxTrabajo2Estado);
		
		JComboBox comboBoxTrabajo2Retraso = new JComboBox();
		comboBoxTrabajo2Retraso.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Dias de Retraso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_comboBoxTrabajo2Retraso = new GridBagConstraints();
		gbc_comboBoxTrabajo2Retraso.gridwidth = 3;
		gbc_comboBoxTrabajo2Retraso.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxTrabajo2Retraso.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTrabajo2Retraso.gridx = 5;
		gbc_comboBoxTrabajo2Retraso.gridy = 7;
		panelAlumno.add(comboBoxTrabajo2Retraso, gbc_comboBoxTrabajo2Retraso);
		
		JComboBox comboBox_2_10 = new JComboBox();
		comboBox_2_10.setBorder(new TitledBorder(null, "Examen 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_comboBox_2_10 = new GridBagConstraints();
		gbc_comboBox_2_10.gridwidth = 2;
		gbc_comboBox_2_10.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2_10.gridx = 8;
		gbc_comboBox_2_10.gridy = 7;
		panelAlumno.add(comboBox_2_10, gbc_comboBox_2_10);
		
		JButton btnCrearAlumno = new JButton("Crear Alumno");
		btnCrearAlumno.setBorderPainted(false);
		btnCrearAlumno.setOpaque(true);
		btnCrearAlumno.setBackground(new Color(0, 153, 102));
		GridBagConstraints gbc_btnCrearAlumno = new GridBagConstraints();
		gbc_btnCrearAlumno.fill = GridBagConstraints.BOTH;
		gbc_btnCrearAlumno.gridwidth = 5;
		gbc_btnCrearAlumno.insets = new Insets(0, 0, 0, 5);
		gbc_btnCrearAlumno.gridx = 4;
		gbc_btnCrearAlumno.gridy = 8;
		panelAlumno.add(btnCrearAlumno, gbc_btnCrearAlumno);

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
				
				
			}
		});
		
		

	}
	
	
	public void addGrupo(String nombreGrupo) {
		listaGrupos.add(new Grupo(nombreGrupo));
	}
	
	
}
