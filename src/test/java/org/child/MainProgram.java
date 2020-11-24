package org.child;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainProgram extends LibGlobal{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		LibGlobal lib = new LibGlobal();
		getDriver();
		lib.entreUrl("http://adactinhotelapp.com/Register.php");
		driver.manage().window().maximize();
		lib.CurrentUrl();
		lib.fetchTitle();
		WebElement txtUserName = locatorId("username");
		lib.valuesFromExcel(txtUserName, "Sheet2", 1, 0);
		
	    System.out.println("hiiii");
	    System.out.println("first day work");
	    System.out.println("work is going to completed");
		
		
		
		Thread.sleep(3000);
		lib.quit();
		
		
		
	}

}

