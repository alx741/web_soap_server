package hbm;

import java.util.Set;
import java.util.Date;
import java.util.HashSet;

public class Solicitud
{
    private int id;
    private String cedula;
    private String paquete;
    private Date fecha;
    private String comentario;
    private boolean aprobado;

    public Solicitud()
    {}

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
        return cedula;
    }

    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }

    public String getPaquete()
    {
        return paquete;
    }

    public void setPaquete(String paquete)
    {
        this.paquete = paquete;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public String getComentario()
    {
        return comentario;
    }

    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }

    public boolean getAprobado()
    {
        return aprobado;
    }

    public void setAprobado(boolean aprobado)
    {
        this.aprobado = aprobado;
    }
}
