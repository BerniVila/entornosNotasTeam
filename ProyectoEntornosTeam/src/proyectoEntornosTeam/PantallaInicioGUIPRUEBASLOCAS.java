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

public class PantallaInicioGUIPRUEBASLOCAS {

	private JFrame frmCalculanotas;

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
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		frmCalculanotas.getContentPane().setLayout(gridBagLayout);

		JLabel lbl_HeaderPic = new JLabel("");
		lbl_HeaderPic.setToolTipText("Web del I.E.S Juan de Garay");
		lbl_HeaderPic.setIconTextGap(0);
		lbl_HeaderPic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_HeaderPic.setBackground(Color.LIGHT_GRAY);
		lbl_HeaderPic.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl_HeaderPic.setIcon(new ImageIcon(PantallaInicioGUIPRUEBASLOCAS.class.getResource("/images/juandegarayLogo.jpg")));
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

		JButton btnCrearGrupo = new JButton("Crear Grupo");
		btnCrearGrupo.setOpaque(true);
		btnCrearGrupo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCrearGrupo.setBackground(new Color(102, 153, 204));
		GridBagConstraints gbc_btnCrearGrupo = new GridBagConstraints();
		gbc_btnCrearGrupo.gridwidth = 3;
		gbc_btnCrearGrupo.fill = GridBagConstraints.BOTH;
		gbc_btnCrearGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearGrupo.gridx = 1;
		gbc_btnCrearGrupo.gridy = 2;
		frmCalculanotas.getContentPane().add(btnCrearGrupo, gbc_btnCrearGrupo);

		JButton btnCrearAlumno = new JButton("Agregar Alumno");
		btnCrearAlumno.setOpaque(true);
		btnCrearAlumno.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCrearAlumno.setBackground(new Color(204, 153, 102));
		GridBagConstraints gbc_btnCrearAlumno = new GridBagConstraints();
		gbc_btnCrearAlumno.gridwidth = 3;
		gbc_btnCrearAlumno.fill = GridBagConstraints.BOTH;
		gbc_btnCrearAlumno.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearAlumno.gridx = 5;
		gbc_btnCrearAlumno.gridy = 2;
		frmCalculanotas.getContentPane().add(btnCrearAlumno, gbc_btnCrearAlumno);

		JButton btnBuscar = new JButton("Buscar Nota");
		btnBuscar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnBuscar.setOpaque(true);
		btnBuscar.setBackground(new Color(102, 153, 102));
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.gridwidth = 3;
		gbc_btnBuscar.fill = GridBagConstraints.BOTH;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 0);
		gbc_btnBuscar.gridx = 9;
		gbc_btnBuscar.gridy = 2;
		frmCalculanotas.getContentPane().add(btnBuscar, gbc_btnBuscar);
		
		//card layout content panels

		JPanel panelContenido = new JPanel();
		GridBagConstraints gbc_panelContenido = new GridBagConstraints();
		gbc_panelContenido.gridheight = 3;
		gbc_panelContenido.gridwidth = 13;
		gbc_panelContenido.fill = GridBagConstraints.BOTH;
		gbc_panelContenido.gridx = 0;
		gbc_panelContenido.gridy = 3;
		frmCalculanotas.getContentPane().add(panelContenido, gbc_panelContenido);
		panelContenido.setLayout(new CardLayout(0, 0));
		
		JPanel panelNotas = new JPanel();
		panelContenido.add(panelNotas, "name_4408424643184");
		GridBagLayout gbl_panelNotas = new GridBagLayout();
		gbl_panelNotas.columnWidths = new int[] {77, 77, 77, 77, 77, 77, 77, 77};
		gbl_panelNotas.rowHeights = new int[] {62, 62, 62, 62, 62, 62, 62, 62};
		gbl_panelNotas.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelNotas.rowWeights = new double[]{Double.MIN_VALUE};
		panelNotas.setLayout(gbl_panelNotas);
		
		JPanel panelAlumno = new JPanel();
		panelContenido.add(panelAlumno, "name_5628868293533");
		GridBagLayout gbl_panelAlumno = new GridBagLayout();
		gbl_panelAlumno.columnWidths = new int[]{0};
		gbl_panelAlumno.rowHeights = new int[]{0};
		gbl_panelAlumno.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelAlumno.rowWeights = new double[]{Double.MIN_VALUE};
		panelAlumno.setLayout(gbl_panelAlumno);
		
		JPanel panelGrupo = new JPanel();
		panelContenido.add(panelGrupo, "name_5636254039430");
		GridBagLayout gbl_panelGrupo = new GridBagLayout();
		gbl_panelGrupo.columnWidths = new int[]{0};
		gbl_panelGrupo.rowHeights = new int[]{0};
		gbl_panelGrupo.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelGrupo.rowWeights = new double[]{Double.MIN_VALUE};
		panelGrupo.setLayout(gbl_panelGrupo);
		
		

	}
}
