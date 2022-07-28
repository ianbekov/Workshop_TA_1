package com.epam.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo (String pageURL) {
        this.driver.get(pageURL);
    }

    public String getTitle () {
        return driver.getTitle();
    }
}
