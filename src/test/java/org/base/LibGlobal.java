package org.base;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.awt.Robot;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	public static 	Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithi\\eclipse-workspace\\TodaysTask\\driver\\chromedriver.exe");
       driver =  new ChromeDriver();
       }
	public void entreUrl(String url) {
		driver.get(url);
		}
	public void navigateTo(String url) {
		driver.navigate().to(url);
		}
	public void navigateBack() {
		driver.navigate().back();
		}
	public void navigateForward() {
		
		driver.navigate().forward();
		}
	public void pageReload() {
		driver.navigate().refresh();
		}
	public void enterText(WebElement element, CharSequence[] object) {
		element.sendKeys(object);
		}
	public void fetchTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		}
	public void CurrentUrl() {
	    String link = driver.getCurrentUrl();
	    System.out.println(link);
	}
	public static WebElement locatorId(String data) {
		return driver.findElement(By.id(data));
		}
	public static WebElement locatorName(String data) {
		return driver.findElement(By.name(data));
		}
	public static WebElement locatorXpath(String data) {
		return driver.findElement(By.xpath(data));
		}
	public void fetchAttribute(WebElement element) {
		String text = element.getAttribute("value");
		System.out.println(text);
		}
	public void fetchText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		}
	public void singleTap(WebElement element) {
		element.click();
	    }
	public void quit() {
		driver.quit();
		}
	public void dAndD(WebElement source, WebElement target) {
	 a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
		}
	public void rightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
		}
	public void mouseOverAction(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element);
	}
	public void doubleTap(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element);
		}
	public void pressDown() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
	public void pressEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
	public void okAlert() {
		al = driver.switchTo().alert();
		al.accept();
		}
	public void cancelAlert() {
		al = driver.switchTo().alert();
		al.dismiss();
		}
	public void promptAlert(WebElement element, String data) {
		al = driver.switchTo().alert();
		al.sendKeys(data);
		}
	public void screenShot(String data) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest = new File(data);
		}
	public void idFrame(String data) {
		driver.switchTo().frame(data);
		}
	public void nameFrame(String data) {
		driver.switchTo().frame(data);
		}
	public void elementFrame(WebElement element) {
		driver.switchTo().frame(element);
		}
	public void indexFrame(int num) {
		driver.switchTo().frame(num);
		}
	public void JavaScript(WebElement element, String data) {
		js = (JavascriptExecutor) driver;
		js.executeScript(data, element);
	}
	public void scrollDown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
	public void scrollUp(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
		}
	public void dropDownIndex(WebElement element, int z) {
		s = new Select(element);
		s.selectByIndex(z);
		}
	public void dropDownValue(WebElement element, String data) {
		s = new Select(element);
		s.selectByValue(data);
		}
	public void dropDownText(WebElement element, String data) {
		s = new Select(element);
		s.selectByVisibleText(data);
		}
	public void fetchOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> op = s.getOptions();
		for (int i = 0; i <op.size(); i++) {
			WebElement eachElement = op.get(i);
			String text = eachElement.getText();
			System.out.println(text);
			}
		 }
	public void fetchSelectedOption(WebElement element) {
		s = new Select(element);
		List<WebElement> all = s.getAllSelectedOptions();
		for (int i = 0; i < all.size(); i++) {
			WebElement el = all.get(i);
			String text = el.getText();
			System.out.println(text);
			}
		}
	public void fetchFirstSelectedOption(WebElement element) {
		s = new Select(element);
		WebElement first = s.getFirstSelectedOption();
		String text = first.getText();
		System.out.println(text);
		}
	public void selectOffIndex(WebElement element, int z) {
		s = new Select(element);
		s.deselectByIndex(z);
		}
	public void selectOffValue(WebElement element, String data) {
		s = new Select(element);
		s.deselectByValue(data);
		}
	public void selectOffText(WebElement element, String data) {
		s = new Select(element);
	    s.deselectByVisibleText(data);
	    }
	public void selectOffAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
		}
	public void singleWindowHandling() {
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		if (!parent.equals(all)) {
			for (String x : all) {
				driver.switchTo().window(x);
				}
			}
		}
	public void webTableFor(String data) {
		List<WebElement> tHead = driver.findElements(By.tagName(data));
		for (int i = 0; i < tHead.size(); i++) {
			WebElement eachHead = tHead.get(i);
			String text = eachHead.getText();
			System.out.println(text);
			}
		}
	public void webTableNestedFor(String data, String data1) {
		List<WebElement> tRows = driver.findElements(By.tagName(data));
		for (int i = 0; i <tRows.size(); i++) {
			WebElement eachRow = tRows.get(i);
			List<WebElement> tData = eachRow.findElements(By.tagName(data1));
			for (int j = 0; j < tData.size(); j++) {
				WebElement eachData = tData.get(j);
				String text = eachData.getText();
				System.out.println(text);
				}
			}
		}
	public void valuesFromExcel(WebElement element,String sheetname, int sheetindex, int sheetindex1) throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Book1.xlsx");
		FileInputStream st = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(st);
		Sheet sh = wb.getSheet(sheetname);
		Row r = sh.getRow(sheetindex);
		Cell c = r.getCell(sheetindex1);
		String s = c.getStringCellValue();
		element.sendKeys(s);
		System.out.println(s);
		


	}
	
	
	
	
	
	
	
	}
