package repasoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class reviewSelenium {

    public static void main(String[] args) throws InterruptedException {

        //Configurar una propiedad para enlazar el browser al driver

        String rutaproyecto = System.getProperty ("user.dir");

        String rutadriver = "\\src\\test\\resources\\Drivers\\chromedriver.exe";

        //Configurar el driver de google chrome

        System.setProperty("webdriver.chrome.driver",rutaproyecto+rutadriver);

        //instaciar un browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://open.spotify.com/?");

        try {
            Thread.sleep(5000);
        } catch (Exception e){
            System.out.println("Ocurrio un problema");
        }

        driver.close();



    }
}
