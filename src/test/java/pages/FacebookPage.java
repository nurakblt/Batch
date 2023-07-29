package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // kullanıcı email kutusuna rastgele bir isim yazın
    @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")
    public WebElement emailKutusu;


    // kullanıcı sifre kutusuna rastgele bir password yazın
    @FindBy(xpath = "//input[@id='pass']")
    public WebElement sifreKutusu;

    // giris yap butonuna tıklayın
    @FindBy(xpath = "//button[@id='u_0_5_Ua']")
    public WebElement girisYapButonu;

    // lutfen bu hesabı baska sekilde tanımla yazı elementinin, gorunur oldugunu test edin
    @FindBy(xpath = "//*[@class='_9ay7']")
    public WebElement girdiginSifreYanlisYaziElementi;

}
