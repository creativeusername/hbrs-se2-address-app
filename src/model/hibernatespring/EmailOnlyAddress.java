package model.hibernatespring;

import javax.persistence.Entity;
import javax.persistence.Table;

import model.IAbstractAddress;
import model.IEmailOnlyAddress;

@Entity
@Table (name = "EmailAddress")
public class EmailOnlyAddress extends AbstractAddress implements IEmailOnlyAddress {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4246166081727039473L;

	public EmailOnlyAddress(){
		super();
		System.out.println("EOA: constructing...");		
	}

	@Override
	public void changeTo(IAbstractAddress newData) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
