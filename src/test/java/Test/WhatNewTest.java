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
	
	@Test(priority=11)
	public void filter_size_small() throws InterruptedException {
		whatnewpage.selectSizeSmall();
	}
	
	@Test(priority=12)
	public void filter_size_32() throws InterruptedException {
		whatnewpage.selectSize32();
	}
	
	@Test(priority=13)
	public void filter_price() throws InterruptedException {
		whatnewpage.selectPrice19();
	}
	
	@Test(priority=14)
	public void filter_color() throws InterruptedException {
		whatnewpage.selectColorPurple();
	}
	
	@Test(priority=15)
	public void filter_activity_outdoor() throws InterruptedException {
		whatnewpage.selectActivityOutdoor();
	}
	
	@Test(priority=16)
	public void filter_material_cotton() throws InterruptedException {
		whatnewpage.selectMaterialCotton();
	}
	
	@Test(priority=17)
	public void filter_strap_handle_adjustable() throws InterruptedException {
		whatnewpage.selectStrapHandleAdjustable();
	}
	
	@Test(priority=18)
	public void filter_features_flapover() throws InterruptedException {
		whatnewpage.selectFeaturesFlapover();
	}
	
	@Test(priority=19)
	public void filter_gender_men() throws InterruptedException {
		whatnewpage.selectGenderMen();
	}
	
	@Test(priority=20)
	public void filter_eco_collection_yes() throws InterruptedException {
		whatnewpage.selectEcocollectionYes();
	}


	@AfterSuite
	public void Close_quit(){
		Toclose();
	}

}
