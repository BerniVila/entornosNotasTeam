package proyectoEntornosTeamVersionBD;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PantallaInicioGUIConBBDD {

	private JFrame frmCalculanotas;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	ArrayList<Grupo> grupos;
	ConexionDB conexion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicioGUIConBBDD window = new PantallaInicioGUIConBBDD();
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
	public PantallaInicioGUIConBBDD() throws notaInvalidoExamenClasicoExcepcion, notaInvalidoExamenTestExcepcion,
			niaRepetidoExcepcion, ClassNotFoundException, SQLException, SinPorcentajeExcepcion {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws notaInvalidoExamenTestExcepcion
	 * @throws notaInvalidoExamenClasicoExcepcion
	 * @throws niaRepetidoExcepcion
	 */
	private void initialize() throws notaInvalidoExamenClasicoExcepcion, notaInvalidoExamenTestExcepcion,
			niaRepetidoExcepcion, ClassNotFoundException, SQLException, SinPorcentajeExcepcion {
		try {
			conexion = new ConexionDB();
			// AsignarDatos.main(null); //Solamente en la primer ejecucion para probar la
			// aplicacion
			grupos = conexion.leerBD();
			Grupo daw = grupos.get(0);

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
					.setIcon(new ImageIcon(PantallaInicioGUIConBBDD.class.getResource("/images/juandegarayLogo.jpg")));
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
			gbl_panelGrupo.columnWidths = new int[] { 90, 90, 90, 90, 90, 90, 90, 90, 90, 90 };
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
			gbl_panelAlumno.columnWidths = new int[] { 30, 38, 38, 38, 38, 38, 38, 38, 38 };
			gbl_panelAlumno.rowHeights = new int[] { 20, 10, 0, 10, 31, 31, 31, 31, 31, 31, 30, 31, 31, 31, 31, 31,
					31 };
			gbl_panelAlumno.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0 };
			gbl_panelAlumno.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
			panelAlumno.setLayout(gbl_panelAlumno);

			JComboBox<String> comboBoxGrupo = new JComboBox<String>();
			comboBoxGrupo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Grupo",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_comboBoxGrupo = new GridBagConstraints();
			gbc_comboBoxGrupo.gridwidth = 2;
			gbc_comboBoxGrupo.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxGrupo.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxGrupo.gridx = 2;
			gbc_comboBoxGrupo.gridy = 0;
			panelAlumno.add(comboBoxGrupo, gbc_comboBoxGrupo);

			for (Grupo grupo : grupos) {
				comboBoxGrupo.addItem(grupo.getNombreGrupo());
			}

			textFieldNombre = new JTextField();
			textFieldNombre.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Nombre",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
			gbc_textFieldNombre.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldNombre.gridx = 5;
			gbc_textFieldNombre.gridy = 0;
			panelAlumno.add(textFieldNombre, gbc_textFieldNombre);
			textFieldNombre.setColumns(10);

			textFieldApellido = new JTextField();
			textFieldApellido.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Apellido",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			textFieldApellido.setColumns(10);
			GridBagConstraints gbc_textFieldApellido = new GridBagConstraints();
			gbc_textFieldApellido.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldApellido.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldApellido.gridx = 7;
			gbc_textFieldApellido.gridy = 0;
			panelAlumno.add(textFieldApellido, gbc_textFieldApellido);

			JLabel lblNiaAsignado = new JLabel("");
			lblNiaAsignado.setBorder(
					new TitledBorder(null, "Nia Asignado", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_lblNiaAsignado = new GridBagConstraints();
			gbc_lblNiaAsignado.gridwidth = 2;
			gbc_lblNiaAsignado.fill = GridBagConstraints.BOTH;
			gbc_lblNiaAsignado.gridheight = 3;
			gbc_lblNiaAsignado.insets = new Insets(0, 0, 5, 5);
			gbc_lblNiaAsignado.gridx = 2;
			gbc_lblNiaAsignado.gridy = 1;
			panelAlumno.add(lblNiaAsignado, gbc_lblNiaAsignado);

			JButton btnCrearAlumno = new JButton("Crear Alumno");
			btnCrearAlumno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCrearAlumno.setBorderPainted(false);
			btnCrearAlumno.setOpaque(true);
			btnCrearAlumno.setBackground(new Color(0, 153, 102));
			GridBagConstraints gbc_btnCrearAlumno = new GridBagConstraints();
			gbc_btnCrearAlumno.gridheight = 3;
			gbc_btnCrearAlumno.fill = GridBagConstraints.BOTH;
			gbc_btnCrearAlumno.insets = new Insets(0, 0, 5, 5);
			gbc_btnCrearAlumno.gridx = 7;
			gbc_btnCrearAlumno.gridy = 1;
			panelAlumno.add(btnCrearAlumno, gbc_btnCrearAlumno);

			JButton btnAlumnoReset = new JButton("Reset");
			btnAlumnoReset.setOpaque(true);
			btnAlumnoReset.setBorderPainted(false);
			btnAlumnoReset.setBackground(new Color(153, 102, 102));
			GridBagConstraints gbc_btnAlumnoReset = new GridBagConstraints();
			gbc_btnAlumnoReset.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnAlumnoReset.insets = new Insets(0, 0, 5, 5);
			gbc_btnAlumnoReset.gridx = 5;
			gbc_btnAlumnoReset.gridy = 2;
			panelAlumno.add(btnAlumnoReset, gbc_btnAlumnoReset);

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

			JPanel panelExamenClasico = new JPanel();
			panelExamenClasico.setOpaque(false);
			panelExamenClasico.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
					"Examen Clasico", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_panelExamenClasico = new GridBagConstraints();
			gbc_panelExamenClasico.gridheight = 3;
			gbc_panelExamenClasico.fill = GridBagConstraints.HORIZONTAL;
			gbc_panelExamenClasico.gridwidth = 6;
			gbc_panelExamenClasico.insets = new Insets(0, 0, 5, 5);
			gbc_panelExamenClasico.gridx = 1;
			gbc_panelExamenClasico.gridy = 5;
			panelAlumno.add(panelExamenClasico, gbc_panelExamenClasico);
			GridBagLayout gbl_panelExamenClasico = new GridBagLayout();
			gbl_panelExamenClasico.columnWidths = new int[] { 38, 38, 38, 0, 0, 0, 38, 0 };
			gbl_panelExamenClasico.rowHeights = new int[] { 31, 0, 0 };
			gbl_panelExamenClasico.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
			gbl_panelExamenClasico.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
			panelExamenClasico.setLayout(gbl_panelExamenClasico);

			JComboBox<Integer> comboBoxExamenClasicoNia = new JComboBox<Integer>();
			comboBoxExamenClasicoNia.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
					"NIA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_comboBoxExamenClasicoNia = new GridBagConstraints();
			gbc_comboBoxExamenClasicoNia.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxExamenClasicoNia.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxExamenClasicoNia.gridx = 2;
			gbc_comboBoxExamenClasicoNia.gridy = 0;
			panelExamenClasico.add(comboBoxExamenClasicoNia, gbc_comboBoxExamenClasicoNia);
			addComboBoxNia(comboBoxExamenClasicoNia);

			JComboBox<Double> comboBoxExamenClasicoPercent = new JComboBox<Double>();
			GridBagConstraints gbc_comboBoxExamenClasicoPercent = new GridBagConstraints();
			gbc_comboBoxExamenClasicoPercent.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxExamenClasicoPercent.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxExamenClasicoPercent.gridx = 3;
			gbc_comboBoxExamenClasicoPercent.gridy = 0;
			panelExamenClasico.add(comboBoxExamenClasicoPercent, gbc_comboBoxExamenClasicoPercent);
			comboBoxExamenClasicoPercent.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
					"%", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			addComboBoxPercent(comboBoxExamenClasicoPercent);

			JComboBox<Double> comboBoxExamenClasicoNota = new JComboBox<Double>();
			GridBagConstraints gbc_comboBoxExamenClasicoNota = new GridBagConstraints();
			gbc_comboBoxExamenClasicoNota.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxExamenClasicoNota.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxExamenClasicoNota.gridx = 4;
			gbc_comboBoxExamenClasicoNota.gridy = 0;
			panelExamenClasico.add(comboBoxExamenClasicoNota, gbc_comboBoxExamenClasicoNota);
			comboBoxExamenClasicoNota.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
					"Nota", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			addComboBoxNotas(comboBoxExamenClasicoNota);

			JTextField textFieldExamenClasicoDescripcion = new JTextField();
			textFieldExamenClasicoDescripcion
					.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Descripcion",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_textFieldExamenClasicoDescripcion = new GridBagConstraints();
			gbc_textFieldExamenClasicoDescripcion.gridwidth = 7;
			gbc_textFieldExamenClasicoDescripcion.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldExamenClasicoDescripcion.gridx = 0;
			gbc_textFieldExamenClasicoDescripcion.gridy = 1;
			panelExamenClasico.add(textFieldExamenClasicoDescripcion, gbc_textFieldExamenClasicoDescripcion);

			JButton btnCrearExamenClasico = new JButton("Agregar Examen Clasico");
			btnCrearExamenClasico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCrearExamenClasico.setOpaque(true);
			btnCrearExamenClasico.setBorderPainted(false);
			btnCrearExamenClasico.setBackground(new Color(0, 153, 102));
			GridBagConstraints gbc_btnCrearExamenClasico = new GridBagConstraints();
			gbc_btnCrearExamenClasico.gridheight = 2;
			gbc_btnCrearExamenClasico.fill = GridBagConstraints.BOTH;
			gbc_btnCrearExamenClasico.insets = new Insets(0, 0, 5, 5);
			gbc_btnCrearExamenClasico.gridx = 7;
			gbc_btnCrearExamenClasico.gridy = 6;
			panelAlumno.add(btnCrearExamenClasico, gbc_btnCrearExamenClasico);

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

			JPanel panelTest = new JPanel();
			panelTest.setOpaque(false);
			panelTest.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Examen Tipo Test",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_panelTest = new GridBagConstraints();
			gbc_panelTest.gridheight = 4;
			gbc_panelTest.fill = GridBagConstraints.BOTH;
			gbc_panelTest.gridwidth = 6;
			gbc_panelTest.insets = new Insets(0, 0, 5, 5);
			gbc_panelTest.gridx = 1;
			gbc_panelTest.gridy = 9;
			panelAlumno.add(panelTest, gbc_panelTest);
			GridBagLayout gbl_panelTest = new GridBagLayout();
			gbl_panelTest.columnWidths = new int[] { 38, 38, 0, 38, 38, 38, 0 };
			gbl_panelTest.rowHeights = new int[] { 31, 0, 0 };
			gbl_panelTest.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
			gbl_panelTest.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
			panelTest.setLayout(gbl_panelTest);

			JComboBox<Integer> comboBoxExamenTestNia = new JComboBox<Integer>();
			comboBoxExamenTestNia.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "NIA",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_comboBoxExamenTestNia = new GridBagConstraints();
			gbc_comboBoxExamenTestNia.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxExamenTestNia.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxExamenTestNia.gridx = 1;
			gbc_comboBoxExamenTestNia.gridy = 0;
			panelTest.add(comboBoxExamenTestNia, gbc_comboBoxExamenTestNia);
			addComboBoxNia(comboBoxExamenTestNia);

			JComboBox<Double> comboBoxTestPercent = new JComboBox<Double>();
			GridBagConstraints gbc_comboBoxTestPercent = new GridBagConstraints();
			gbc_comboBoxTestPercent.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxTestPercent.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxTestPercent.gridx = 2;
			gbc_comboBoxTestPercent.gridy = 0;
			panelTest.add(comboBoxTestPercent, gbc_comboBoxTestPercent);
			comboBoxTestPercent.setName("Preguntas");
			comboBoxTestPercent.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "% Test",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			addComboBoxPercent(comboBoxTestPercent);

			JComboBox<Integer> comboBoxTestAciertos = new JComboBox<Integer>();
			GridBagConstraints gbc_comboBoxTestAciertos = new GridBagConstraints();
			gbc_comboBoxTestAciertos.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxTestAciertos.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxTestAciertos.gridx = 3;
			gbc_comboBoxTestAciertos.gridy = 0;
			panelTest.add(comboBoxTestAciertos, gbc_comboBoxTestAciertos);
			comboBoxTestAciertos.setName("Aciertos");
			comboBoxTestAciertos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
					"Aciertos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			addComboBoxAciertos(comboBoxTestAciertos);

			JComboBox<Integer> comboBoxTestFallos = new JComboBox<Integer>();
			GridBagConstraints gbc_comboBoxTestFallos = new GridBagConstraints();
			gbc_comboBoxTestFallos.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxTestFallos.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxTestFallos.gridx = 4;
			gbc_comboBoxTestFallos.gridy = 0;
			panelTest.add(comboBoxTestFallos, gbc_comboBoxTestFallos);
			comboBoxTestFallos.setName("Fallos");
			comboBoxTestFallos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Fallos",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			addComboBoxFallos(comboBoxTestFallos);

			JTextField textFieldTestDescripcion = new JTextField();
			textFieldTestDescripcion.setName("Fallos");
			textFieldTestDescripcion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
					"Descripcion", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_textFieldTestDescripcion = new GridBagConstraints();
			gbc_textFieldTestDescripcion.gridwidth = 6;
			gbc_textFieldTestDescripcion.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldTestDescripcion.gridx = 0;
			gbc_textFieldTestDescripcion.gridy = 1;
			panelTest.add(textFieldTestDescripcion, gbc_textFieldTestDescripcion);

			JButton btnCrearExamenTest = new JButton("Agregar Test");
			btnCrearExamenTest.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCrearExamenTest.setOpaque(true);
			btnCrearExamenTest.setBorderPainted(false);
			btnCrearExamenTest.setBackground(new Color(0, 153, 102));
			GridBagConstraints gbc_btnCrearExamenTest = new GridBagConstraints();
			gbc_btnCrearExamenTest.gridheight = 3;
			gbc_btnCrearExamenTest.fill = GridBagConstraints.BOTH;
			gbc_btnCrearExamenTest.insets = new Insets(0, 0, 5, 5);
			gbc_btnCrearExamenTest.gridx = 7;
			gbc_btnCrearExamenTest.gridy = 10;
			panelAlumno.add(btnCrearExamenTest, gbc_btnCrearExamenTest);

			JSeparator separator_1 = new JSeparator();
			separator_1.setOpaque(true);
			separator_1.setBorder(null);
			separator_1.setBackground(new Color(0, 0, 153));
			GridBagConstraints gbc_separator_1 = new GridBagConstraints();
			gbc_separator_1.fill = GridBagConstraints.BOTH;
			gbc_separator_1.gridwidth = 7;
			gbc_separator_1.insets = new Insets(0, 0, 5, 5);
			gbc_separator_1.gridx = 1;
			gbc_separator_1.gridy = 13;
			panelAlumno.add(separator_1, gbc_separator_1);

			JPanel panelTrabajos = new JPanel();
			panelTrabajos.setOpaque(false);
			panelTrabajos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
					"Trabajo de Clase", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_panelTrabajos = new GridBagConstraints();
			gbc_panelTrabajos.insets = new Insets(0, 0, 0, 5);
			gbc_panelTrabajos.gridheight = 3;
			gbc_panelTrabajos.gridwidth = 6;
			gbc_panelTrabajos.fill = GridBagConstraints.BOTH;
			gbc_panelTrabajos.gridx = 1;
			gbc_panelTrabajos.gridy = 14;
			panelAlumno.add(panelTrabajos, gbc_panelTrabajos);
			GridBagLayout gbl_panelTrabajos = new GridBagLayout();
			gbl_panelTrabajos.columnWidths = new int[] { 38, 38, 0, 38, 38, 38, 0 };
			gbl_panelTrabajos.rowHeights = new int[] { 0, 31, 0 };
			gbl_panelTrabajos.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
			gbl_panelTrabajos.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
			panelTrabajos.setLayout(gbl_panelTrabajos);

			JComboBox<Integer> comboBoxTrabajoNia = new JComboBox<Integer>();
			comboBoxTrabajoNia.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "NIA",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_comboBoxTrabajoNia = new GridBagConstraints();
			gbc_comboBoxTrabajoNia.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxTrabajoNia.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxTrabajoNia.gridx = 2;
			gbc_comboBoxTrabajoNia.gridy = 0;
			panelTrabajos.add(comboBoxTrabajoNia, gbc_comboBoxTrabajoNia);
			addComboBoxNia(comboBoxTrabajoNia);

			JComboBox<Integer> comboBoxRetrasoTrabajo = new JComboBox<Integer>();
			comboBoxRetrasoTrabajo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
					"Dias de Retraso", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_comboBoxRetrasoTrabajo = new GridBagConstraints();
			gbc_comboBoxRetrasoTrabajo.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxRetrasoTrabajo.gridwidth = 2;
			gbc_comboBoxRetrasoTrabajo.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxRetrasoTrabajo.gridx = 3;
			gbc_comboBoxRetrasoTrabajo.gridy = 0;
			panelTrabajos.add(comboBoxRetrasoTrabajo, gbc_comboBoxRetrasoTrabajo);
			addComboBoxRetraso(comboBoxRetrasoTrabajo);

			JTextField textFieldTrabajoDescripcion = new JTextField();
			textFieldTrabajoDescripcion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
					"Descripcion", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_textFieldTrabajoDescripcion = new GridBagConstraints();
			gbc_textFieldTrabajoDescripcion.gridwidth = 6;
			gbc_textFieldTrabajoDescripcion.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldTrabajoDescripcion.gridx = 0;
			gbc_textFieldTrabajoDescripcion.gridy = 1;
			panelTrabajos.add(textFieldTrabajoDescripcion, gbc_textFieldTrabajoDescripcion);

			JButton btnCrearTrabajoClase = new JButton("Agregar Trabajo");
			btnCrearTrabajoClase.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCrearTrabajoClase.setOpaque(true);
			btnCrearTrabajoClase.setBorderPainted(false);
			btnCrearTrabajoClase.setBackground(new Color(0, 153, 102));
			GridBagConstraints gbc_btnCrearTrabajoClase = new GridBagConstraints();
			gbc_btnCrearTrabajoClase.gridheight = 2;
			gbc_btnCrearTrabajoClase.fill = GridBagConstraints.BOTH;
			gbc_btnCrearTrabajoClase.insets = new Insets(0, 0, 0, 5);
			gbc_btnCrearTrabajoClase.gridx = 7;
			gbc_btnCrearTrabajoClase.gridy = 15;
			panelAlumno.add(btnCrearTrabajoClase, gbc_btnCrearTrabajoClase);

			// PANEL
			// NOTAS///////////////////////////////////////////////////////////////////////////////////////////

			JPanel panelNotas = new JPanel();
			panelNotas.setBackground(Color.WHITE);
			tabbedPane.addTab("Consultar Notas", null, panelNotas, null);
			GridBagLayout gbl_panelNotas = new GridBagLayout();
			gbl_panelNotas.columnWidths = new int[] { 90, 90, 90, 90, 90, 90, 90, 90, 90, 90 };
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

			// CREACION
			// ALUMNOS////////////////////////////////////////////////////////////////////////////////////////////////////////

			btnCrearAlumno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						int lastNIA = 0;

						for (Grupo grupo : grupos) {
							lastNIA = lastNIA + grupo.getListaAlumnos().size();
						}

						String numeroNIA = String.valueOf(lastNIA + 1);
						String nombreGrupo = comboBoxGrupo.getSelectedItem().toString();
						String nombreAlumno = textFieldNombre.getText();
						String apellidoAlumno = textFieldApellido.getText();

						conexion.crearAlumno(numeroNIA, nombreAlumno, apellidoAlumno, nombreGrupo);

						lblNiaAsignado.setText(numeroNIA);

						comboBoxExamenClasicoNia.addItem(lastNIA + 1);
						comboBoxExamenTestNia.addItem(lastNIA + 1);
						comboBoxTrabajoNia.addItem(lastNIA + 1);

						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Alumno " + textFieldNombre.getText() + " "
								+ textFieldApellido.getText() + " creado con exito", "Greeting",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});

			btnAlumnoReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textFieldNombre.setText("");
					textFieldApellido.setText("");
					lblNiaAsignado.setText("");
				}
			});

			// CREACION
			// EXAMENES////////////////////////////////////////////////////////////////////////////////////////////////////////

			btnCrearExamenClasico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String niaSeleccionado = String.valueOf(comboBoxExamenClasicoNia.getSelectedItem());
					Double percentSeleccionado = Double
							.valueOf(comboBoxExamenClasicoPercent.getSelectedItem().toString());
					Double notaSeleccionada = Double.valueOf(comboBoxExamenClasicoNota.getSelectedItem().toString());
					String descripcion = textFieldExamenClasicoDescripcion.getText();

					try {
						conexion.anyadirExamenClasico(niaSeleccionado, percentSeleccionado, descripcion,
								notaSeleccionada);

						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Examen " + descripcion + " creado con exito", "Greeting",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});

			btnCrearExamenTest.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String niaSeleccionado = String.valueOf(comboBoxExamenTestNia.getSelectedItem());
					Double percentSeleccionado = Double.valueOf(comboBoxTestPercent.getSelectedItem().toString());
					int aciertos = Integer.valueOf(comboBoxTestAciertos.getSelectedItem().toString());
					int fallos = Integer.valueOf(comboBoxTestFallos.getSelectedItem().toString());
					String descripcion = textFieldTestDescripcion.getText();

					try {
						if (aciertos + fallos > 30) {

							JFrame frame = new JFrame();
							JOptionPane.showMessageDialog(
									frame, "Los aciertos y los fallos no pueden sumar más de "
											+ ExamenTest.NUM_PREGUNTAS + " en total.",
									"Error", JOptionPane.ERROR_MESSAGE);

						} else {
							conexion.anyadirExamenTest(niaSeleccionado, percentSeleccionado, descripcion, aciertos,
									fallos);

							JFrame frame = new JFrame();
							JOptionPane.showMessageDialog(frame, "Test " + descripcion + " creado con exito",
									"Greeting", JOptionPane.INFORMATION_MESSAGE);
						}

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});

			// CREACION
			// TRABAJOS////////////////////////////////////////////////////////////////////////////////////////////////////////

			btnCrearTrabajoClase.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String niaSeleccionado = String.valueOf(comboBoxTrabajoNia.getSelectedItem());
					int retraso = Integer.valueOf(comboBoxRetrasoTrabajo.getSelectedItem().toString());
					String descripcion = textFieldTrabajoDescripcion.getText();

					try {
						conexion.anyadirTrabajo(niaSeleccionado, retraso, descripcion);

						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame, "Trabajo " + descripcion + " creado con exito", "Greeting",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});

			// CREACION
			// GRUPOS////////////////////////////////////////////////////////////////////////////////////////////////////////

			btnCrearGrupo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						conexion.crearGrupo(textNombreGrupo.getText());
						comboBoxGrupo.addItem(textNombreGrupo.getText());

						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame,
								"Grupo " + textNombreGrupo.getText() + " creado con éxito", "Greeting",
								JOptionPane.INFORMATION_MESSAGE);

						textNombreGrupo.setText("");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			btnCalcularNota.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						grupos = conexion.leerBD();
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}

					if (txtNia.getText().isEmpty() || !Character.isDigit(txtNia.getText().charAt(0))
							|| Integer.valueOf(txtNia.getText()) < 1
							|| Integer.valueOf(txtNia.getText()) > comboBoxExamenClasicoNia.getItemCount()) {
						txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 14));
						txtAreaNotas.setText(
								"Ese NIA no existe en nuestra base de datos, prueba otra vez con un NIA valido");
						txtAreaNotas.setForeground(Color.RED);
						toggleDetalles.setVisible(false);

					} else {

						for (Grupo grupo : grupos) {
							for (Alumno alumno : grupo.getListaAlumnos()) {

								if (alumno.getNia().compareTo(txtNia.getText().toString()) == 0) {
									try {
										txtAreaNotas.setMargin(gbc_toggleButton.insets = new Insets(20, 120, 5, 5));
										txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 40));
										txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal());
										toggleDetalles.setVisible(true);
										toggleDetalles.setText("Mostrar detalles");
										toggleDetalles.setSelected(false);
									} catch (SinPorcentajeExcepcion | porcentajeInvalidoExcepcion e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									txtAreaNotas.setForeground(Color.BLACK);
								}
							}
						}
					}
				}
			});

			toggleDetalles.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					int estado = e.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						for (Grupo grupo : grupos) {
							for (Alumno alumno : grupo.getListaAlumnos()) {

								if (alumno.getNia().compareTo(txtNia.getText().toString()) == 0) {
									try {
										txtAreaNotas.setMargin(gbc_toggleButton.insets = new Insets(20, 60, 5, 5));
										txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 20));
										txtAreaNotas.setText(
												"Nota Global: " + alumno.calcNotaGlobal() + "\n" + alumno.toString());
										toggleDetalles.setText("Ocultar detalles");
									} catch (SinPorcentajeExcepcion | porcentajeInvalidoExcepcion e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									txtAreaNotas.setForeground(Color.BLACK);
								}
							}
						}

					} else {
						for (Grupo grupo : grupos) {
							for (Alumno alumno : grupo.getListaAlumnos()) {

								if (alumno.getNia().compareTo(txtNia.getText().toString()) == 0) {
									try {
										txtAreaNotas.setMargin(gbc_toggleButton.insets = new Insets(20, 120, 5, 5));
										txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 40));
										txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal());
										toggleDetalles.setVisible(true);
										toggleDetalles.setText("Mostrar detalles");
										toggleDetalles.setSelected(false);
									} catch (SinPorcentajeExcepcion | porcentajeInvalidoExcepcion e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									txtAreaNotas.setForeground(Color.BLACK);
								}
							}
						}
					}
				}
			});

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void addComboBoxNotas(JComboBox<Double> comboBoxNotas) {
		for (double i = 0; i <= 10; i += 0.25) {
			comboBoxNotas.addItem(i);
		}
	}

	public void addComboBoxPercent(JComboBox<Double> comboBoxPercent) {
		for (double i = 0; i <= 1.01; i += 0.05) {
			comboBoxPercent.addItem((Math.round(i * 100)) / 100.0);
		}
	}

	public void addComboBoxNia(JComboBox<Integer> comboBoxNia) throws Exception {
		int lastNIA = 0;

		for (Grupo grupo : grupos) {
			lastNIA = lastNIA + grupo.getListaAlumnos().size();
		}

		for (int i = 1; i <= lastNIA; i++) {
			comboBoxNia.addItem(i);
		}
	}

	public void addComboBoxAciertos(JComboBox<Integer> comboBoxAciertos) {

		for (int i = 0; i <= ExamenTest.NUM_PREGUNTAS; i++) {
			comboBoxAciertos.addItem(i);
		}
	}

	public void addComboBoxFallos(JComboBox<Integer> comboBoxFallos) {
		for (int i = 0; i <= ExamenTest.NUM_PREGUNTAS; i++) {
			comboBoxFallos.addItem(i);
		}
	}

	public void addComboBoxRetraso(JComboBox<Integer> comboBoxretraso) {
		for (int i = 0; i <= 30; i++) {
			comboBoxretraso.addItem(i);
		}
	}

}
