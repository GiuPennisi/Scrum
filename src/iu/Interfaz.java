package iu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Window;
import java.util.LinkedList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

import task.Task;
import general.Sprint;
import general.Project;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import task.Bug;

public class Interfaz {

	private JFrame frmTpJava;
	private JTextField txtComplejidad;
	private JTextField txtFinalizacion;
	private JTextField txtNumBug;
	private JTextField txtNombreBug;
	private DefaultListModel<String> modelSprint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frmTpJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmTpJava = new JFrame();
		frmTpJava.setTitle("TP JAVA 2018");
		frmTpJava.setBounds(100, 100, 868, 544);
		frmTpJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTpJava.getContentPane().setLayout(null);
		
		
		modelSprint = new DefaultListModel<String>();
		modelSprint = Project.getSprint(); //cambiarlo
		
		final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setSelectedIndex(0);
		tabbedPane.setBounds(10, 11, 842, 483);
		frmTpJava.getContentPane().add(tabbedPane);
		
		JPanel pnlPrincipal = new JPanel();
		tabbedPane.addTab("Principal", null, pnlPrincipal, null);
		pnlPrincipal.setLayout(null);
		
		JScrollPane pnlSprints = new JScrollPane();
		pnlSprints.setBounds(10, 30, 815, 150);
		pnlPrincipal.add(pnlSprints);
		
		JList<String> listSprints = new JList<String>();
		pnlSprints.setViewportView(listSprints);
		listSprints.setFont(new Font("Calibri", Font.PLAIN, 15));
		listSprints.setBorder(new MatteBorder(1, 1, 1, 1, (Color) UIManager.getColor("ToolBar.shadow")));
		
		JLabel lblSprints = new JLabel("Sprints");
		lblSprints.setBounds(358, 11, 89, 14);
		lblSprints.setHorizontalAlignment(SwingConstants.CENTER);
		lblSprints.setFont(new Font("Calibri", Font.ITALIC, 15));
		pnlPrincipal.add(lblSprints);
		
		final JScrollPane detallesSprint = new JScrollPane();
		detallesSprint.setBounds(10, 250, 815, 150);
		detallesSprint.setVisible(false);
		pnlPrincipal.add(detallesSprint);

		
		JList listDetallesSprint = new JList();
		detallesSprint.setViewportView(listDetallesSprint);
		
		JButton btnVerDetalle = new JButton("Ver Detalle");
		btnVerDetalle.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	detallesSprint.setVisible(true);
            	frmTpJava.getContentPane().validate();
            	frmTpJava.getContentPane().repaint();
            }
		});
		btnVerDetalle.setBounds(358, 201, 89, 23);
		pnlPrincipal.add(btnVerDetalle);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setEnabled(false);
		btnModificar.setBounds(243, 411, 89, 23);
		pnlPrincipal.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		btnEliminar.setBounds(475, 411, 89, 23);
		pnlPrincipal.add(btnEliminar);
		

		
		
		JPanel pnlNuevoBug = new JPanel();
		tabbedPane.addTab("+ Bug", null, pnlNuevoBug, null);
		pnlNuevoBug.setLayout(null);
		
		JComboBox cBAsignado = new JComboBox();
		cBAsignado.setEditable(true);
		cBAsignado.setBounds(118, 85, 172, 20);
		pnlNuevoBug.add(cBAsignado);
		
		JComboBox cBEstado = new JComboBox();
		cBEstado.setEditable(true);
		cBEstado.setBounds(118, 139, 172, 22);
		pnlNuevoBug.add(cBEstado);
		
		JComboBox cBDepende = new JComboBox();
		cBDepende.setEditable(true);
		cBDepende.setBounds(640, 140, 172, 20);
		pnlNuevoBug.add(cBDepende);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(118, 197, 172, 20);
		pnlNuevoBug.add(comboBox_7);
		
		JLabel lblAsignado = new JLabel("Asignado A");
		lblAsignado.setBounds(24, 88, 54, 14);
		pnlNuevoBug.add(lblAsignado);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(24, 142, 33, 14);
		pnlNuevoBug.add(lblEstado);
		
		JLabel lblEsfuerzo = new JLabel("Esfuerzo");
		lblEsfuerzo.setBounds(24, 200, 42, 14);
		pnlNuevoBug.add(lblEsfuerzo);
		
		JLabel lblComplejidad = new JLabel("Complejidad");
		lblComplejidad.setBounds(471, 88, 58, 14);
		pnlNuevoBug.add(lblComplejidad);
		
		txtComplejidad = new JTextField();
		txtComplejidad.setBounds(640, 85, 172, 20);
		txtComplejidad.setColumns(10);
		pnlNuevoBug.add(txtComplejidad);
		
		JLabel lblDepende = new JLabel("Depende De");
		lblDepende.setBounds(471, 143, 59, 14);
		pnlNuevoBug.add(lblDepende);
		
		JLabel lblFinalizacion = new JLabel("Fecha de Finalizaci\u00F3n");
		lblFinalizacion.setBounds(471, 200, 101, 14);
		pnlNuevoBug.add(lblFinalizacion);
		
		txtFinalizacion = new JTextField();
		txtFinalizacion.setBounds(640, 197, 172, 20);
		txtFinalizacion.setEditable(false);
		txtFinalizacion.setColumns(10);
		pnlNuevoBug.add(txtFinalizacion);
		
		JTextArea txtDescripcion = new JTextArea();
		txtDescripcion.setBounds(24, 281, 788, 163);
		pnlNuevoBug.add(txtDescripcion);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(24, 256, 54, 14);
		pnlNuevoBug.add(lblDescripcion);
		
		JLabel lblBugNumero = new JLabel("Bug N\u00FAmero:");
		lblBugNumero.setBounds(14, 35, 166, 34);
		lblBugNumero.setFont(new Font("Tahoma", Font.PLAIN, 28));
		pnlNuevoBug.add(lblBugNumero);
		
		txtNumBug = new JTextField();
		txtNumBug.setBounds(185, 32, 105, 40);
		txtNumBug.setFont(new Font("Tahoma", Font.PLAIN, 28));
		txtNumBug.setEditable(false);
		txtNumBug.setColumns(10);
		pnlNuevoBug.add(txtNumBug);
		
		JLabel lblNombreBug = new JLabel("Nombre:");
		lblNombreBug.setBounds(353, 35, 108, 34);
		lblNombreBug.setFont(new Font("Tahoma", Font.PLAIN, 28));
		pnlNuevoBug.add(lblNombreBug);
		
		txtNombreBug = new JTextField();
		txtNombreBug.setBounds(471, 42, 341, 22);
		txtNombreBug.setColumns(10);
		pnlNuevoBug.add(txtNombreBug);
		
		final JButton btnAceptar = new JButton("Aceptar");
		/*btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (modo=Agrega) {
						int btnPregunta = JOptionPane.showConfirmDialog(null,
								"¿Desea agregar este Bug?");
						if (btnPregunta == JOptionPane.YES_OPTION) {
							Bug.altaBug(nombreTask, descripcionTask, complejidad, dependencias, historicoEstado, subtareas, fechaFinalizacion,
									subtarea);
							if (modelBug == null)
								modelBug = new DefaultListModel<String>();
							modelBug.addElement(tfAltaBug.getText());
							JOptionPane.showMessageDialog(null, "Bug añadido exitosamente",
									"Exito", JOptionPane.INFORMATION_MESSAGE, OK);
							jlistModifBug.setModel(modelBug);
							jlistBajaBug.setModel(modelBug);
						}
						else if (modo=Modifica){
							
						}
							
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "IMPORTANTE\nBug existente", "Importante",
						JOptionPane.WARNING_MESSAGE);
			}
					}
					
			}
		});*/
		btnAceptar.setBounds(300, 5, 78, 23);
		pnlNuevoBug.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(410, 5, 78, 23);
		pnlNuevoBug.add(btnCancelar);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("New tab", null, tabbedPane_1, null);
		tabbedPane_1.setSelectedIndex(1);
		
	}
}
