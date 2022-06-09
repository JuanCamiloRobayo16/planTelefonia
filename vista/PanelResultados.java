package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel 
{
    //---------------
    // Atributos
    // --------------
    private JTextArea taResultado;
    private JScrollPane spResultado;
   
    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelResultados()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar area de texto 
        taResultado= new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,555,130);
        this.add(spResultado);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

    }
    // metodo de acceso a la informacion
    public void mostrarResultado(long num,  double calcularPlan, String Operador)
    {
        taResultado.setText("El Numero Del Celular Es: " + num + "\nEl Operador Es : " + Operador + "\nSu Costo De Llamada Fue De: " + calcularPlan);

    }

    // borrar resultados
    public void borrar()
    {
        taResultado.setText("");
    }  
    
}
