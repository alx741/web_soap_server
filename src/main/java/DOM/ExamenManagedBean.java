package DOM;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import hbm.Medico;
import hbm.Paciente;
import hbm.Examen;
import util.HibernateUtil;

public class ExamenManagedBean implements Serializable
{

    private static final long serialVersionUID = 1L;
    private static Logger log = Logger.getLogger(ExamenManagedBean.class);
    private static final String SUCCESS = "success";
    private static final String ERROR   = "error";
    private MedicoManagedBean mmb = new MedicoManagedBean();
    private PacienteManagedBean pmb = new PacienteManagedBean();

    private Date fecha = null;
    private String medico;
    private String paciente;
    private String diagnostico = null;
    private String examen = null;

    private Medico medicoO = null;
    private Paciente pacienteO = null;

    private List<Examen> examenesMedico = new ArrayList<Examen>();
    private int valorMedico = 0;


    public Date getFecha()
    {
        return this.fecha;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
    public String getDiagnostico()
    {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico)
    {
        this.diagnostico = diagnostico;
    }

    public String getMedico()
    {
        return this.medico;
    }

    public void setMedico(String medico)
    {
        this.medico = medico;
    }

    public String getPaciente()
    {
        return this.paciente;
    }

    public void setPaciente(String paciente)
    {
        this.paciente = paciente;
    }

    public Medico getMedicoO()
    {
        return this.medicoO;
    }

    public void setMedicoO(Medico medicoO)
    {
        this.medicoO = medicoO;
    }

    public Paciente getPacienteO()
    {
        return this.pacienteO;
    }

    public void setPacienteO(Paciente pacienteO)
    {
        this.pacienteO = pacienteO;
    }

    public String getExamen()
    {
        return this.examen;
    }

    public void setExamen(String examen)
    {
        this.examen = examen;
    }

    public List<Examen> getExamenesMedico()
    {
        return this.examenesMedico;
    }

    public void setExamenesMedico(List<Examen> examenesMedico)
    {
        this.examenesMedico = examenesMedico;
    }

    public int getValorMedico()
    {
        return this.valorMedico;
    }

    public void setValorMedico(int valorMedico)
    {
        this.valorMedico = valorMedico;
    }









    public void save()
    {
        // Validacion
        if (this.getDiagnostico().equals("") || this.fecha == null ||
                this.medicoO == null || this.pacienteO == null)
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Todos los campos son obligatorios"));
            return;
        }



        this.setMedico(String.valueOf(this.getMedicoO().getId()));
        this.setPaciente(String.valueOf(this.getPacienteO().getId()));
        String result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();


        Medico medico = mmb.getMedicoByID(this.getMedico());
        Paciente paciente = pmb.getPacienteByID(this.getPaciente());

        Examen examen = new Examen();
        examen.setFecha(this.getFecha());
        // examen.setFecha(new Date());
        examen.setMedico(medico);
        examen.setPaciente(paciente);
        examen.setDiagnostico(this.getDiagnostico());
        examen.setExamen(this.getExamen());


        Transaction tx = null;

        try
        {
            tx = session.beginTransaction();
            session.save(examen);
            tx.commit();
            log.debug("Nuevo registro : " + examen + ", realizado : " + tx.wasCommitted());
            // result = SUCCESS;

            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Exito", "El examen fue guardado exitosamente"));
            this.reset();


        }
        catch (Exception e)
        {
            if (tx != null)
            {
                tx.rollback();
                // result = ERROR;
                e.printStackTrace();
            }
        }
        finally
        {
            session.close();
        }
        // return result;
    }


    public List<Examen> getExamenes()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Examen>  examenList = session.createCriteria(Examen.class).list();
        return examenList;
    }

    public void onMedicoChange()
    {
        this.setMedico(String.valueOf(this.getMedicoO().getId()));
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Examen>  examenList = session.createCriteria(Examen.class).list();
        List<Examen>  examenListMedico = new ArrayList<Examen>();

        for (Examen e : examenList)
        {
            if (String.valueOf(e.getMedico().getId()).equals(this.getMedico()))
            {
                examenListMedico.add(e);
                this.valorMedico += 15;
            }
        }

        this.setExamenesMedico(examenListMedico);
    }

    public void reset()
    {
        this.fecha = null;
        this.medicoO = null;
        this.pacienteO = null;
        this.diagnostico = "";
    }
}
