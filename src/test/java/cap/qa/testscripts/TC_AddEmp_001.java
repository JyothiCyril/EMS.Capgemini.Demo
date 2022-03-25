package cap.qa.testscripts;

import org.testng.annotations.Test;

public class TC_AddEmp_001 extends TestBase{
	
	@Test
	public void addEmpDetails() {
		
		// lines of code written for add emp details
		
		AddEmpOR.getempNameTxtField().sendKeys("Kim Smith");
		
	}

}
