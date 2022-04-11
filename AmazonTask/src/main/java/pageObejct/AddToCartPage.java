package pageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.Implementation;



public class AddToCartPage 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\\\"a-autoid-1\\\"]/span/i")
	String txtQuantity;

	
	
	public AddToCartPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

	public void selectByIndex(WebElement txtQuantity,int value) {
		Select s= new Select(txtQuantity);
		s.selectByIndex(value);
	}
	
	public boolean validateText(WebDriver driver,WebElement element,String expectedtext)
	{
		String observedtext=element.getText();
		System.out.println(observedtext);
		if(observedtext.equals(expectedtext))
		{
		return true;
		}
		return false;
	}

	public void selectByIndex(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}