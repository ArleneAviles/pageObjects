package com.imdb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {


    //atributes
    private WebDriver driver;
    private WebDriverWait wait;

    WebElement logoImdb; // id="home_img"
    WebElement campoBusqueda; //name="q"
    WebElement botonBusqueda;  //id="suggestion-search-button"
    WebElement botonSignIn; //css=".imdb-header__signin-text"
    WebElement labelNombreUsuario; // css="label.imdb-header__account-toggle--logged-in ~ label"

    //Constructor
    public HomePage(WebDriver driverBaseTest) {
        this.driver = driverBaseTest;
        wait = new WebDriverWait(driver,30);
    }

    //comportamiento
    public void navegar(String url) {
        driver.get(url);
    }

    public void verificarPagina() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("home_page")));
    }

    public void clickSignIn(){
        botonSignIn = driver.findElement(By.cssSelector("..imdb-header__signin-text"));
        botonSignIn.click();
    }

    public void verificarNombreUsuario(String name){

    }

    public void searchMovie(String it) {
    }

    public void searchSeries(String nombreSerie){

    }

    //verificarLogin(x)

}
