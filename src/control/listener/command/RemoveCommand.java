package control.listener.command;

import model.BeansFactory;
import model.IAbstractAddress;
import model.IAddressList;

public class RemoveCommand extends AbstractCommand {
	
	public RemoveCommand(IAbstractAddress adr){
		super(adr);
	}

	@Override
	public void undo() {
		System.out.println("REMOVE_COMMAND: undoing...");
		((IAddressList) BeansFactory.getBean("AddressList")).add(address);
	}

	@Override
	public void execute() {
		System.out.println("REMOVE_COMMAND: executing...");
		((IAddressList) BeansFactory.getBean("AddressList")).remove(address);
	}

}
