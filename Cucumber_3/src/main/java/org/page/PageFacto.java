package org.page;

import org.base.BaseMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFacto extends BaseMethod{
	
	public PageFacto() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(name="Start")
	private WebElement start;
	
	@FindBy(name="End")
	private WebElement End;
	
	@FindBy(name="SearchDate")
	private WebElement SearchDate;

	public WebElement getStart() {
		return start;
	}

	public WebElement getEnd() {
		return End;
	}

	public WebElement getSearchDate() {
		return SearchDate;
	}
	
	@FindBy(xpath="(//div[@class='autocomplete-suggestion'])[2]")
	private WebElement start1;

	public WebElement getStart1() {
		return start1;
	}
	
	
	
}
