
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class VistaTabla extends JFrame{
    
    JButton btnRegistro;
    
    public VistaTabla(){
        configuracionInicial();
        inicializarComponentes();
        eventos();
    }
    
    private void configuracionInicial(){
        this.setTitle("Datos de los estudiantes");
        this.setSize(700,400);
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
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nota final");
        modelo.addRow(new Object[]{"1","Tobias",23,59});
        
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        
        scroll.setBounds(20,60,500,280);
        
        btnRegistro = new JButton("Registrar");
        btnRegistro.setFont(new Font("Arial",Font.PLAIN,20));
        btnRegistro.setBackground(Color.decode("#00B532"));
        btnRegistro.setFocusPainted(false);
        btnRegistro.setBounds(535,60,130,30);
        
        panel.add(scroll);
        panel.add(btnRegistro);
        this.add(panel);
    }
    
    private void eventos(){
        btnRegistro.addActionListener(e ->{
            abrirFormulario();
        });
    }
    
    private void abrirFormulario(){
        VistaFormulario form = new VistaFormulario();
        form.setVisible(true);
    }
    
}
