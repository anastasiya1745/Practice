package hillel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class DriverSingleton {

    private static WebDriver driver;

    private DriverSingleton(){}
        public static WebDriver getDriver() {
            if (driver == null){



                ChromeOptions chromeOptions = new ChromeOptions();
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("download.default_directory", Paths.get( "target").toFile().getAbsolutePath());
                chromeOptions.setExperimentalOption("prefs", prefs);
                driver = new ChromeDriver(chromeOptions);
            }
            return driver;
        }

    }

