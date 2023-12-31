package tests.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C03_SoftAssert extends TestBase {
    // "https://amazon.com" sayfasına gidiniz
    // Title'in "Amazon" icerdigini test edin
    // Arama kutusunun erisilebilir oldugunu test edin
    // Arama kutusuna nutella yazıp aratın
    // Sonuc yazısının gorunur oldugunu test edin
    // Sonuc yazısının "Nutella" icerdigini test edin
    // test islemlerini softAssert ile yapınız ve hatalar icin mesaj versin


    @Test
    public void test01() {

        // "https://amazon.com" sayfasına gidiniz
        driver.get("https://amazon.com");

        // Title'in "Amazon" icerdigini test edin
        SoftAssert softAssert = new SoftAssert();
        //NOT:Soft assert instance oldugu icin (yani static degil) ilk once obje olusturulur
        String amazonTitle = driver.getTitle();
        softAssert.assertTrue(amazonTitle.contains("Amazon"),"TITLE AMAZON ICERMIYOR");

        // Arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"ARAMA KUTUSUNA ERISILEMIYOR");

        // Arama kutusuna nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        // Sonuc yazısının gorunur oldugunu test edin
        WebElement sonucYazisi =  driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYazisi.isDisplayed(),"SONUC YAZISI GORUNMUYOR");

        // Sonuc yazısının "Nutella" icerdigini test edin
        softAssert.assertTrue(sonucYazisi.getText().contains("Nutella"),"SONUC YAZISI NUTELLA ICERMIYOR");

        softAssert.assertAll();
        //assertAll() yazip tum hatalari listelemesini istemeliyiz. Aksi halde hata vermez.

    }

    /*
    Junit'te assert kullandigimizda assert failed oldugu anda test calismayi durduruyordu
    ve geri kalan kodlari calistirmiyordu

    TestNG de hem Assert hem softAssert yapilari var.
    Test sonuna kadar calissin testin sonunda tum hatalari listelesin istiyorsak softAssert kullaniriz
     */

    /*
    softAssert'un hata bulsa bile calismaya devam etme ozelligi softAssert.assertAll() 'a kadardir
    eger softAssert.assertAll() 'da hata bulunursa calisma durur ve classin kalan kismi calismaz

     */
}


