package control.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JList;

import model.AbstractAddress;
import model.EmailOnlyAddress;
import model.PostalAddress;
import view.AbstractAddressView;
import view.AddressListView;
import view.EmailOnlyAddressView;
import view.PostalAddressView;

public class DoubleClickListener extends MouseAdapter {
	
	private AddressListView alv;
	
	public DoubleClickListener(AddressListView alv){
		this.alv = alv;
		
	}

	public void mouseClicked(MouseEvent e) {
	    if (e.getClickCount() == 2) {
	       int index = ((JList) e.getSource()).locationToIndex(e.getPoint());
	        if (index == -1)
	             System.out.println("Sie haben nichts ausgewählt.");
	        else {
	        	 System.out.println("ACTION: selected address via mouse...");
	             AbstractAddress address = (AbstractAddress) ((JList) e.getSource()).getSelectedValue();
	             // Ihr Code
	             if ( address instanceof EmailOnlyAddress)
	            	 new EmailOnlyAddressView(alv, (EmailOnlyAddress)address);
	             
	             else if ( address instanceof PostalAddress)
	            	 new PostalAddressView(alv, (PostalAddress)address);
	             else
	            	 System.out.println("No such AddressType");
	        }
	    }
	  }

}
