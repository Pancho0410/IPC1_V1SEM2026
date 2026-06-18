
package vista;

import Controlador.ControladorEstudiante;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Inicio extends JFrame{
    private JButton btn;
    private ControladorEstudiante ce;
    
    public Inicio(ControladorEstudiante ce){    
        this.ce = ce;
        configuracionInicial();
        inicializacionComponentes();
        eventos();
    }
    
    private void configuracionInicial(){
        this.setTitle("Registro de estudiantes");
        this.setSize(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    private void inicializacionComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        Color miColor = new Color(245, 180, 39);
        panel.setBackground(Color.decode("#5D9E5D"));
        
        JLabel label = new JLabel("REGISTRO DE ESTUDIANTES");
        label.setFont(new Font("Arial",Font.BOLD,25));
        label.setBounds(65,30,400,20);
        
        btn = new JButton("INGRESAR");
        btn.setFont(new Font("Arial",Font.BOLD,25));
        btn.setBackground(Color.decode("#9E895D"));
        btn.setFocusPainted(false);
        btn.setBounds(150,75,200,30);
        
        panel.add(label);
        panel.add(btn);
        this.add(panel);
    }
    
    private void eventos(){
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //System.out.println("OPRIMIO EL BOTON");
                cerrarVentana();
            }
        });
    }
    
    private void cerrarVentana(){
        this.dispose();
        VistaTabla tbl = new VistaTabla(this.ce);
        tbl.setVisible(true);
    }
    
}
