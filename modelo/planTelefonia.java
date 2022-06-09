package modelo;
public class planTelefonia 
{
    //--------------
    //Atributos
    //--------------
    private long numeroCelular;
    private int cantidadMinutos;
    private int costoMinutos;
    private String operador;

    //--------------
    //Metodos
    //--------------

    //Constructor por defecto
    public planTelefonia()
    {
        numeroCelular= 1;
        cantidadMinutos= 1;
        costoMinutos=1;
        operador= "";
    }

    //Contructor Común u Ordinario 
    public planTelefonia( long num, int min, int costo, String ope)
    {
        this.numeroCelular = num;
        this.cantidadMinutos = min;
        this.costoMinutos= costo;
        this.operador= ope;
    }

    //Constructor de copia
    public planTelefonia(planTelefonia f)
    {
        numeroCelular = f.numeroCelular;
        cantidadMinutos = f.cantidadMinutos;
        costoMinutos = f.costoMinutos;
        operador = f.operador;
    }

    // Metodos de acceso
    public long getNumeroCelular()
    {
        return numeroCelular;
    }
    public void setNumeroCelular(long numeroCelular)
    {
        this.numeroCelular= numeroCelular;
    }
    public int getCantidadMinutos()
    {
        return cantidadMinutos;
    }
    public void setCantidadMinutos(int cantidadMinutos)
    {
        this.cantidadMinutos= cantidadMinutos;
    }
    public int getCostoMinutos()
    {
        return costoMinutos;
    }
    public void setCostoMinuto(int costoMinutos)
    {
        this.costoMinutos= costoMinutos;
    }
    public String getOperador()
    {
        return operador;
    }
    public void setOperador(String operador)
    {
        this.operador= operador;
    }
    public String toString()
    {
        return numeroCelular +"/" +  calcularPlan(); 
    }

    //saber el costo del plan
    public Double calcularPlan()
    {
        
        double x= costoMinutos*cantidadMinutos;
        if (operador.equals("Movilujo"))
        {
          x = x - x*0.5;
        }
        return x;

    }
}