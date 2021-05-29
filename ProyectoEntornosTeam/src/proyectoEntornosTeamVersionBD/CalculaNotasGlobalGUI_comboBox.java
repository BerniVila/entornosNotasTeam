package proyectoEntornosTeamVersionBD;

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
import java.sql.SQLException;
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
	 * @throws Exception 
	 */
	public CalculaNotasGlobalGUI_comboBox() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	private void initialize() throws Exception {
		try {
		ConexionDB conexion = new ConexionDB();
		ArrayList<Grupo> grupos = conexion.leerBD();
		Grupo daw = grupos.get(0);
		
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
		for (Alumno alumno : daw.getListaAlumnos()) {
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
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		toggleDetalles.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int estado = e.getStateChange();
				if (estado == ItemEvent.SELECTED) {
					for (Alumno alumno : daw.getListaAlumnos()) {
						String i = Integer.parseInt(alumno.getNia()) + "";
						if (i.compareTo(String.valueOf(comboBox.getSelectedIndex())) == 0) {
							try {
								txtAreaNotas.setMargin(gbc_toggleButton.insets = new Insets(20, 60, 5, 5));
								txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 14));
								txtAreaNotas.setText(
										"Nota Global: " + alumno.calcNotaGlobal() + "\n" + alumno.toString());
								toggleDetalles.setText("Ocultar detalles");
							} catch (Exception e1) {
								JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
							}
							txtAreaNotas.setForeground(Color.BLACK);
						}
					}

				} else {
					for (Alumno alumno : daw.getListaAlumnos()) {
						String i = Integer.parseInt(alumno.getNia()) + "";
						if (i.compareTo(String.valueOf(comboBox.getSelectedIndex())) == 0) {
							try {
								txtAreaNotas.setMargin(gbc_toggleButton.insets = new Insets(20, 120, 5, 5));
								txtAreaNotas.setFont(new Font("Tahoma", Font.PLAIN, 40));
								txtAreaNotas.setText("Nota Global: " + alumno.calcNotaGlobal());
								toggleDetalles.setText("Mostrar detalles");
							} catch (Exception e1) {
								JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
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
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}
