package isekai;  

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

import static org.junit.Assert.*;
import java.util.List;

public class isekaiSteps {

	private HiddenPower power;
	
	@Given("(.*) veut avoir un harem")  
	public void romeo_who_wants_to_buy_a_drink(String romain) {  
		power = new HiddenPower();  
		power.declareOwner(romain);  
	}
	
	@When("la jeune dark elfe loli, (.*), l'aide à avoir du pouvoir.")  
	public void an_order_is_declared_for_Juliette(String Emma) {  
		power.declareTarget(Emma);  
	}
	
	@Then("elle propose à (.*) de boire son jus d'amour pour le rendre plus fort.")
	public void there_is_nb_cocktails_in_the_order(String romain) {
		power = new HiddenPower();  
		power.declareOwner(romain);
	} 
	
	@When("elle donne son jus d'amour à (.*)")
	public void a_message_saying_is_added(String something) {
		power.declareOwner(something);
	}
	
	@When("il répond \"([^\"]*)\" sah quel plaisir")
	public void il_repond_sah_quel_plaisir(String something) {
		power.withMessage(something);
	}
	
	@Then("il boit goulument son jus et hurle de toute ses forces \"([^\"]*)\"")
	public void the_ticket_must_say(String somethingElse) {
		assertEquals(somethingElse, power.getTicketMessage());
	}
}