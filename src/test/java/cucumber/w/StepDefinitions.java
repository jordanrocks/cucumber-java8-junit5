package cucumber.w;

/*import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/

import io.cucumber.java8.En;

//import static org.junit.Assert.*;

public class StepDefinitions implements En {
    public StepDefinitions() {
        Given("today is Sunday", () -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new io.cucumber.java8.PendingException();
        });
        When("I ask whether it's Friday yet", () -> {
            // Write code here that turns the phrase above into concrete actions
            //   throw new io.cucumber.java8.PendingException();
        });


        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new io.cucumber.java8.PendingException();
        });
    }
}
