package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class testeWeb {

    @Test
    public void primeiroTeste(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chronosacademy.com.br");
        String xpathtitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathtitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo ? Conhecimento", titulo);
        driver.quit();

            }
}

