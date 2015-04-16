package automationFramework;

    import java.util.concurrent.TimeUnit;
 
    import org.openqa.selenium.*;
 
    import org.openqa.selenium.firefox.FirefoxDriver;

 
public class SixTestCase {
 
    private static WebDriver driver = null;
 
    public static void main(String[] args) {
 
        // Create a new instance of the Firefox driver
    	//1) Launch New Browser
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
        //2) Open URL “http://www.toolsqa.com/automation-practice-switch-windows/”
        driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
        
        //3) Get Window name (Use GetWindowHandle command)
        
        //4) Click on Button “New Message Window”, it will open a Pop Up Window

        //5) Get all the Windows name ( Use GetWindowHandles command)

        //6) Close the Pop Up Window (Use Switch Command to shift window)
        
        
    }
}