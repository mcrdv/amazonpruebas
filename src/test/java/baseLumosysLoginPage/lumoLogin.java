package baseLumosysLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class lumoLogin {
	
	@FindBy(how = How.ID, using = "USU_USERNAME")
	
	@FindBy(how = How.ID, using = "USU_PASSWORD" )
	
	@FindBy (how = How.XPATH, using = "/html//button[@id='btnLogIn']")
	
	
	// WebElements de createAccount
	WebElement txtboxUser;
	WebElement txtboxPass;
	WebElement btnLogin;
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public lumoLogin(WebDriver testDriver) {
		driver = testDriver;
		wait = new WebDriverWait(driver, 15);
		PageFactory.initElements(driver, this);
	}
	
	public lumoLogin() {
		// TODO Auto-generated constructor stub
	}

	public boolean at() {
		//existe el campo de busqueda? 
		//existe el boton de busqueda?
		//retorna verdadero.
		return txtboxUser.isDisplayed() && txtboxPass.isDisplayed() && btnLogin.isDisplayed();
	}

	public void login (String MCORDOVA, String Qa#12345) {
		txtboxUser.sendKeys(MCORDOVA);
		txtboxPass.sendkeys(Qa#12345);
		txtboxPass.click();
	}
	public void publicarEstado(String mensaje) {
		
	}
	public void likePhoto() {
		
	}
	public void commentPost(String mensaje) {
		
	}
	public void compartirEstado(String mensaje) {
		
	}
	public void compartirEstadoSinMensaje() {
		
	}
	
}