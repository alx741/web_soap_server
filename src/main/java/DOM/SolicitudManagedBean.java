package DOM;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Date;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import hbm.Solicitud;
import hbm.Factura;
import util.HibernateUtil;

public class SolicitudManagedBean implements Serializable
{

    private static final long serialVersionUID = 1L;
    private static Logger log = Logger.getLogger(SolicitudManagedBean.class);
    private static final String SUCCESS = "success";
    private static final String ERROR   = "error";

    private int id;
    private String cedula;
    private String paquete;
    private Date fecha;
    private String comentario;
    private String aprobadoS;
    private boolean aprobado;

    private Solicitud solicitudO;

    public Solicitud getSolicitudO()
    {
        return this.solicitudO;
    }

    public void setSolicitudO(Solicitud solicitudO)
    {
        this.solicitudO = solicitudO;
    }

    public String getComentario()
    {
        return this.comentario;
    }

    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }

    public String getAprobadoS()
    {
        return this.aprobadoS;
    }

    public void setAprobadoS(String aprobadoS)
    {
        this.aprobadoS = aprobadoS;
    }



    public List<Solicitud> getSolicitudes()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Solicitud>  solicitudList = session.createCriteria(Solicitud.class).list();
        return solicitudList;
    }

    public void reset()
    {
    }

    public void save()
    {
        
    }
}
