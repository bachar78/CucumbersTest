package stepDefinations;


import cucumber.api.PendingException;
import cucumber.api.java.en.*;



public class StepDefination {

    @Given("^User is on NetBanking landing page$")
    public void User_is_on_NetBanking_landing_page() throws Throwable {
        //my duty is to write code to user navigate the netBanking landing page
        //Write API to be hit
        System.out.println("User is on netBanking landing page");
    }

    @When("^User login into application with username and password$")
    public void User_login_into_application_with_username_and_password() throws Throwable{
        System.out.println("User login into application with user and password");
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Home page is populated$")
    public void Home_page_is_populated() throws Throwable{
        System.out.println("Home page is populated");
    }


    @Then("^Cards are displayed$")
    public void Cards_are_displayed() throws Throwable{
        System.out.println("Cards are displayed");
    }
}
