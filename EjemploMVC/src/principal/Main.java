
package principal;

import Controlador.ControladorEstudiante;
import javax.swing.UIManager;
//import vistaDAD.Inicio;
import vista.Inicio;



public class Main {

   public static ControladorEstudiante controladorEstudiante;
    
    public static void main(String[] args) {
        
        ControladorEstudiante controladorEstudiante = new ControladorEstudiante(); // Controlador creado en el main
        
        /*
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            System.out.println("No se pudo cambiar el look and feel");
        }*/
        
        Inicio ventana = new Inicio(controladorEstudiante);
        ventana.setVisible(true);
        
        
        
        
        
        //---------------CON DRAG AND DROP--------------
        /*controladorEstudiante = new ControladorEstudiante();
        
        Inicio ventana = new Inicio();
        ventana.setVisible(true);*/
    }
    
}
