package cigniti.automation.utilities;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Driver {
	RemoteWebDriver driver;
	
	private  WebDriverWait browserWait;
	public  RemoteWebDriver browser=null;
	private DesiredCapabilities dc = new DesiredCapabilities();
    public RemoteWebDriver getWebDriver() { return this.browser; }
    public void setWebDriver(RemoteWebDriver browser) { this.browser = browser; }
    public WebDriverWait getWebDriverWait() { return this.browserWait; }
    public void setWebDriverWait(WebDriverWait browserWait) { this.browserWait = browserWait; }
    public  RemoteWebDriver StartBrowser(BrowserTypes browserType,int defaultTimeOut) throws MalformedURLException
    {    
    	try {
		if(browser == null) {		
        switch (browserType)
        {
            case Firefox:
            	browser = new FirefoxDriver();  
                browserWait = new WebDriverWait(browser, defaultTimeOut);
                browser.manage().deleteAllCookies();
        		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        		browser.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        		browser.manage().window().maximize();	
                break;
            case InternetExplorer:
                break;
            case Chrome:
            	System.setProperty("webdriver.chrome.driver", "C:\\Walmart\\chromedriver_win32\\chromedriver.exe");
            	browser = new ChromeDriver();
            	browserWait = new WebDriverWait(browser, defaultTimeOut);
                browser.manage().deleteAllCookies();
        		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        		browser.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        		browser.manage().window().maximize();	
                break;
            case Windows:
            	//System.setProperty("webdriver.chrome.driver", "C:\\Walmart\\chromedriver_win32\\chromedriver.exe");
            	
            	//DesiredCapabilities appCapabilities = new DesiredCapabilities();
            	dc.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
            	dc.setCapability("platformName", "Windows");
            	//dc.setCapability("appArguments", "MyTestFile.txt");
            	//dc.setCapability("appWorkingDir", "C:\\MyTestFolder\\");
            	//Driver.browser =  new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4727"), dc);
            	browser.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            	browser.findElementByName("Nine").click();
            	browser.findElementByName("Seven").click();
            	browser.findElementByName("Multiply by").click();
            	//Driver.browser.
            //	Driver.browser = new ChromeDriver();
                break;
            case Andriod:
            	//dc.setCapability(MobileCapabilityType.UDID, "52039761c0eaa3c9");
            	//dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
            	//dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
            	//Driver.browser = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
            	//.browser.getKeyboard().sendKeys("admin");
            	//Driver.browser.findElement(By.xpath("//*[@id='passwordTextField']")).click();
            	//Driver.browser.findElement(By.xpath("//*[@id='passwordTextField']")).sendKeys("admin");
            	//Driver.browser.findElement(By.xpath("//*[@text='Login']")).click();
            	
            default:
                break;
        }
        
		}
    	}
    	catch(Exception ex) {
    	//	String s = ex.getMessage();
    	}
    	
		
    	return browser;
    }
    public  void StopBrowser()
    {    
    	browser.quit();
    	browser = null;
    	browserWait = null;
    }
	
}

