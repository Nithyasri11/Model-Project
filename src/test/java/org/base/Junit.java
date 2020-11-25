package org.base;
import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class Junit extends LibGlobal{
	static LibGlobal lib;
	LoginPage lp;
	@BeforeClass
	public static void test1() {
		getDriver();
		lib.entreUrl("http://adactinhotelapp.com/Register.php");
		driver.manage().window().maximize();
		}
	@AfterClass
	public static void methodAfter() {
		driver.close();
	}
	@Before
	public void beforetestMethod() {
		Date d = new Date();
		System.out.println(d);
		}
	@After
	public void aftertestMethod() {
		Date d = new Date();
		System.out.println(d);
		}
	@Test
	public void executionMethod() throws IOException {
		lib= new LibGlobal();
		lp = new LoginPage();
		lib.valuesFromExcel(lp.getTxtUserName(), "Sheet2", 1, 0);
		lib.valuesFromExcel(lp.getTxtPassword(), "Sheet2", 1, 1);
		lib.valuesFromExcel(lp.getConPassword(), "Sheet2", 1, 2);
		lib.valuesFromExcel(lp.getName(), "Sheet2", 1, 3);
		lib.valuesFromExcel(lp.getMail(), "Sheet2", 1, 4);
		lib.singleTap(lp.getSquareBox());
		lib.singleTap(lp.getRegBtn());
		}
	
	public static void main(String[] args) {
		System.out.println("Tranav started the project ");
		System.out.println("Tranav completed");
	}
}
