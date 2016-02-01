package hbm;

import java.util.Date;

import hbm.Medico;
import hbm.Paciente;

public class Examen
{
    private int id;
    private Date fecha;
    private Medico medico;
    private Paciente paciente;
    private String diagnostico;
    private String examen;


    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Date getFecha()
    {
        return this.fecha;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public Medico getMedico()
    {
        return this.medico;
    }

    public void setMedico(Medico medico)
    {
        this.medico = medico;
    }

    public Paciente getPaciente()
    {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente)
    {
        this.paciente = paciente;
    }

    public String getDiagnostico()
    {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico)
    {
        this.diagnostico = diagnostico;
    }

    public String getExamen()
    {
        return this.examen;
    }

    public void setExamen(String examen)
    {
        this.examen = examen;
    }
}
