package com.crm.Actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcustbtn;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custnametext;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptiontext;
	
	@FindBy(xpath = "(//div[.='- Select Customer -'])[2]")
	private WebElement dropdown;
	
	
	@FindBy(xpath = "(//div[.='Our company'])[10]")
	private WebElement companyname;
	
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	

	
	public Taskpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public WebElement getAddnewbtn() {
		return addnewbtn;
	}



	public WebElement getNewcustbtn() {
		return newcustbtn;
	}



	public WebElement getCustnametext() {
		return custnametext;
	}



	public WebElement getDescriptiontext() {
		return descriptiontext;
	}



	public WebElement getDropdown() {
		return dropdown;
	}



	public WebElement getCompanyname() {
		return companyname;
	}



	public WebElement getCreatebtn() {
		return createbtn;
	}
	
	
	//bussiness logic
	public void createcustomer() {
		addnewbtn.click();
		newcustbtn.click();
		custnametext.sendKeys("HDFC_001");
		descriptiontext.sendKeys("Banking");
		dropdown.click();
		companyname.click();
		createbtn.click();
		
		
		
		
		
	}
}












