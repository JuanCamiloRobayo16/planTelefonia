package ejecutable;

import controlador.Controlador;
import modelo.planTelefonia;
import vista.VentanaPrincipal;

public class test 
{
    
    public static void main (String[] args)
    {
       VentanaPrincipal miVentana= new VentanaPrincipal();
       planTelefonia miModelo = new planTelefonia(0,0,0,"");  
       Controlador miControlador = new Controlador(miVentana,miModelo);

    }
}
