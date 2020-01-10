package isekai;

import java.util.ArrayList;
import java.util.List;

public class HiddenPower {
	private String from;
	private String message;
	private String to;
	private List<String> contents = new ArrayList<String>();
	
	public void declareOwner(String romain) {
        this.from = romain ;
    }
	public void withMessage(String something) {
		// TODO Auto-generated method stub
		this.message = something;
	}
	public void declareTarget(String Emma) {
        this.to = Emma ;
    }
	public List<String> getCocktails() {
        return contents;
    }
	public Object getTicketMessage() {
		// TODO Auto-generated method stub
		return message + " !!";
	}
}
