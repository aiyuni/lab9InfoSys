/*package lab9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named("supplierController")
@RequestScoped
public class SupplierController implements Serializable {
 
	
	private Supplier supplier = new Supplier();
 
	List<Supplier> supplierList = new ArrayList<Supplier>();
	
	@EJB
	private SupplierService service;
 
	public Supplier getSupplier() {
		return supplier;
	}
	
   public List<Supplier> getSupplierList() {
        if (supplierList == null) {
            refreshList();
        }
        return supplierList;
    }
   
   public void setSupplierList(List<Supplier> list) {
	   this.supplierList = list;
   }
 
 private void refreshList() {
	 for (int i = 0; i < service.getAllSuppliers().size(); i++) {
		 supplierList.add(service.getAllSuppliers().get(i));
	 }
 } 
 
 
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
 
	public void saveSupplier(Supplier emp) {
		
		Supplier newSupplier = new Supplier(emp);

		service.addSupplier(newSupplier);
		supplierList.add(newSupplier);
	}
	
	public void removeSupplier(Supplier emp) {
		service.removeSupplier(emp);
		supplierList.remove(emp);
	}
	
	public List<Supplier> getAllSuppliers() {
		supplierList = service.getAllSuppliers();
		return service.getAllSuppliers();
	}
	
	public void updateSupplier() {
		for(Supplier e : supplierList) {
			service.merge(e);
		}
	}
 
}
*/