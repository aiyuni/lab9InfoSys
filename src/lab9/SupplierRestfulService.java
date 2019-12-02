package lab9;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;


//@RequestScoped
@Path("/myRestService")
@ApplicationPath("/resources")
public class SupplierRestfulService extends Application {
    
	
	/*@Inject
	private EntityManager em; */
	 
	public SupplierRestfulService() {
		
	}
	
	@GET
	@Path("/sayHello")
	public String sayingHello() {
		return "hi world";
	}
	
	@GET
	@Path("/echo")
	public Response getEchoMsg(@QueryParam("message") String msg) {
		return Response.ok("200").build();
	}
	
	/*@GET
	@Path("/getSupplierList")
	public List<Supplier> getSupplierList() {
		em = Resource.getEntityManager();
		TypedQuery<Supplier> query = em.createQuery("select s from Supplier s order by supplierid",
                Supplier.class);
        System.out.println("allgood");
        java.util.List<Supplier> suppliers = query.getResultList();
        return suppliers;
	}
	
 /*  public List<Supplier> getAll() {     
        TypedQuery<Supplier> query = em.createQuery("select s from Supplier s order by supplierid",
                Supplier.class);
        System.out.println("allgood");
        java.util.List<Supplier> suppliers = query.getResultList();
        return suppliers;
    } */
	   
}
