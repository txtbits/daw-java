import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import  javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AbrirArchivo4 extends JFrame implements ActionListener{

	JFileChooser jfcArchivo;
    JButton jbExaminar;
    JButton jbLlenarTabla;
    JPanel jPanel1;
    JTextField jtfEntrada;
	JFrame ventana;
    
	DefaultTableModel tablaModel;
	JTable tabla;
	JScrollPane scrolPanel;
	JPanel jPanel2;
	
    public AbrirArchivo4() {
       
		iniciarGUI();
	}

   private void iniciarGUI() {
	    ventana = new JFrame("Abrir archivo");
	    setTitle("JTABLE");
		
		ventana.setSize(new Dimension(600,550));
		setResizable(false);
		jfcArchivo = new JFileChooser();
        jPanel1 = new  JPanel();
        jtfEntrada = new  JTextField();
        jbExaminar = new  JButton();
        jbLlenarTabla = new  JButton();
       
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder( BorderFactory.createTitledBorder("Archivo seleccionado "));
        jPanel1.setLayout(null);
        jPanel1.add(jtfEntrada);
        jtfEntrada.setBounds(20, 30, 350, 19);

        jbExaminar.setText("...");
        jbExaminar.setBounds(400, 30, 50, 25);
        jbExaminar.addActionListener(this);
        jPanel1.add(jbExaminar);
        
        jbLlenarTabla.setText("Llenar tabla");
        jbLlenarTabla.setBounds(455, 30, 115, 25);
        jbLlenarTabla.addActionListener(this);
        jPanel1.add(jbLlenarTabla);
       
        ventana.getContentPane().add(jPanel1, BorderLayout.CENTER);
        ventana.setVisible(true);
        jPanel1.setBounds(30, 30, 550, 60);

  
        tabla = new JTable();
        scrolPanel= new JScrollPane();
        //Llenamos el modelo
        tablaModel = new DefaultTableModel(null,getColumnas());

        tabla.setModel(tablaModel);
        scrolPanel.add(tabla);
       
        scrolPanel.setViewportView(tabla);

        ventana.getContentPane().add(scrolPanel, BorderLayout.SOUTH);
        ventana.setVisible(true);
   }      
      
   private String[] getColumnas()
   {
         
	   //en vez de inicializarlo con estos valores, para que nos sirviera para cualquier 
	   //archivo tendríamos que leer la cabecera (primera línea del fichero) y crear el array 
	   //con la cabecera.
	   String columna[]=new String[]{"Clasificacion","Equipos","PJ", "PG", "PE", "Puntos"};
       return columna;
   }

 
   
   public void actionPerformed (ActionEvent e) {
	   
	   int seleccion;
	   
	  //con el getActionCommand recogemos cual es el control que genera el evento
	   if (e.getActionCommand().equals("...") ){  
	   
		   seleccion=jfcArchivo.showOpenDialog(jtfEntrada);//podemos pasarle null, pero si le pasamos una ventana o 
	   															   //un componente de una ventana, mostrará siempre por encima
	   															   //de dicha ventana o componente.
	   															   //En selección guardamos si se ha pulsado aceptar o cancelar
	   
		   if (seleccion==JFileChooser.APPROVE_OPTION){ //pulsamos aceptar en el dialog
			   jtfEntrada.setText(jfcArchivo.getSelectedFile().getPath());
		   }
		   else {
			   jtfEntrada.setText("");
		   }      
	   
	   	}
	   
	   else{
		  		   
		   manipularArchivo();
	   }
   }
    
   
   /**
    * Abre el archivo elegido, lo recorre y lo trocea separandolo por ; y metiendo los datos en un array
    */
  
   public void manipularArchivo(){
		
		File archivo = new File(jtfEntrada.getText());
		FileReader fr = null;
		
		try  {
			fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
		
			String linea;  // para almacenar las líneas que leemos
			String datos[]; // línea troceada
			
			int nlinea = 0;
			while((linea = br.readLine()) != null){
				if (nlinea!=0){
				datos = linea.split(";");
				tablaModel.addRow(datos);
				
				}
				nlinea++;
			}
		}
		catch (IOException e) {
			
			jtfEntrada.setText("No se puede leer el archivo");
			}	
		finally{
			if (fr != null){
				try {
					fr.close();
				} catch (IOException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}  // finally
   }
   
   
  
   public static void main(String args[]) {
             AbrirArchivo4 ventana= new AbrirArchivo4();
             	}

	
}