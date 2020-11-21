package org.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage {
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtPassword;
	@FindBy(id="re_password")
	private WebElement conPassword;
	@FindBy(id="full_name")
	private WebElement Name;
	@FindBy(id="email_add")
	private WebElement mail;
	@FindBy(id="tnc_box")
	private WebElement squareBox;
	@FindBy(id="Submit")
	private WebElement regBtn;

	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getConPassword() {
		return conPassword;
	}
	public WebElement getName() {
		return Name;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getSquareBox() {
		return squareBox;
	}
	public WebElement getRegBtn() {
		return regBtn;
	}
	
	

}
