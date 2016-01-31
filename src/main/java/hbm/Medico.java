package hbm;

public class Medico
{
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;

    public Medico() {}


    public int getId()
    {
        return this.id;
    }

    private void setId(int id)
    {
        this.id = id;
    }

    public String getCedula()
    {
        return this.cedula;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return this.apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
}
