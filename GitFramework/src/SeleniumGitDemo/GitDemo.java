package SeleniumGitDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitDemo {

	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GitDemo gd = new GitDemo();
		gd.launchBrowser();
	}

}
