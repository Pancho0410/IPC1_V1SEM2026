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
public class Editar extends JFrame{
    private VistaTabla tabla;
    private JTextField nombre;
    private JTextField edad;
    private JTextField nota;
    private JButton btnModificar;
    private JButton btnCancelar;
    private int id;
    
    public Editar(VistaTabla tabla, int id){
        this.tabla = tabla;
        this.id = id;
        configuracionIncial();
        inicializarComponentes();
        eventos();
        
        tabla.controladorE.llenarFormulario(nombre, edad, nota, id);
    }
    
    private void configuracionIncial(){
        this.setTitle("Editar Estudiante");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
    }
    
    private void inicializarComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel titulo = new JLabel("Modificacion de Estudiante");
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
        
        btnModificar = new JButton("Modificar"); 
        btnModificar.setFont(new Font("Arial",Font.BOLD,20));
        btnModificar.setFocusPainted(false);
        btnModificar.setBackground(Color.decode("#136BC2"));
        btnModificar.setForeground(Color.decode("#D1AB15"));
        btnModificar.setBounds(30,200,150,30);
        
        
                
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
        panel.add(btnModificar);
        panel.add(btnCancelar);
        this.add(panel);
    }
    
    private void eventos(){
        btnModificar.addActionListener(e ->{
            if(nombre.getText().equals("") || edad.getText().equals("") || nota.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "FALTAN DATOS", JOptionPane.WARNING_MESSAGE);
               return;
            }
            
            try{
                String Nombre = nombre.getText();
                int Edad = Integer.parseInt(edad.getText());
                double Nota = Double.parseDouble(nota.getText());
                tabla.controladorE.ModificarEstudiante(id,Nombre, Edad, Nota);
                tabla.llenarTabla();
                JOptionPane.showMessageDialog(this, "Se MODIFICO correctamente el esutudiante", "MODIFICACION EXITOSA", JOptionPane.INFORMATION_MESSAGE);
                tabla.setVisible(true);
                dispose();
            }catch(Exception r){
                JOptionPane.showMessageDialog(this, "Ocurrio un error al castear los datos", "ERROR DE CASTEO", JOptionPane.ERROR_MESSAGE);
                //System.out.println("Error al castear los valores");
            }
            
            
        });
        
        btnCancelar.addActionListener(e ->{
            tabla.setVisible(true);
            dispose();
        });
    }
    
}
