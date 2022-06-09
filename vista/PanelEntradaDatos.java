package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------
    // Atributos
    // --------------
    private JLabel lx;
    private JLabel ly;
    private JLabel lz;
    private JLabel lo;
    private JTextField tfx;
    private JTextField tfy;
    private JTextField tfz;
    private JComboBox cbOperador;
    private String[] operadores = {"Movilujo", "Movistar", "Claro", "Tigo","Virgin"};
    private JLabel lImagen;
    private ImageIcon iImagen;


    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelEntradaDatos()
    {   
        
        //crear y agregar imagen
        iImagen = new ImageIcon(getClass().getResource("Llamada.png"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(10,20,160,160);
        this.add(lImagen);

        // crear y agregar etiqueta Numero
        lx = new JLabel("Numero : ");
        lx.setBounds(200, 20, 140, 20);
        this.add(lx);

        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //crear caja de texto Numero
        tfx = new JTextField();
        tfx.setBounds(280,20,80,20);
        this.add(tfx);

        // crear y agregar etiqueta Operador
        lo = new JLabel("Operador : ");
        lo.setBounds(200, 70, 140, 20);
        this.add(lo);

        // crear y agregar ComboBox
        cbOperador = new JComboBox();
        for(int i=0; i<operadores.length;i++)
        {
            cbOperador.addItem(operadores[i]);
        }
        cbOperador.setBounds(280,70,80,20);
        this.add(cbOperador);

       
        // crear y agregar etiqueta Minuto
        ly = new JLabel("Minuto : ");
        ly.setBounds(200, 120, 120, 20);
        this.add(ly);

        //crear caja de texto Minuto
        tfy = new JTextField();
        tfy.setBounds(280,120,80,20);
        this.add(tfy);

        // crear y agregar etiqueta Valor Minuto
        lz = new JLabel("Valor Minuto : ");
        lz.setBounds(200, 170, 120, 20);
        this.add(lz);

        //crear caja de texto Valor Minuto
        tfz = new JTextField();
        tfz.setBounds(280,170,80,20);
        this.add(tfz);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // metodos de acceso a la informacion 
    public String getTfx()
    {
        return tfx.getText();
    }

    public String getTfy()
    {
        return tfy.getText();
    }
    public String getTfz()
    {
        return tfz.getText();
    }
    public String getOperador()
    {
        return (String) cbOperador.getSelectedItem();
    }
    // metodo borrar cajas de texto
    public void borrar()
    {
        tfx.setText("");
        tfy.setText("");
        tfz.setText("");
        
    }
    
}
