package pageObejct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	WebDriver driver;
	
	@FindBy(name="field-keywords")
    public  WebElement search;
	
	@FindBy(css="span.a-size-medium.a-color-base")
	public WebElement noResultText;
	
	@FindBy(className="s-suggestion-container")
	public List<WebElement> searchList;
	
	@FindBy(className="a-dropdown-prompt")
	public WebElement sortSearch;
	
	@FindBy(className="a-dropdown-item")
	public List<WebElement> sortList;
	
	@FindBy(css="span.a-color-state.a-text-bold")
    public  WebElement searchCriteria;
	
	@FindBy(css="a.s-pagination-item.s-pagination-next.s-pagination-button.s-pagination-separator")
    public  WebElement nextPage;
	
	@FindBy(id="rhf")
    public  WebElement relatedSection;
	
	@FindBy(className="a-size-base-plus")
    public  WebElement searchItem;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div/div[3]/div[1]/h2/a/span")
    WebElement itemimage;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement btnAddToCart;
	
	@FindBy(css="#sw-gtc > span")
	WebElement goToBasket;
	
	@FindBy(xpath="//*[@id=\"a-autoid-1\"]/span/i")
	WebElement Quantity;
	
	public SearchPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
	
	public void searchText(String text) {
		search.sendKeys(text);
		
	}
	
	public void searchList() {
		
	}
	
	public void searchNextPage() {
		nextPage.click();
	}
	
	public void AddToCartbutton() {
		btnAddToCart.click();
	}
	public void GoToBasketbutton() {
		goToBasket.click();
	}
	
	public void productRelatedSection() {
		
		
	}
	
	public void noResultText() {
		
	}
	Actions action;


	public void performMousehower(WebElement element, WebDriver driver) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}

	public void selectItemImage() {
		itemimage.click();
		
	}
	public void selectByvisibleText()
	{
		
		Select Quantity = new Select(driver.findElement(By.id("quantity")));
		Quantity.selectByValue("3");
		
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

}