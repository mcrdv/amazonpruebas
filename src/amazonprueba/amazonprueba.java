package amazonprueba;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;

public class amazonprueba {

    public static void main(String[] args) {
        //INICIALIZACION DE SYSTEM.SETPROPERTY()//
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // busqueda en el navegador
        driver.get("https://www.amazon.com.mx");

        //seleccionar el dropdown
        WebElement Searchdropdown = driver.findElement(By.id("searchDropdownBox"));
        Searchdropdown.click();

        //seleccionar videojuegos en el dropdown
        //Select videojuegos = new Select(Searchdropdown);
        //videojuegos.deselectAll();
        //videojuegos.selectByValue("search-alias=videogames");

            //se busca el textbox de busqueda//
          WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        //agregar la busqueda en el textbox//
        searchBox.sendKeys("resident evil");


         //Clic en el boton buscar
         WebElement searchButton = driver.findElement(By.id("input"));

         searchButton.click();



    }
}