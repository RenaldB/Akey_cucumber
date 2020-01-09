package dojo;  

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

import static org.junit.Assert.*;
import java.util.List;

public class CocktailSteps {

	private Order order;
	
	@Given("(.*) who wants to buy a drink")  
	public void romeo_who_wants_to_buy_a_drink(String romeo) {  
		order = new Order();  
		order.declareOwner(romeo);  
	}

	@When("an order is declared for (.*)")  
	public void an_order_is_declared_for_Juliette(String juliette) {  
		order.declareTarget(juliette);  
	}

	@Then("there is no cocktail in the order")
	public void there_is_no_cocktail_in_the_order() {
		List<String> cocktails =  order.getCocktails();
		assertEquals(0, cocktails.size());
	}
}