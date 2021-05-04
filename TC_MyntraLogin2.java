package com.qa.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.testbase.TestBaseMynthra;
import com.qa.utility.ExcelUtility;

public class TC_MyntraLogin2 extends TestBaseMynthra {
	@Test(dataProvider="getData")
	public void SearchItem(String Input) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")).sendKeys(Input);
		myntraOR1.getSubmitButtonoption().click();	
	}
	@DataProvider
	public String[][] getData() throws IOException{
		String xlPath="C:\\Users\\ganesh\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\com\\qa\\testData1\\TestData.xlsx";
		String xlSheet="Sheet1";

		int rowCount=ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount=ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);

		String[][] data= new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j]=ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}
		return data;
			
	}
}



