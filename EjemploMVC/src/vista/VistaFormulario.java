/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author PC
 */
public class VistaFormulario extends JFrame{
    
    private JTextField nombre;
    private JTextField edad;
    private JTextField nota;
    private JButton btnAgregar;
    private JButton btnCancelar;
    
    public VistaFormulario(){
        configuracionInicial();
        inicializarComponentes();
        eventos();
    }
    
    private void configuracionInicial(){
        this.setTitle("Formulario de registro");
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    private void inicializarComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel titulo = new JLabel("Registro de Estudiantes");
        titulo.setFont(new Font("Arial",Font.PLAIN,20));
        titulo.setBounds(70,20,250,25);
        
        JLabel txtNombre = new JLabel("Nombre:");
        txtNombre.setFont(new Font("Arial",Font.PLAIN,20));
        JLabel txtEdad = new JLabel("Edad:");
        txtEdad.setFont(new Font("Arial",Font.PLAIN,20));
        JLabel txtNota = new JLabel("Nota:");
        txtNota.setFont(new Font("Arial",Font.PLAIN,20));
        
        txtNombre.setBounds(20,55,100,25);
        txtEdad.setBounds(20,100,100,25);
        txtNota.setBounds(20,145,100,25);
        
        nombre = new JTextField();
        nombre.setFont(new Font("Arial",Font.PLAIN,20));
        edad = new JTextField();
        edad.setFont(new Font("Arial",Font.PLAIN,20));
        nota = new JTextField();
        nota.setFont(new Font("Arial",Font.PLAIN,20));
        
        nombre.setBounds(110,55,250,25);
        edad.setBounds(110,100,250,25);
        nota.setBounds(110,145,250,25);
        
        btnAgregar = new JButton("Registrar"); 
        btnAgregar.setFont(new Font("Arial",Font.BOLD,20));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setBackground(Color.decode("#136BC2"));
        btnAgregar.setForeground(Color.decode("#D1AB15"));
        btnAgregar.setBounds(30,200,150,30);
        
        
                
        btnCancelar = new JButton("Cancelar"); 
        btnCancelar.setFont(new Font("Arial",Font.BOLD,20));
        btnCancelar.setFocusPainted(false);
        btnCancelar.setBackground(Color.decode("#D6360D"));
        btnCancelar.setForeground(Color.decode("#D1AB15"));
        btnCancelar.setBounds(200,200,150,30);
        
        panel.add(titulo);
        panel.add(txtNombre);
        panel.add(txtEdad);
        panel.add(txtNota);
        panel.add(nombre);
        panel.add(edad);
        panel.add(nota);
        panel.add(btnAgregar);
        panel.add(btnCancelar);
        this.add(panel);
    }
    
    private void eventos(){
        btnAgregar.addActionListener(e ->{
            try{
                String Nombre = nombre.getText();
                int Edad = Integer.parseInt(edad.getText());
                double Nota = Double.parseDouble(nota.getText());
                JOptionPane.showMessageDialog(this, "Se REGISTRO correctamente el esutdiante", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception r){
                JOptionPane.showMessageDialog(this, "Ocurrio un error al castear los datos", "ERROR DE CASTEO", JOptionPane.ERROR_MESSAGE);
                //System.out.println("Error al castear los valores");
            }
            
            nombre.setText("");
            edad.setText("");
            nota.setText("");
            
        });
        
        btnCancelar.addActionListener(e ->{
            dispose();
        });
    }
    
    
    
}
