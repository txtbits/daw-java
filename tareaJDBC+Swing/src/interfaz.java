import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class interfaz extends JFrame{
	
	JTextField textConsulta;
	JPanel panelBotones;
	JButton btnAceptar,btnCancelar;
	JTable tabla;
	DefaultTableModel modeloTabla;
	JScrollPane scrollPane;
	JPanel panelTabla;
	
	ConexionOracle co = new ConexionOracle();
	
	public interfaz() {
		super();
		// Tamaño de la ventana
		setSize(600, 300);
		// Operación de cierre por defecto
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// No permitimos que sea reescale
		setResizable(false);
		// JPanel principal
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new GridLayout(3,1));
		
		// Bloque de texto
		textConsulta = new JTextField(100);
		panel.add(textConsulta);
		
		// Panel de los botones y botones Aceptar (ejecutar consulta) y Cancelar (borrar consulta)
		panelBotones = new JPanel();
		//panelBotones.setLayout(new GridLayout(1, 2));
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(10, 10, 50, 50);
		eventoBtn(btnAceptar);	
		panelBotones.add(btnAceptar);
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 10, 50, 50);
		eventoBtn(btnCancelar);
		panelBotones.add(btnCancelar);
		panel.add(panelBotones);
		
		// Creamos la tabla el modelo y el scrollpane
		tabla = new JTable();
		scrollPane = new JScrollPane();
		// DefaultTableModel para no dejar el espacio vacio (queda horrible)
		modeloTabla = new DefaultTableModel(null, getColumnas());
		tabla.setModel(modeloTabla);
		scrollPane.add(tabla);
		scrollPane.setViewportView(tabla);
		panel.add(scrollPane);
	}
	
	public void eventoBtn (JButton accion){
		accion.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent evt){
				JButton btn = (JButton) evt.getSource();
				try {
					operacion(btn.getText());
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}				
			}
		});
	}
	
	public void operacion (String accion) throws ClassNotFoundException, SQLException{
		if (accion == "Aceptar"){
			// Recogemos y ejecutamos la consulta del objeto JTextField
			ResultSet rs = co.ejecutarconsulta(textConsulta.getText());
			
			// Obtenemos los metadatos
			ResultSetMetaData metaData = rs.getMetaData();
			
			// Almacenamos la cantidad de columnas que se obtienen de la consulta
			int cols = metaData.getColumnCount();
			
			// Almacenamos los nombres de las columnas en un Array de cadenas
            String[] columnNames = new String[cols];
            for (int i = 0; i < cols; i++) {
            	columnNames[i] = metaData.getColumnName(i + 1);
            }
            
            // Crear table con model con las columnas de la consulta
            modeloTabla = new DefaultTableModel(null, columnNames);
            	 
            // Extraemos los datos de la consulta por filas
            String[] datos = new String[cols]; 
		
			// Pasamos los datos de rs al array que nos hemos creado
            while(rs.next()){
                for (int i = 0; i < cols; i++){
                        if (rs.getNString(i+1)== null){
                                datos[i] = " ";
                        }
                        else{
                                datos[i] = rs.getNString(i+1);
                        }
                
                }
                // Introducimos los datos al DefaultTableModel
                modeloTabla.addRow(datos); 
            }
            // Metemos el DefaultTableModel en la tabla
            tabla.setModel(modeloTabla);
            
            // Añadimos la tabla en el scrollPane
            scrollPane.add(tabla); 
            
            // Actualizamos el scrollPane
            scrollPane.setViewportView(tabla); 
		}
		else {
			textConsulta.setText("");
		}
			
	}
	
	// Método que genera un Array de cadenas de ejemplo.
	private String[] getColumnas(){
		String columna[] = new String[]{"columna1", "columna2", "columna3","columna4", "columna5"};
		return columna;
	}

}
