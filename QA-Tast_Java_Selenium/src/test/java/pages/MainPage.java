package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    public MainPage() {
        super(By.xpath("//*[contains(text(),'qa.code-quiz.dev')]"), "Main Page");
    }

    private final ITextBox username = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Enter Username']"), "User Name Field");
    private final ITextBox password = getElementFactory().getTextBox(By.xpath("//input[@placeholder='password']"), "Password Field");
    private final IButton loginButton = getElementFactory().getButton(By.xpath("//button[normalize-space()='LOGIN']"), "Login Button");

    public void enterUsername(String email){
        username.clearAndType(email);
    }

    public void enterPassword(String pass){
        password.clearAndType(pass);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}

