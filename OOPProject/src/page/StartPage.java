package page;

import create.Create;

public class StartPage {
	
	private Create create;
	
	public StartPage() {
		create = new Create();
		create.getstartPanel().add(create.getstartButton());
		create.getstartPanel().add(create.getcreditButton());	
		create.getFrame().setContentPane(create.getstartPanel());
	}
}
