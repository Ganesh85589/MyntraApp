package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPages1 {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")
	WebElement LoginPhNo;
	
	public WebElement getLoginPhNO() {
		return LoginPhNo;
		
	}
	@FindBy(xpath="//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]")
	WebElement ClickToContinue;
	
	public WebElement getClickToContinue() {
		return ClickToContinue;
		
	}
	@FindBy(xpath="//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]")
	WebElement SubmitButtonoption;
	
	public WebElement getSubmitButtonoption() {
		return ClickToContinue;
	}
	
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")
	WebElement SearchItem;
	public WebElement getSearchItem(){
		return SearchItem;
		
	}
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")
	WebElement MensShop;
	
	public WebElement getMensShop(){
		return MensShop;
		
	}
	
	@FindAll(@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input"))
	List<WebElement> suggestions;
	public List<WebElement> getSuggestions(){
		return suggestions;
		
	}
	
	public MyntraPages1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
