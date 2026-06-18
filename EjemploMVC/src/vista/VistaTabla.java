
package vista;

import Controlador.ControladorEstudiante;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class VistaTabla extends JFrame{
    
    private JButton btnRegistro;
    private JButton btnArchivo;
    private JTable tabla;
    public DefaultTableModel modelo; 
    public ControladorEstudiante controladorE;
    
    public VistaTabla(ControladorEstudiante ce){
        this.controladorE = ce;
        configuracionInicial();
        inicializarComponentes();
        eventos();
        llenarTabla();
    }
    
    private void configuracionInicial(){
        this.setTitle("Datos de los estudiantes");
        this.setSize(760,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    private void inicializarComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel titulo = new JLabel("DATOS DE LOS ESTUDIANTES");
        titulo.setFont(new Font("Arial",Font.PLAIN,25));
        titulo.setBounds(50,20,450,30);
        panel.add(titulo);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nota final");
        modelo.addColumn("Accion");
        //modelo.addRow(new Object[]{"1","Tobias",23,59,"Editar"});
        
        tabla = new JTable(modelo);
        tabla.setRowHeight(25);
        tabla.setGridColor(Color.blue);  //Los bordes
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getTableHeader().setBackground(Color.cyan);
        tabla.getTableHeader().setFont(new Font("Arial",Font.PLAIN,15));
        
        DefaultTableCellRenderer general = new DefaultTableCellRenderer();
        general.setHorizontalAlignment(SwingConstants.CENTER);
        
        DefaultTableCellRenderer columnaEditar = new DefaultTableCellRenderer();
        columnaEditar.setHorizontalAlignment(SwingConstants.CENTER);
        columnaEditar.setBackground(Color.decode("#C27B6B"));
        //columnaEditar.setForeground(Color.decode("#59BA1C"));
        
        for(int i = 0; i< tabla.getColumnCount();i++){
            tabla.getColumnModel().getColumn(i).setCellRenderer((i!=4) ? general : columnaEditar);
        }
        
        JScrollPane scroll = new JScrollPane(tabla);
        
        scroll.setBounds(20,60,500,280);
        
        btnArchivo = new JButton("Carga Masiva");
        btnArchivo.setFont(new Font("Arial",Font.PLAIN,20));
        btnArchivo.setBackground(Color.decode("#00B532"));
        btnArchivo.setFocusPainted(false);
        btnArchivo.setBounds(535,60,190,30);
        
        btnRegistro = new JButton("Registrar");
        btnRegistro.setFont(new Font("Arial",Font.PLAIN,20));
        btnRegistro.setBackground(Color.decode("#00B532"));
        btnRegistro.setFocusPainted(false);
        btnRegistro.setBounds(535,110,190,30);
        
        panel.add(scroll);
        panel.add(btnArchivo);
        panel.add(btnRegistro);
        this.add(panel);
    }
    
    private void eventos(){
        btnRegistro.addActionListener(e ->{
            abrirFormulario();
        });
        
        btnArchivo.addActionListener(e ->{
            LookAndFeel actual = UIManager.getLookAndFeel();
            
            try{
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }catch(Exception lk){
                System.out.println("No se pudo cambiar el look and feel");
            }
            
            JFileChooser fl = new JFileChooser();
            
            try{
                UIManager.setLookAndFeel(actual);
            }catch(Exception lk){
                System.out.println("No se pudo cambiar el look and feel");
            }
            
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .csv","csv");
            fl.setFileFilter(filtro);
            int resultado = fl.showOpenDialog(null);
            
            if(resultado == JFileChooser.APPROVE_OPTION){
                File archivo = fl.getSelectedFile();
                this.controladorE.cargaMasiva(archivo);
                llenarTabla();
                //System.out.println(archivo.getAbsolutePath());
            }
        });
    }
    
    private void abrirFormulario(){
        VistaFormulario form = new VistaFormulario(this);
        form.setVisible(true);
    }
    
    public void llenarTabla(){
        controladorE.LlenarTabla(modelo);
    }
    
}
