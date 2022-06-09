package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------
    // Atributos
    //----------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    //----------
    // Metodos
    //----------

    /*Método constructor*/
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        // Crear y agregar el PanelEntrada
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,575,200);
        this.add(miPanelEntradaDatos);

        // Crear y agregar el PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,210,575,110);
        this.add(miPanelOperaciones);

        // Crear y agregar el PanelEntrada
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,320,575,170);
        this.add(miPanelResultados);


        // Caracteristicas de la ventana
        this.setTitle("Plan Telefonia");
        this.setSize(600,520);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
