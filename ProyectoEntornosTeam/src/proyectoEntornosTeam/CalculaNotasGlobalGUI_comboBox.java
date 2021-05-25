package proyectoEntornosTeam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Desktop;

public class CalculaNotasGlobalGUI_comboBox {

	private JFrame frmCalculanotas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculaNotasGlobalGUI_comboBox window = new CalculaNotasGlobalGUI_comboBox();
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
	public CalculaNotasGlobalGUI_comboBox() throws notaInvalidoExamenClasicoExcepcion, notaInvalidoExamenTestExcepcion, niaRepetidoExcepcion {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws notaInvalidoExamenTestExcepcion
	 * @throws notaInvalidoExamenClasicoExcepcion
	 * @throws niaRepetidoExcepcion 
	 */
	private void initialize() throws notaInvalidoExamenClasicoExcepcion, notaInvalidoExamenTestExcepcion, niaRepetidoExcepcion {
		// Datos de los alumnos, aquí implementaríamos el acceso a una base de datos desde la clase Grupo
		Grupo daw = new Grupo();
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
				new ImageIcon(CalculaNotasGlobalGUI_comboBox.class.getResource("/images/juandegarayLogo.jpg")));
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

		JToggleButton toggleDetalles = new JToggleButton("Mostrar Detalles");
		GridBagConstraints gbc_toggleButton = new GridBagConstraints();
		gbc_toggleButton.insets = new Insets(0, 0, 5, 5);
		gbc_toggleButton.gridx = 3;
		gbc_toggleButton.gridy = 2;
		toggleDetalles.setVisible(false);
		frmCalculanotas.getContentPane().add(toggleDetalles, gbc_toggleButton);

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



		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Alumno alumno = daw.getListaAlumnos().get(Integer.valueOf(comboBox.getSelectedIndex()));

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
			}
		});

		toggleDetalles.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int estado = e.getStateChange();
				if (estado == ItemEvent.SELECTED) {
					for (Alumno alumno : daw.getListaAlumnos()) {
						String i = Integer.parseInt(alumno.getNia())-1 + "";
						if (i.compareTo(String.valueOf(comboBox.getSelectedIndex())) == 0) {
							try {
								txtAreaNotas.setMargin(gbc_toggleButton.insets = new Insets(20, 60, 5, 5));
								txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 14));
								txtAreaNotas.setText(
										"Nota Global: " + alumno.calcNotaGlobal() + "\n" + alumno.toString());
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
						String i = Integer.parseInt(alumno.getNia())-1 + "";
						if (i.compareTo(String.valueOf(comboBox.getSelectedIndex())) == 0) {
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
