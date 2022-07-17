package com.Delta.Sprint2TeamA;
import com.Delta.Pages.SignUpPage;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.testng.annotations.Test;

public class Afa_SignUp extends BaseClass2 {

@Test
    public void SignUpWithFirstAndLastname(){


    SignUpPage sign = new SignUpPage();

    driver.get(ConfigReader.getProperty("url1"));
    SeleniumUtils.jsClick(sign.clickOnSignUp);

   SeleniumUtils.jsClick( sign.selecctOnFisrtNameBox);
   sign.selecctOnFisrtNameBox.sendKeys(fake.address().firstName());
   SeleniumUtils.scroll(500,200);

   SeleniumUtils.jsClick(sign.SelectOnLastNameBox);
   sign.SelectOnLastNameBox.sendKeys(fake.address().lastName());
   SeleniumUtils.scroll(500,200);
   sign.SelectOnMonth.click();
   sign.April.click();
   sign.SelectDayBox.click();
   sign.Select2.click();
   sign.selectOnYearBox.click();
   sign.clickon1992.click();
   sign.clickOnGenderBox.click();
   sign.clickOnMale.click();
   sign.clickOnNextButton.click();


}

@Test
    public void MailingAddress(){

    SignUpPage sign = new SignUpPage();

    driver.get(ConfigReader.getProperty("url1"));
    SeleniumUtils.jsClick(sign.clickOnSignUp);

    SeleniumUtils.jsClick( sign.selecctOnFisrtNameBox);
    sign.selecctOnFisrtNameBox.sendKeys(fake.address().firstName());
    SeleniumUtils.scroll(500,200);

    SeleniumUtils.jsClick(sign.SelectOnLastNameBox);
    sign.SelectOnLastNameBox.sendKeys(fake.address().lastName());
    SeleniumUtils.scroll(500,200);
    sign.SelectOnMonth.click();
    sign.April.click();
    sign.SelectDayBox.click();
    sign.Select2.click();
    sign.selectOnYearBox.click();
    sign.clickon1992.click();
    sign.clickOnGenderBox.click();
    sign.clickOnMale.click();
    sign.clickOnNextButton.click();
    sign.clickOnCountry.click();
    SeleniumUtils.scroll(500,200);
    sign.selectUnitedStates.click();
    sign.clickOnAddressBox.click();
    sign.clickOnAddressBox.sendKeys(fake.address().streetAddress());
    sign.clickOnCityBox.click();
    sign.clickOnCityBox.sendKeys(fake.address().city());
    sign.selectStateBox.click();
    sign.clickOnCA.click();
    sign.clickOnPostalCodeBox.click();
    sign.clickOnPostalCodeBox.sendKeys(fake.address().zipCode());

}
@Test
    public void signUpWithPhoneAndEmail() {

    SignUpPage sign = new SignUpPage();

    driver.get(ConfigReader.getProperty("url1"));
    SeleniumUtils.jsClick(sign.clickOnSignUp);

    SeleniumUtils.jsClick(sign.selecctOnFisrtNameBox);

    sign.selecctOnFisrtNameBox.sendKeys(fake.address().firstName());
    SeleniumUtils.scroll(500, 200);

    SeleniumUtils.jsClick(sign.SelectOnLastNameBox);
    sign.SelectOnLastNameBox.sendKeys(fake.address().lastName());
    SeleniumUtils.scroll(500, 200);
    sign.SelectOnMonth.click();
    sign.April.click();
    sign.SelectDayBox.click();
    sign.Select2.click();
    sign.selectOnYearBox.click();
    sign.clickon1992.click();
    sign.clickOnGenderBox.click();
    sign.clickOnMale.click();
    sign.clickOnNextButton.click();
    sign.clickOnCountry.click();
    SeleniumUtils.scroll(500, 200);
    sign.selectUnitedStates.click();
    sign.clickOnAddressBox.click();
    sign.clickOnAddressBox.sendKeys(fake.address().streetAddress());
    sign.clickOnCityBox.click();
    sign.clickOnCityBox.sendKeys(fake.address().city());
    sign.selectStateBox.click();
    sign.clickOnCA.click();
    sign.clickOnPostalCodeBox.click();
    sign.clickOnPostalCodeBox.sendKeys(fake.address().zipCode());
    sign.clickOnRegionCode.click();
    sign.chooseUnitedStates.click();
    sign.clickOnPhoneBox.click();
    sign.clickOnPhoneBox.sendKeys(fake.phoneNumber().cellPhone());
    sign.clickOnEmailAddressBox.click();
    String email = fake.internet().emailAddress();
    sign.clickOnEmailAddressBox.sendKeys(email);
    sign.ClickOnConfirmEmail.click();
    sign.ClickOnConfirmEmail.sendKeys(email);
    sign.ClickOnNext.click();
}
  @Test(groups = "smoke")
public void createUsernameAndPassword(){

        SignUpPage sign = new SignUpPage();

        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.jsClick(sign.clickOnSignUp);

        SeleniumUtils.jsClick( sign.selecctOnFisrtNameBox);
        sign.selecctOnFisrtNameBox.sendKeys(fake.address().firstName());
        SeleniumUtils.scroll(500,200);

        SeleniumUtils.jsClick(sign.SelectOnLastNameBox);
        sign.SelectOnLastNameBox.sendKeys(fake.address().lastName());
        SeleniumUtils.scroll(500,200);
        sign.SelectOnMonth.click();
        sign.April.click();
        sign.SelectDayBox.click();
        sign.Select2.click();
        sign.selectOnYearBox.click();
        sign.clickon1992.click();
        sign.clickOnGenderBox.click();
        sign.clickOnMale.click();
        sign.clickOnNextButton.click();
        sign.clickOnCountry.click();
        SeleniumUtils.scroll(500,200);
        sign.selectUnitedStates.click();
        sign.clickOnAddressBox.click();
        sign.clickOnAddressBox.sendKeys(fake.address().streetAddress());
        sign.clickOnCityBox.click();
        sign.clickOnCityBox.sendKeys(fake.address().city());
        sign.selectStateBox.click();
        sign.clickOnCA.click();
        sign.clickOnPostalCodeBox.click();
        sign.clickOnPostalCodeBox.sendKeys(fake.address().zipCode());
        sign.clickOnRegionCode.click();
        sign.chooseUnitedStates.click();
        sign.clickOnPhoneBox.click();
        sign.clickOnPhoneBox.sendKeys(fake.phoneNumber().cellPhone());
        sign.clickOnEmailAddressBox.click();
        String email=fake.internet().emailAddress();
        sign.clickOnEmailAddressBox.sendKeys(email);
        sign.ClickOnConfirmEmail.click();
        sign.ClickOnConfirmEmail.sendKeys(email);
        sign.ClickOnNext.click();
        sign.clickOnUsernameBox.click();
        sign.clickOnUsernameBox.sendKeys(fake.name().username());
        sign.clickOnPassword.click();
        String pass= fake.internet().password(8, 15);
        sign.clickOnPassword.sendKeys(pass+"LA");
        sign.clickOnConfirmPass.click();
        sign.clickOnConfirmPass.sendKeys(pass+"LA");



    }

    @Test(groups = "smoke")

    public void AnswerSecurityQuestions(){

        SignUpPage sign = new SignUpPage();

        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.jsClick(sign.clickOnSignUp);

        SeleniumUtils.jsClick( sign.selecctOnFisrtNameBox);
        sign.selecctOnFisrtNameBox.sendKeys(fake.address().firstName());
        SeleniumUtils.scroll(500,200);

        SeleniumUtils.jsClick(sign.SelectOnLastNameBox);
        sign.SelectOnLastNameBox.sendKeys(fake.address().lastName());
        SeleniumUtils.scroll(500,200);
        sign.SelectOnMonth.click();
        sign.April.click();
        sign.SelectDayBox.click();
        sign.Select2.click();
        sign.selectOnYearBox.click();
        sign.clickon1992.click();
        sign.clickOnGenderBox.click();
        sign.clickOnMale.click();
        sign.clickOnNextButton.click();
        sign.clickOnCountry.click();
        SeleniumUtils.scroll(500,200);
        sign.selectUnitedStates.click();
        sign.clickOnAddressBox.click();
        sign.clickOnAddressBox.sendKeys(fake.address().streetAddress());
        sign.clickOnCityBox.click();
        sign.clickOnCityBox.sendKeys(fake.address().city());
        sign.selectStateBox.click();
        sign.clickOnCA.click();
        sign.clickOnPostalCodeBox.click();
        sign.clickOnPostalCodeBox.sendKeys(fake.address().zipCode());
        sign.clickOnRegionCode.click();
        sign.chooseUnitedStates.click();
        sign.clickOnPhoneBox.click();
        sign.clickOnPhoneBox.sendKeys(fake.phoneNumber().cellPhone());
        sign.clickOnEmailAddressBox.click();
        String email=fake.internet().emailAddress();
        sign.clickOnEmailAddressBox.sendKeys(email);
        sign.ClickOnConfirmEmail.click();
        sign.ClickOnConfirmEmail.sendKeys(email);
        sign.ClickOnNext.click();
        sign.clickOnUsernameBox.click();

        SeleniumUtils.waitFor(2);
        SeleniumUtils.jsClick(sign.clickOnUsernameBox);

        sign.clickOnUsernameBox.sendKeys(fake.name().username());
        sign.clickOnPassword.click();
        String pass= fake.internet().password(8, 15);
        sign.clickOnPassword.sendKeys(pass+"LA");
        sign.clickOnConfirmPass.click();
        sign.clickOnConfirmPass.sendKeys(pass+"LA");
        sign.clickOn1Question.click();
        SeleniumUtils.scroll(500,200);
        sign.clickOnPetName.click();
        sign.SelectOn1Answer.click();
        sign.SelectOn1Answer.sendKeys(fake.cat().name());
        sign.clickOn2Question.click();
        sign.select2ndQuestion.click();
        sign.ClickOn2ndAnswer.click();
        sign.ClickOn2ndAnswer.sendKeys(fake.address().firstName());
        SeleniumUtils.scroll(500,200);
        sign.ClickOnMiles.click();
        sign.SubmitButton.click();








    }

}


