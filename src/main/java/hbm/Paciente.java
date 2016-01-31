package hbm;

import java.util.Set;
import java.util.HashSet;

public class Paciente
{
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String email;
    private String procedencia;

    public Paciente()
    {}

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCedula()
    {
        return this.cedula;
    }

    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }

    public String getNombre()
    {
        return this.nombre;
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

    public int getEdad()
    {
        return this.edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getDireccion()
    {
        return this.direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getProcedencia()
    {
        return this.procedencia;
    }

    public void setProcedencia(String procedencia)
    {
        this.procedencia = procedencia;
    }
}
