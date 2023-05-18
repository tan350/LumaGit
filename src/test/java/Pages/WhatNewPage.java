package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import TestBase.TestBaseLuma;

public class WhatNewPage extends TestBaseLuma {

	//locating WebElements
	@FindBy(xpath="//ul[@id='ui-id-2']/li[1]")
	WebElement whatsNew;
	
	@FindBy(xpath="//span[text()='Shop New Yoga']")
	WebElement shopNewYogaButton;
	
	@FindBy(xpath="(//a[@id='mode-list'])[1]")
	WebElement modeList;
	
	@FindBy(xpath="(//a[@id='mode-grid'])[1]")
	WebElement modeGrid;
	
	@FindBy(xpath="//img[@alt='Ida Workout Parachute Pant']")
	WebElement imageGrid;
	
	@FindBy(xpath="(//select[@id='sorter'])[1]")
	WebElement sortBy;
	
	@FindBy(xpath="(//select[@id='limiter'])[2]")
	WebElement productOnPage;
	
	@FindBy(xpath="//div//ol//li//a[contains(text(),'Celeste Sports')][1]")
	WebElement productNameOrder;
	
	@FindBy(xpath="//span[text()='$19.00']")
	WebElement productPriceOrder;
	
	@FindBy(xpath="//div//strong//a[contains(text(),'Echo Fit Compression Short')][1]")
	WebElement productPositionOrder;
	
	@FindBy(xpath="(//li//a[@class='page'])[3]")
	WebElement moveOnNextPage;
	
	@FindBy(xpath="//ol[@class='products list items product-items']")
	WebElement productList;
	
	@FindBy(xpath="(//div[text()='Style'])[1]")
	WebElement style;
	
	@FindBy(xpath="//a[contains(text(),'Duffel')]")
	WebElement duffel;
	
	@FindBy(xpath="//a[contains(text(),'Messenger')]")
	WebElement messenger;
	
	@FindBy(xpath="(//a[contains(text(),'Laptop')])[1]")
	WebElement laptop;
	
	@FindBy(xpath="(//a[contains(text(),'Exercise')])[1]")
	WebElement exerciseStyle;
	
	@FindBy(xpath="//div[text()='Category']")
	WebElement category;
	
	@FindBy(xpath="//a[contains(text(),'Electronic')]")
	WebElement electronic;
	
	@FindBy(xpath="(//a[contains(text(),'Exercise')])[2]")
	WebElement exerciseCategory;
	
	@FindBy(xpath="//a[contains(text(),'Fashion')]")
	WebElement fashion;
	
	@FindBy(xpath="//a[contains(text(),'Timepiece')]")
	WebElement timePiece;
	
	@FindBy(xpath="//a//span[text()='Clear All']")
	WebElement clearAllButton;
	
	@FindBy(xpath="//span[@class='filter-value']")
	WebElement filterValue;

	//method for initializing objects using PageFactory
	public WhatNewPage(){
		PageFactory.initElements(driver,this);
	}
	
	//methods
	public void sortByPosition(){
		Select se = new Select(sortBy);
		se.selectByValue("position");
	}
	
	public void sortByName(){
		Select se = new Select(sortBy);
		se.selectByValue("name");
	}
	
	public void sortByPrice(){
		Select se = new Select(sortBy);
		se.selectByValue("price");
	}

	
	public void show12Product(){
		Select se = new Select(productOnPage);
		se.selectByValue("12");
	}
	
	public void show24Product(){
		Select se = new Select(productOnPage);
		se.selectByValue("24");
	}
	
	public void show36Product(){
		Select se = new Select(productOnPage);
		se.selectByValue("36");
	}


	//methods for test
	public void navigateToNewLumaYogaCollection() throws InterruptedException{
		whatsNew.click();
		shopNewYogaButton.click();
		modeList.click();
		Thread.sleep(2000);
		modeGrid.click();
		Thread.sleep(3000);
		Assert.assertTrue(imageGrid.isDisplayed());
	}
	
	public void productNameSort() throws InterruptedException{
		Thread.sleep(2000);
		sortByName();
		Thread.sleep(2000);
		Assert.assertTrue(productNameOrder.isDisplayed());
	}
	
	public void productPriceSort() throws InterruptedException{
		Thread.sleep(2000);
		sortByPrice();
		Thread.sleep(2000);
		Assert.assertTrue(productPriceOrder.isDisplayed());
	}
	
	public void productPositionSort() throws InterruptedException{
		Thread.sleep(2000);
		sortByPosition();
		Thread.sleep(2000);
		Assert.assertTrue(productPositionOrder.isDisplayed());
	}
	
	public void moveToNextPage() throws InterruptedException {
		Thread.sleep(2000);
		moveOnNextPage.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"New Luma Yoga Collection");
	}
	
	public void productOnPage24() throws InterruptedException{
		Thread.sleep(2000);
		show24Product();
		Thread.sleep(2000);
	}
	
	public void productOnPage36() throws InterruptedException{
		Thread.sleep(2000);
		show36Product();
		Thread.sleep(2000);
	}
	
	public void productOnPage12() throws InterruptedException{
		Thread.sleep(2000);
		show12Product();
		Thread.sleep(2000);
		List<WebElement> product= productList.findElements(By.tagName("a"));
		int productcount= product.size();
		Assert.assertEquals(productcount,12);
	}
	
	public void styleDuffle() throws InterruptedException{
		Thread.sleep(2000);
		style.click();
		Thread.sleep(2000);
		duffel.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Duffel");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void styleMessenger() throws InterruptedException{
		Thread.sleep(3000);
		style.click();
		Thread.sleep(2000);
		messenger.click();
		Thread.sleep(2000);
		Assert.assertTrue(filterValue.isDisplayed());
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void styleLaptop() throws InterruptedException{
		Thread.sleep(3000);
		style.click();
		Thread.sleep(2000);
		laptop.click();
		Thread.sleep(2000);
		Assert.assertTrue(filterValue.isDisplayed());
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void styleExercise() throws InterruptedException{
		Thread.sleep(3000);
		style.click();
		Thread.sleep(2000);
		exerciseStyle.click();
		Thread.sleep(2000);
		Assert.assertTrue(filterValue.isDisplayed());
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void categoryElectronic() throws InterruptedException{
		Thread.sleep(3000);
		category.click();
		Thread.sleep(2000);
		electronic.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Electronic");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void CategoryExercise() throws InterruptedException{
		Thread.sleep(3000);
		category.click();
		Thread.sleep(2000);
		exerciseCategory.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Exercise");
		Thread.sleep(2000);
		clearAllButton.click();
	}
}
