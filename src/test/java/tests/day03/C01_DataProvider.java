package tests.day03;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProvider {


    // amazon sayfasına gidelim
    // Nutella, Java, cigdem ve Netherlands icin arama yapalım
    // sonucların aradıgımız kelime icerdigini test edelim
    // sayfayı kapatalım

    @DataProvider
    public static Object[][] AranacakKelimeler() {

        Object[][] arananKelimeArrayi = {{"Nutella"},{"Java"},{"cigdem"},{"Netherlands"}};

        return arananKelimeArrayi;
    }



    @Test(dataProvider = "AranacakKelimeler")
    // veri saglayıcısı demek

    // arayacagımız kelimeleri bir liste gibi tutup
    // bana yollayacak bir veri saglayıcısı olusturduk.


    public void test01(String arananKelime) {

        // amazon sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));



        // Nutella, Java, cigdem ve Netherlands icin arama yapalım
        AmazonPage amazonPage = new AmazonPage();

        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);




        // sonucların aradıgımız kelime icerdigini test edelim
        String expectedKelime = arananKelime;
        String actuelSonucYazisi = amazonPage.sonucYazisi.getText();

        Assert.assertTrue(actuelSonucYazisi.contains(expectedKelime));



        // sayfayı kapatalım
        Driver.closeDriver();

    }
}