package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchPage {

    private WebDriver driver;

    public GoogleSearchPage (WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo () {
        driver.get("https://www.google.co.in/");
    }

    public void search(String searchQuery) {
        WebElement input = driver.findElement(By.xpath("//input[@name='q']"));
        input.sendKeys(searchQuery);
        List<WebElement> googleSearchButtons = driver.findElements(By.xpath("//input[@aria-label='Google Search']"));
        System.out.println(googleSearchButtons.size());
        for (WebElement button : googleSearchButtons) {
            if (button.isDisplayed()) {
                button.click();
            }
        }
    }
}
