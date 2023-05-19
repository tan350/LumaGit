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
	
	@FindBy(xpath="//div[text()='Size']")
	WebElement size;
	
	@FindBy(xpath="//div[@class='swatch-option text ' and text()='S']")
	WebElement smallSize;
	
	@FindBy(xpath="//div[@class='swatch-option text ' and text()='32']")
	WebElement size32;

	@FindBy(xpath="//div[text()='Price']")
	WebElement price;
	
	@FindBy(xpath="//a//span[text()='$19.99']")
	WebElement price19;
	
	@FindBy(xpath="//div[text()='Color']")
	WebElement color;

	@FindBy(xpath="//div[@class='swatch-option color ' and @option-label='Purple']")
	WebElement colorPurple;
	
	@FindBy(xpath="//div[text()='Activity']")
	WebElement activity;
	
	@FindBy(xpath="//a[contains(text(),'Outdoor')]")
	WebElement activityOutdoor;

	@FindBy(xpath="//div[text()='Material']")
	WebElement material;
	
	@FindBy(xpath="(//a[contains(text(),'Cotton')])[1]")
	WebElement materialCotton;
	
	@FindBy(xpath="//div[text()='Strap/Handle']")
	WebElement strapHandle;
	
	@FindBy(xpath="//a[contains(text(),'Adjustable')]")
	WebElement strapHandleAdjustable;
	
	@FindBy(xpath="//div[text()='Features']")
	WebElement features;
	
	@FindBy(xpath="//a[contains(text(),'Flapover')]")
	WebElement featuresFlapover;
	
	@FindBy(xpath="//div[text()='Gender']")
	WebElement gender;
	
	@FindBy(xpath="(//a[contains(text(),'Men')])[2]")
	WebElement genderMen;
	
	@FindBy(xpath="//div[text()='Eco Collection']")
	WebElement ecoCollection;
	
	@FindBy(xpath="(//a[contains(text(),'Yes')])[1]")
	WebElement ecoCollectionYes;
	
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
	
	public void selectSizeSmall() throws InterruptedException {
		Thread.sleep(3000);
		size.click();
		Thread.sleep(2000);
		smallSize.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"S");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void selectSize32() throws InterruptedException {
		Thread.sleep(3000);
		size.click();
		Thread.sleep(2000);
		size32.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"32");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void selectPrice19() throws InterruptedException {
		Thread.sleep(3000);
		price.click();
		Thread.sleep(2000);
		price19.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"$10.00 - $19.99");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void selectColorPurple() throws InterruptedException {
		Thread.sleep(3000);
		color.click();
		Thread.sleep(2000);
		colorPurple.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Purple");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void selectActivityOutdoor() throws InterruptedException {
		Thread.sleep(3000);
		activity.click();
		Thread.sleep(2000);
		activityOutdoor.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Outdoor");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void selectMaterialCotton() throws InterruptedException {
		Thread.sleep(3000);
		material.click();
		Thread.sleep(2000);
		materialCotton.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Cotton");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void selectStrapHandleAdjustable() throws InterruptedException {
		Thread.sleep(3000);
		strapHandle.click();
		Thread.sleep(2000);
		strapHandleAdjustable.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Adjustable");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void selectFeaturesFlapover() throws InterruptedException {
		Thread.sleep(3000);
		features.click();
		Thread.sleep(2000);
		featuresFlapover.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Flapover");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void selectGenderMen() throws InterruptedException {
		Thread.sleep(3000);
		gender.click();
		Thread.sleep(2000);
		genderMen.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Men");
		Thread.sleep(2000);
		clearAllButton.click();
	}
	
	public void selectEcocollectionYes() throws InterruptedException {
		Thread.sleep(3000);
		ecoCollection.click();
		Thread.sleep(2000);
		ecoCollectionYes.click();
		Thread.sleep(2000);
		Assert.assertEquals(filterValue.getText(),"Yes");
		Thread.sleep(2000);
		clearAllButton.click();
	}

}
