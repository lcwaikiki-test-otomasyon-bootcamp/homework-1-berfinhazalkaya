import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup(); // chrome driver'ı kurar
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //pencereyi maximize yapar
        driver.get("https://www.lcwaikiki.com/tr-TR/TR"); //lc waikiki sayfasına girer

        try {
            Thread.sleep(1500); //1.5 saniye bekler
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.className("header-dropdown-toggle")).click(); //Giriş yap butonuna tıklar
        driver.findElement(By.className("login-form__link")).click(); //Üye ol butonuna tıklar

        driver.findElement(By.name("RegisterFormView.RegisterEmail")).sendKeys("yanlismail@gmail.com"); //Mail kısmına yanlismail@gmail.com yazdırır

        try {
            Thread.sleep(1500); //1.5 saniye bekler
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.name("RegisterFormView.Password")).sendKeys("123"); //Şifre kısmına 123 yazdırır

        try {
            Thread.sleep(1000); //1 saniye bekler
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       driver.findElement(By.className("ml-5")).click(); // Şifreyi girdiğimiz kısımda gizle butonuna basarak şifreyi görünür hale getirir

        try {
            Thread.sleep(2000); //1 saniye bekler
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement TxtBoxContent = driver.findElement(By.className("field-validation-error"));
        System.out.println(TxtBoxContent.getText()); //Hata mesajını konsola yazdırır

        driver.close(); // Sekmeyi Kapatır





    }
}
