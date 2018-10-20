package generic;	

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase{
	public static WebDriver driver = null;
	public static WebElement element = null;
	
	
	public static void InitializeSuite(){
		File file = null;
		try{
			killProcess("chromedriver.exe");
		}catch(Exception e1){
			e1.printStackTrace();
		}
		file = new File("src\\main\\resources\\utilities\\chromedriver.exe");
		System.setProperty("webdriver.driver.chrome", file.getAbsolutePath());
		ChromeOptions o = new ChromeOptions();
		o.addArguments("disable-extensions");
		o.addArguments("--start-maximized");
		TestBase.driver = new ChromeDriver();
	}
	
	public static void CloseTest(){
		if(TestBase.driver != null){
			TestBase.driver.quit();
		}
	}
	
	// kill all the given process with a given name
			public static void killProcess(final String processName) throws Exception{
				if(isRunning(processName)){
					getRuntime().exec("taskkill/F/IM"+processName);
					
				}
			}
			private static boolean isRunning(final String processName)throws Exception{
				Process listTaskProcess = getRuntime().exec("tasklist");
				BufferedReader tasksListReader = new BufferedReader(new InputStreamReader(listTaskProcess.getErrorStream()));
				
				String tasksLine;
				while((tasksLine = tasksListReader.readLine()) != null){
					if(tasksLine.contains(processName)){
						return true;
					}
				}
				return false;
			}
			private static Runtime getRuntime(){
				return Runtime.getRuntime();
			}
}
	
	
	/*public class TestBase {
		
		public static WebDriver driver;
		public static DesiredCapabilities ieCapabilities = null;
		
		public static void InitializeSuite(){
			File file = null;
			ReadConfigFile.readConfig();
			//set the browser
			String browservalue = ReadConfigFile.browserType;
			String urlval = ReadConfigFile.url;
			
			switch (browservalue) {
			case "IE":
				TestBase.ieCapabilities = DesiredCapabilities.internetExplorer();
				TestBase.ieCapabilities.setCapability("nativeEvents", true);
				TestBase.ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
				TestBase.ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
				TestBase.ieCapabilities.setCapability("disable-popup-blocking", true);
				TestBase.ieCapabilities.setCapability("enablePersistentHover", true);
				TestBase.ieCapabilities.setCapability("cssSelectorEnabled", true);
				TestBase.ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				TestBase.ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
				file = new File("src\\main\\resources\\iedriver.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				TestBase.driver = new InternetExplorerDriver(TestBase.ieCapabilities);			
				break;
				
			case "CHROME":
				try{
					killProcess("chromedriver.exe");
				}catch(Exception e1){
					e1.printStackTrace();
				}
				file = new File("src\\main\\resources\\chromedriver.exe");
				System.setProperty("webdriver.driver.chrome", file.getAbsolutePath());
				ChromeOptions o = new ChromeOptions();
				o.addArguments("disable-extensions");
				o.addArguments("--start-maximized");
				TestBase.driver = new ChromeDriver();
				break;
				
			case "HEADLESS":
				TestBase.driver= new HtmlUnitDriver();
				break;
			case "FIREFOX":
				TestBase.driver = new FirefoxDriver();
				break;
			case "EDGE":
				TestBase.driver = new EdgeDriver();
			}
			
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			// launch the URL
			TestBase.driver.get("urlval");
			TestBase.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			// Get the required test data
			// String 
			//testdatafile = "src\\test\\testdata\\"+getclass().getsimpleName()+"
		}
		
		public static void CloseTest(){
			if(TestBase.driver != null){
				TestBase.driver.quit();
			}
		}
		
		// kill all the given process with a given name
		public static void killProcess(final String processName) throws Exception{
			if(isRunning(processName)){
				getRuntime().exec("taskkill/F/IM"+processName);
				
			}
		}
		private static boolean isRunning(final String processName)throws Exception{
			Process listTaskProcess = getRuntime().exec("tasklist");
			BufferedReader tasksListReader = new BufferedReader(new InputStreamReader(listTaskProcess.getErrorStream()));
			
			String tasksLine;
			while((tasksLine = tasksListReader.readLine()) != null){
				if(tasksLine.contains(processName)){
					return true;
				}
			}
			return false;
		}
		private static Runtime getRuntime(){
			return Runtime.getRuntime();
		}
		

	}


}*/
