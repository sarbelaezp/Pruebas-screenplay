package in.automationtesting.demo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DemoSiteRegisterPage extends PageObject{
	public static final Target IFRAME = Target.the("iframe")
			.located(By.id("xh-bar"));
	public static final Target NAME = Target.the("Name textarea")
			.locatedBy("(//INPUT[@type='text'])[1]");
	public static final Target LASTNAME = Target.the("Lastname textarea")
			.locatedBy("(//INPUT[@type='text'])[2]");
	public static final Target EMAIL = Target.the("Email textarea")
			.locatedBy("//INPUT[@type='email']");
	public static final Target PHONE = Target.the("Phone textarea")
			.locatedBy("//INPUT[@type='tel']");
	public static final Target GENDER = Target.the("Gender radiobutton")
			.locatedBy("(//INPUT[@type='radio'])[1]");
	public static final Target COUNTRY = Target.the("Country list")
			.located(By.id("countries"));
	public static final Target BIRTH_YEAR = Target.the("Birth year list")
			.located(By.id("yearbox"));
	public static final Target BIRTH_MONTH = Target.the("Birth month list")
			.locatedBy("//div[@class='col-md-3 col-xs-3 col-sm-3'][2]/select[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']");
	public static final Target BIRTH_DAY = Target.the("Birth day list")
			.located(By.id("daybox"));
	public static final Target PASSWORD = Target.the("Password textarea")
			.located(By.id("firstpassword"));
	public static final Target CONFIRM_PASSWORD = Target.the("Confirm password textarea")
			.located(By.id("secondpassword"));
	public static final Target SUBMIT = Target.the("Submit button")
	.located(By.id("submitbtn"));
	public static final Target VALIDATE_CREATION = Target.the("Creation result")
			.locatedBy("//div[@class='row']/div[2]/h4[1]");
}
