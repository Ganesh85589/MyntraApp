package com.qa.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.pages.MyntraPages1;

public class TestBaseMynthra {
	public WebDriver driver;
	public MyntraPages1 myntraOR1;
	
	@BeforeClass
	public void setUp()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		myntraOR1=new MyntraPages1(driver);
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search_Brand_Generic_Exact&gclid=Cj0KCQjwvr6EBhDOARIsAPpqUPFv9nMEn8Vc_OKVkHVs9lSlCzIlOUmtvDsLcq-dDGkWnSu5mclc82YaAhjEEALw_wcB");
	}
	@AfterClass
	public void TeamDown(){
		driver.close();
	}
}
