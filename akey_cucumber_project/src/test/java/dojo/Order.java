package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
		private String message;
		private String from;
        private String to;
        private List<String> contents = new ArrayList<String>();

        public void declareOwner(String romeo) {
            this.from = romeo ;
        }

        public void declareTarget(String juliette) {
            this.to = juliette ;
        }

	public List<String> getCocktails() {
            return contents;
        }

	public void withMessage(String something) {
		// TODO Auto-generated method stub
		this.message = something;
	}

	public Object getTicketMessage() {
		// TODO Auto-generated method stub
		return "From " + from + " to " + to + ": " + message;
	}
}