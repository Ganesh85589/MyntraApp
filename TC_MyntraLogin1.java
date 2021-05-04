package com.qa.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.testbase.TestBaseMynthra;

public class TC_MyntraLogin1 extends TestBaseMynthra {
		@Test(dataProvider="getData")
		public void SearchItem(String Input) throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")).clear();
			driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")).sendKeys(Input);
			myntraOR1.getSubmitButtonoption().click();
		}
		@DataProvider
		public Object[][] getData(){
			Object[][] data=new Object[3][1];
				data[0][0]="12345566";
				data[1][0]="9182424732";
				data[2][0]="ganesh";
				return data;	
		}

}
