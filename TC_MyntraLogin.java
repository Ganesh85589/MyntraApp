package com.qa.testscript;

import org.testng.annotations.Test;

import com.qa.testbase.TestBaseMynthra;

public class TC_MyntraLogin extends TestBaseMynthra{
	
	@Test
	public void LoginPage() {
		myntraOR1.getLoginPhNO().click();
		myntraOR1.getLoginPhNO().sendKeys("9182424732");
		myntraOR1.getClickToContinue().click();
	}

}
