package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Properties;

public class AmazonPage {


    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // C01_PageClassKullanimi (class'ina ait locate'leri aldik )

    // dropdown'dan "Computers" optionunu secin

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement ddm;

    // arama motoruna "Asus" yazıp aratın
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement aramaKutusu;

    // ikinci urunun fotografını cekin (ikinci urunun locate'i lazim)

    @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement ikinciUrun;

    //C02_Raporlama class'ina ait

    // sonuc yazisinin "Java" icerdigini test edin
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisi;













}
