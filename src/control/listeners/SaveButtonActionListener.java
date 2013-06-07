package control.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BeansFactory;
import model.IAddressList;


public class SaveButtonActionListener implements ActionListener {
	
	public SaveButtonActionListener(){
		super();
	}
	
	// Save the addressList-model through
	// writing it out into a file
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("ACTION: clicked to save data to disk, serializing data...");
		((IAddressList) BeansFactory.getBean("AddressList")).saveAll();
	}

}
