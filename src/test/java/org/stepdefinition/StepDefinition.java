package org.stepdefinition;
import org.repository.Pom;
import org.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base {

@Given("user is in homepage")
public void user_is_in_homepage() {
     launch("https://www.volotea.com/");
     
 
}

@When("user fills source and destination")
public void user_fills_source_and_destination() throws Exception {
	Pom p=new Pom();
	jexecuter(p.getTrip());
	search(p.getSource(),readValues().get(0).get("Source"));
	search(p.getDest(),readValues().get(2).get("Destination"));
	
    
   
}

@Then("list of flights should be shown")
public void list_of_flights_should_be_shown() {
  
    System.out.println("success");
}
	

}
