package model.hibernatespring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import model.IAbstractAddress;
import model.IEmailOnlyAddress;

@Entity
@Table (name = "EMAILADDRESS")
public class EmailOnlyAddress extends AbstractAddress implements IEmailOnlyAddress {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4246166081727039473L;
	private int ID;
	
	public EmailOnlyAddress(){
		super();
		System.out.println("EOA: constructing...");		
	}
	
	@Id
	@GeneratedValue
	@Column (name = "ID")
	public int getID(){
		return ID;
	}
	
	public void setID(int id){
		ID = id;
	}

	@Override
	public void changeTo(IAbstractAddress newData) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
