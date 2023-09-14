package IntegrationPart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopComShoppingCart {
	
	 

	

	    WebDriver driver;


	    public NopComShoppingCart(WebDriver driver) {

	        this.driver = driver;

	        PageFactory.initElements(driver, this);

	    }
	    
	    

	    //All Input Fields

	    @FindBy(xpath="//*[@id=\"ShipToSameAddress\"]")

	    WebElement shipToSameAdd;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_FirstName\"]")

	    WebElement firstName;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_LastName\"]")

	    WebElement lastName;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_Email\"]")

	    WebElement email;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_Company\"]")

	    WebElement company;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_CountryId\"]")

	    WebElement country;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_StateProvinceId\"]")

	    WebElement state;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_City\"]")

	    WebElement city;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_Address1\"]")

	    WebElement address1;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_Address2\"]")

	    WebElement address2;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_ZipPostalCode\"]")

	    WebElement zip;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_PhoneNumber\"]")

	    WebElement phoneNumber;

	    @FindBy(xpath="//*[@id=\"BillingNewAddress_FaxNumber\"]")

	    WebElement faxNumber;

	    @FindBy(xpath="//*[@id=\"billing-buttons-container\"]/button[4]")

	    WebElement step1Continue;


	    //Step 3


	    @FindBy(xpath="//*[@id=\"shippingoption_0\"]")

	    WebElement ground;

	    @FindBy(xpath="//*[@id=\"shippingoption_1\"]")

	    WebElement nextDayAir;

	    @FindBy(xpath="//*[@id=\"shippingoption_2\"]")

	    WebElement secondDayAir;

	    @FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/p/a")

	    WebElement step3Back;

	    @FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/button")

	    WebElement step3continue;


	     //step4 payment methord


	    @FindBy(xpath="//*[@id=\"paymentmethod_0\"]")

	    WebElement cash;

	    @FindBy(xpath="//*[@id=\"paymentmethod_1\"]")

	    WebElement creditCard;

	    @FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/p/a")

	    WebElement step4Back;

	    @FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/button")

	    WebElement step4Continue;


	    //step 5 Billing info


	    @FindBy(xpath="//*[@id=\"CreditCardType\"]")

	    WebElement cardName;

	    @FindBy(xpath="//*[@id=\"CardholderName\"]")

	    WebElement cardholderName;

	    @FindBy(xpath="//*[@id=\"CardNumber\"]")

	    WebElement cardNumber;

	    @FindBy(xpath="//*[@id=\"ExpireMonth\"]")

	    WebElement expireMonth;

	    @FindBy(xpath="//*[@id=\"ExpireYear\"]")

	    WebElement expireYear;

	    @FindBy(xpath="//*[@id=\"CardCode\"]")

	    WebElement cardCode;

	    @FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/p/a")

	    WebElement step5Back;

	    @FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/button")

	    WebElement step5Continue;


	    //Step6 Confirm order


	    @FindBy(xpath="")

	    WebElement step6Back;

	    @FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/button")

	    WebElement step6Continue;


	 

	    //FileInputStream fileRead = new FileInputStream(new File(System.getProperty("user.dir") + "\\input.xlsx"));

	    public void enterFirstName() {

	        firstName.sendKeys("Bala");

	    }

	    public void enterLastName() {

	        lastName.sendKeys("Chandran");

	    }

	    public void enterEmail() {

	        email.sendKeys("bala@gmail.com");

	    }



	    public void entercompany() {

	        company.sendKeys("ITC Bangalore");

	    }

	    public void selectCountry() throws InterruptedException {

	        Select sort=new Select(country);

	        sort.selectByVisibleText("India");;

	        Thread.sleep(2000);

	    }

	   // public void select

	    public void entercity() {

	        city.sendKeys("pdkt");

	    }

	    public void enterAddress1() {

	        address1.sendKeys("14,Thendral nagar");

	    }

	    public void enterAddress2() {

	        address2.sendKeys("Attangudi");

	    }

	    public void enterZip() {

	        zip.sendKeys("62003");

	    }

	    public void enterPhNumber() {

	        phoneNumber.sendKeys("6381311290");

	    }

	    public void enterFaxNumber() {

	        faxNumber.sendKeys("5678921");

	    }

	    public void clickContinue1() {

	        step1Continue.click();

	    }


	    //step 3


	    public void selectViaGround() {

	        ground.click();

	    }

	    public void selectViaAirDay1() {

	        nextDayAir.click();

	    }

	    public void selectViaAirDay2() {

	        secondDayAir.click();

	    }

	    public void clickContinue2() {

	        step3continue.click();

	    }

	    public void clickBackTo1() {

	        step3Back.click();

	    }


	    //step4 payment methord


	    public void selectPaymentViaCash() {

	        cash.click();

	    }

	    public void selectPaymentViaCreditCard() {

	        creditCard.click();

	    }

	    public void clickContinue3() {

	        step4Continue.click();

	    }

	    public void clickBackTo3() {

	        step4Back.click();


	    }


	    //step 5 Billing info

	 

	    

	    public void creditCardName() {

	        Select name=new Select(cardName);

	        name.selectByVisibleText("Discover");


	    }

	    public void creditHolderName() {

	        cardholderName.sendKeys("Balachandran T");

	    }

	    public void creditCardNumber() {

	        cardNumber.sendKeys("5372030008544111");

	    }

	    public void CardExpireMonth() {

	        Select name=new Select(expireMonth);

	        name.selectByVisibleText("10");


	    }

	    public void CardExpireYear() {

	        Select name=new Select(expireYear);

	        name.selectByVisibleText("2028");

	    }

	    public void CardCardCode() {

	        cardCode.sendKeys("0527");

	    }

	    public void clickContinue4() {

	        step5Continue.click();

	    }

	    public void clickBackTo4() {

	        step5Back.click();

	    }


	    //Step6 Confirm order


	    public void clickContinue5(){

	        step6Continue.click();

	    }

	    public void clickBackTo5(){

	        step6Back.click();

	    }

	}

	
