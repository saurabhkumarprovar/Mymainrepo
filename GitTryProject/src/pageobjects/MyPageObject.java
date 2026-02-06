package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Amazon"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = "//div[@data-cel-widget='Navigation-desktop-navbar']//input[@id='twotabsearchtextbox']")
	public WebElement searchAmazonIn;
	@ButtonType()
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement go;
			
}
