package control.listener.command;


import model.BeansFactory;
import model.IAbstractAddress;
import model.IAddressList;

public class AddCommand extends AbstractCommand {
	
	public AddCommand(final IAbstractAddress adr){
		super(adr);
	}

	@Override
	public void undo() {
		System.out.println("ADD_COMMAND: undoing...");
		((IAddressList) BeansFactory.getBean("AddressList")).remove(address);
	}

	@Override
	public void execute() {
		System.out.println("ADD_COMMAND: executing...");
		((IAddressList) BeansFactory.getBean("AddressList")).add(address);
	}

}
