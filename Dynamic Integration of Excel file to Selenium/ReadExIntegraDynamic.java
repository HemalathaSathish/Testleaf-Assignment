package week5.day3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.BaseClass;

public class ReadExIntegraDynamic extends BaseClass{
	
	@DataProvider(name="getValue")		// Dynamic Parameterization
	public String[][] fetchData() throws IOException{
		
		return ReadExlFileTCIntegration.getValue(); 	// This fetches the value from ReadExlFileTCIntegration File
															//data is stored in Excel
			}
	
		@Test(dataProvider ="getValue")
		public void DynamicParameter(String cName, String fname, String lName, String phoNum  ) throws InterruptedException { //placing args based on number of inputs,parameter is declared
			// cname , fname, lname are passed args.
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoNum);
			driver.findElement(By.name("submitButton")).click();
			Thread.sleep(5000);
		}

}
