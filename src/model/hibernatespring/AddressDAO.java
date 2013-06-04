package model.hibernatespring;

import java.util.LinkedList;
import model.IAbstractAddress;
import org.hibernate.*;

public class AddressDAO {
	
	private Session session;
	
	public void setSessionFatory(SessionFactory sessionfactory){
		session = sessionfactory.openSession();
	}
	
	public void saveAddress(IAbstractAddress address){
		session.saveOrUpdate(address);
	}
	
	@SuppressWarnings("unchecked")
	public LinkedList<IAbstractAddress> find(){
		Query queryObject = session.createQuery("from model.hibernatespring.AbstractAddress");
		return new LinkedList<IAbstractAddress>(queryObject.list());
	}
	

}
