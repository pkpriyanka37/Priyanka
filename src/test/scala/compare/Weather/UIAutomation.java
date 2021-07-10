package compare.Weather;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIAutomation {
	
	WebDriver driver;
	
	public Weather getUIData()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurabh\\eclipse-workspace\\Weather\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();  
        driver.get("https://www.accuweather.com/");   
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@class='search-input']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//*[@class='icon-search search-icon']")).click();
        driver.findElement(By.xpath("//span[@class='cur-con-weather-card__cta']/span[text()='More Details']")).click();
        String temp = driver.findElement(By.xpath("//div[@class='display-temp']")).getText();
        String humid = driver.findElement(By.xpath("//div[text()='Humidity']/ancestor::div[1]/div[2]")).getText();
        System.out.println("From UI  temp-"+temp+" Humidity-"+humid);
        
        Weather obj1= new Weather();
        obj1.setTemp(temp.substring(0, temp.length()-2));
        obj1.setHumid(humid.substring(0,humid.length()-1));
        return obj1;
        
        
        
	}
        
       
}
