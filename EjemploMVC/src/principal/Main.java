
package principal;

import Controlador.ControladorEstudiante;
import javax.swing.UIManager;
import vista.Inicio;
import vista.Prueba;
import vista.VistaFormulario;

public class Main {

   
    public static void main(String[] args) {
        
        ControladorEstudiante controladorEstudiante = new ControladorEstudiante(); 
        /*
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            System.out.println("No se pudo cambiar el look and feel");
        }*/
        
        /*Inicio ventana = new Inicio(controladorEstudiante);
        ventana.setVisible(true);*/
        Prueba p = new Prueba();
        p.setVisible(true);
        
        /*VistaFormulario fm = new VistaFormulario();
        fm.setVisible(true);*/
    }
    
}
