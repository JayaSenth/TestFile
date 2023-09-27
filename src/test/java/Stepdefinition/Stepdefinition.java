package Stepdefinition;




	import org.openqa.selenium.WebDriver;

	import BaseClass.BaseClass;
	import Login_Page;
	import com.adactin.runner.Test_Runner;


import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class Stepdefinition extends BaseClass{
		
		public static WebDriver driver = TestRunner.driver;
		
		public static Login_Page login = new Login_Page(driver);
		
		@Given("^user Launch The Application$")
		public void user_Launch_The_Application() throws Throwable {
			
			getUrl("https://adactinhotelapp.com/");
		    
		}

		@When("^user Enter The Username In \"([^\"]*)\" Field$")
		public void user_Enter_The_Username_In_Field(String username) throws Throwable {
			
			inputValueElement(login.getEmail(), username);
		    
		}

		@When("^user Enter The Password In \"([^\"]*)\" Field$")
		public void user_Enter_The_Password_In_Field(String password) throws Throwable {
			
			inputValueElement(login.getPassword(), password);
		    
		}

		@Then("^user Click On The Login Button And It Navigates To Search Hotel Page$")
		public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
			
			clickOnElement(login.getLogIn());
		   
		}



	}

}
