import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cauba {
        ChromeDriver chromeDriver;
            @BeforeEach

            public void setUp(){
                WebDriverManager.chromedriver().setup();
                chromeDriver = new ChromeDriver();

            }
            @Test
            public void test(){
                chromeDriver.get("https://vitimex.com.vn/dang-ky.html");
                WebElement inputName = chromeDriver.findElement(By.xpath("//input[@id='name']"));
                inputName.sendKeys("Sy Nguyen");
                WebElement inputPhone = chromeDriver.findElement(By.xpath("//input[@id='phone']"));
                inputPhone.sendKeys("0867909651");
                WebElement inputEmail = chromeDriver.findElement(By.xpath("//input[@id='email']"));
                inputEmail.sendKeys("synguyen1346ck@gmail.com");
                WebElement inputMkhau = chromeDriver.findElement(By.xpath("//input[@id='pass-regis']"));
                inputMkhau.sendKeys("1234");
                WebElement inputXNMkhau = chromeDriver.findElement(By.xpath("//input[@id='pass-confirm']"));
                inputXNMkhau.sendKeys("1234");
                WebElement btnDk = chromeDriver.findElement(By.xpath("//a[@id='register-btn']"));
                btnDk.click();




//              chromeDriver.get("https://vitimex.com.vn/dang-nhap.html");
//              WebElement inputEmailhoacSDT = chromeDriver.findElement(By.xpath("//input[@id='account']"));
//              inputEmailhoacSDT.sendKeys("synguyen1346ck@gmail.com");
//              WebElement inputMK = chromeDriver.findElement(By.xpath("//input[@id='pass']"));
//              inputMK.sendKeys("1234");
//
//              WebElement btnDN = chromeDriver.findElement(By.xpath("//a[@id='signin-btn']"));
//              btnDN.click();
            }
}
