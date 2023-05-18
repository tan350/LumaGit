package Test;

import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.WhatNewPage;
import TestBase.TestBaseLuma;

public class WhatNewTest extends TestBaseLuma {

	WhatNewPage whatnewpage;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException{
		initialization();
		whatnewpage=new WhatNewPage();
		}
	
	@Test(priority=1)
	public void product_visible_in_gridoption() throws InterruptedException {
		whatnewpage.navigateToNewLumaYogaCollection();
	}
	
	@Test(priority=2)
	public void sorting_by_product_name() throws InterruptedException {
		whatnewpage.productNameSort();
	}
	
	@Test(priority=3)
	public void sorting_by_product_price() throws InterruptedException {
		whatnewpage.productPriceSort();
	}
	
	@Test(priority=4)
	public void sorting_by_product_position() throws InterruptedException {
		whatnewpage.productPositionSort();
	}
	
	@Test(priority=5)
	public void style_duffel() throws InterruptedException {
		whatnewpage.styleDuffle();
	}
	
	@Test(priority=6)
	public void style_messenger() throws InterruptedException {
		whatnewpage.styleMessenger();
	}
	
	@Test(priority=7)
	public void style_laptop() throws InterruptedException {
		whatnewpage.styleLaptop();
	}
	
	@Test(priority=8)
	public void style_exercise() throws InterruptedException {
		whatnewpage.styleExercise();
	}
	
	@Test(priority=9)
	public void category_electronic() throws InterruptedException {
		whatnewpage.categoryElectronic();
	}
	
	@Test(priority=10)
	public void category_exercise() throws InterruptedException {
		whatnewpage.CategoryExercise();
	}

	@AfterSuite
	public void Close_quit(){
		Toclose();
	}

}
