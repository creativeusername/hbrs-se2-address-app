package model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

// AddressList is just an subclass of an LinkedList<Address>
public class AddressList extends Observable implements Serializable, Iterable<AbstractAddress> {
	private static final long serialVersionUID = -8436170099085318899L;
	
	private LinkedList<AbstractAddress> addressList = new LinkedList<AbstractAddress>();
	
	public AddressList(){
		System.out.println("constructing AddressList");
	}

	@Override
	public Iterator<AbstractAddress> iterator() {
		return addressList.iterator();
	}

	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		System.out.println("AL: notifying observers");
//		System.out.println(addressList.toString());
		setChanged();
		super.notifyObservers();
	}
	
	public boolean add(AbstractAddress e){
		System.out.println("AL: adding address " + e.toString());
		boolean result = addressList.add(e);
		notifyObservers();
		return result;		
	}

	public LinkedList<AbstractAddress> getAddressList() {
		return addressList;
	}
	
	
	
	
}
