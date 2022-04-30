package april30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SeleniumDemo {


    //Selenium - library that helps us to write code to interact with the web browser, UI testing tool


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Downloads/chromedriverNew");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/downloads/");


    //  SearchContext -> WebDriver -> RemoteWebDriver -> ChromeDriver/FirefoxDriver.etc

        String pageSource = driver.getPageSource();

        System.out.println(pageSource.contains("Downloads"));



//        driver.navigate().to("https://www.selenium.dev/documentation/");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();


//        WebElement dsc = driver.findElement(By.xpath("dsc")); //org.openqa.selenium.NoSuchElementException
//
//        List<WebElement> dsds = driver.findElements(By.name("dsds"));  // returns an empty list
//
//        if(dsds.size()==0){
//            throw new RuntimeException("FindElements didn't find matching element");
//        }


        driver.findElement(By.xpath("//a")).click();

        List<WebElement> links = driver.findElements(By.xpath("//a"));

        System.out.println(links.size());
        for (WebElement link : links) {
            System.out.println(link.getText());
        }



    }
}
