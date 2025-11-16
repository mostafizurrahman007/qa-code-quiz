package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class RedirectedPage extends Form {
    public RedirectedPage(){
        super(By.xpath("//div[contains(text(),'Hello undefined')]"), "Redirected Page");
    }
}
