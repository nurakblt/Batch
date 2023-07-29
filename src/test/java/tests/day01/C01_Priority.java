package tests.day01;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_Priority extends TestBase {

    // amazon isimli bir test methodu olusturunuz. Ve amazona gidiniz
    // bestbuy isimli bir test methodu olusturunuz. Ve bestbuy'a gidiniz
    // techproeducation isimli bir test methodu olusturunuz. Ve techproeducation'a gidiniz
    // once techproeducation, sonra amazon, sonra bestbuy test methodu calısacak sekilde sıralama yapınız


    @Test(priority = 1)
    public void amazon() {
        driver.get("https://www.amazon.com");
    }

    @Test(priority = 2)
    public void bestbuy () {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproeducation() {
        driver.get("https://www.techproeducation.com");
    }

    //TestNG test methodlarini isim sirasina gore calistirir.
    //Eger isim siralamasinin disinda bir siralama ile calismasini isterseniz
    // o zaman test methodlarina oncelik yani priority tanimlayabiliriz.

    // Priority kucukten buyuge dogru calisir. Eger bir test methoduna priorty degeri atanmamissa
    //defoult olarak priority 0 (sifir) kabul edilir

}
