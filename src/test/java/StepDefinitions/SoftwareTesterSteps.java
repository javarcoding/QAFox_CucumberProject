package StepDefinitions;

import io.cucumber.java.en.*;

public class SoftwareTesterSteps {

	@Given("I am a good software tester")
	public void i_am_a_good_software_tester() {
		System.out.println("Given I am a good software tester ");
	}

	@When("I go to work")
	public void i_go_to_work() {
		System.out.println("When I go to work ");
	}

	@When("I involve with it")
	public void i_involve_with_it() {
		System.out.println("And I involve with it ");
	}

	@Then("My boss loves me")
	public void my_boss_loves_me() {
		System.out.println("Then My boss loves me");
		System.out.println("................................");
	}

	@Given("I am a average software tester")
	public void i_am_a_average_software_tester() {
		System.out.println("Given I am a average software tester ");
	}

	@When("I work with it")
	public void i_work_with_it() {
		System.out.println("When I go to work ");
	}

	@Then("My boss forgives me")
	public void my_boss_forgives_me() {
		System.out.println("Then My boss forgives me ");
		System.out.println("...................................");
	}

	@Given("I am a bad software tester")
	public void i_am_a_bad_software_tester() {
		System.out.println("Given I am a bad software tester");
	}

	@When("I mess with it")
	public void i_mess_with_it() {
		System.out.println("And I mess with it ");
	}

	@Then("My boss hates me")
	public void my_boss_hates_me() {
		System.out.println("Then My boss hates me ");
		System.out.println("...............................");
		
	}

}
