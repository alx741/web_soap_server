package DOM;

import java.io.Serializable;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hbm.Paciente;
import util.HibernateUtil;

public class PacienteManagedBean implements Serializable
{

    private static final long serialVersionUID = 1L;
    private static Logger log = Logger.getLogger(PacienteManagedBean.class);
    private static final String SUCCESS = "success";
    private static final String ERROR   = "error";


    // public String save()
    // {
    //     String result = null;
    //     Session session = HibernateUtil.getSessionFactory().openSession();

    //     Paciente paciente = new Paciente();
    //     paciente.setTarifa(this.getTarifa());
    //     paciente.setOrigen(this.getOrigen());
    //     paciente.setDestino(this.getDestino());
    //     paciente.setTransporte(this.getTransporte());
    //     paciente.setHabilitado(true);

    //     Transaction tx = null;

    //     try
    //     {
    //         tx = session.beginTransaction();
    //         session.save(paciente);
    //         tx.commit();
    //         log.debug("Nuevo registro : " + paciente + ", realizado : " +
    //                   tx.wasCommitted());
    //         result = SUCCESS;
    //     }
    //     catch (Exception e)
    //     {
    //         if (tx != null)
    //         {
    //             tx.rollback();
    //             result = ERROR;
    //             e.printStackTrace();
    //         }
    //     }
    //     finally
    //     {
    //         session.close();
    //     }
    //     return result;
    // }

    public List<Paciente> getPacientes()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Paciente>  pacienteList = session.createCriteria(Paciente.class).list();
        return pacienteList;
    }

    public void reset()
    {
    }




    private List<Paciente> filteredPacientes;

    public List<Paciente> getFilteredPacientes()
    {
        return filteredPacientes;
    }

    public void setFilteredPacientes(List<Paciente> filteredPacientes)
    {
        this.filteredPacientes = filteredPacientes;
    }


    public Paciente getPacienteByID(String id)
    {
        List<Paciente> pacientes = getPacientes();

        for (Paciente paciente : pacientes)
        {
            if (paciente.getId() == Integer.parseInt(id))
            {
                return paciente;
            }
        }

        return null;
    }
}
