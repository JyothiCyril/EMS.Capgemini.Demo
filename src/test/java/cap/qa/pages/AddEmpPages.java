package cap.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmpPages {
	
	
	WebDriver driver;
	
	@FindBy(name="EmpName")
	WebElement empNameTxtField;
	
	public WebElement getempNameTxtField() {
		return empNameTxtField;
	}
	
	public AddEmpPages(WebDriver rDriver) {
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

}
