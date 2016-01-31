package DOM;

import java.io.Serializable;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hbm.Medico;
import util.HibernateUtil;

public class MedicoManagedBean implements Serializable
{

    private static final long serialVersionUID = 1L;
    private static Logger log = Logger.getLogger(MedicoManagedBean.class);
    private static final String SUCCESS = "success";
    private static final String ERROR   = "error";


    // public String save()
    // {
    //     String result = null;
    //     Session session = HibernateUtil.getSessionFactory().openSession();

    //     Medico medico = new Medico();
    //     medico.setTarifa(this.getTarifa());
    //     medico.setOrigen(this.getOrigen());
    //     medico.setDestino(this.getDestino());
    //     medico.setTransporte(this.getTransporte());
    //     medico.setHabilitado(true);

    //     Transaction tx = null;

    //     try
    //     {
    //         tx = session.beginTransaction();
    //         session.save(medico);
    //         tx.commit();
    //         log.debug("Nuevo registro : " + medico + ", realizado : " +
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

    public List<Medico> getMedicos()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Medico>  medicoList = session.createCriteria(Medico.class).list();
        return medicoList;
    }

    public void reset()
    {
    }




    private List<Medico> filteredMedicos;

    public List<Medico> getFilteredMedicos()
    {
        return filteredMedicos;
    }

    public void setFilteredMedicos(List<Medico> filteredMedicos)
    {
        this.filteredMedicos = filteredMedicos;
    }



    public Medico getMedicoByID(String id)
    {
        List<Medico> medicos = getMedicos();

        for (Medico medico : medicos)
        {
            if (medico.getId() == Integer.parseInt(id))
            {
                return medico;
            }
        }

        return null;
    }
}
