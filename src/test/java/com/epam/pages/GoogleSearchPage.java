package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchPage  extends BasePage{

    public static final String PAGE_URL = "https://google.com";


    private String searchBarLocatorXpath = "//input[@name='q']";
    private String searchButtonLocatorXpath = "//input[@aria-label='Google Search']";
    private String clearButtonLocatorXpath = "//div[@aria-label='Clear']";

    public GoogleSearchPage (WebDriver driver) {
        super(driver);
    }

    public void typeSearchQueryInSearchBar(String query) {
        WebElement input = driver.findElement(By.xpath(searchBarLocatorXpath));
        input.sendKeys(query);
    }

    public void searchAndPressEnter(String searchQuery) {
        typeSearchQueryInSearchBar(searchQuery);
        driver.findElement(By.xpath(searchBarLocatorXpath)).sendKeys(Keys.ENTER);
    }

    public void searchAndPressSearchButton(String searchQuery) {
        typeSearchQueryInSearchBar(searchQuery);
        List<WebElement> googleSearchButtons = driver.findElements(By.xpath(searchButtonLocatorXpath));
        System.out.println(googleSearchButtons.size());
        for (WebElement button : googleSearchButtons) {
            if (button.isDisplayed()) {
                button.click();
            }
        }
    }

    public void clearSearchBar() {
        WebElement clearButton = driver.findElement(By.xpath(clearButtonLocatorXpath));
        clearButton.click();
    }
}
